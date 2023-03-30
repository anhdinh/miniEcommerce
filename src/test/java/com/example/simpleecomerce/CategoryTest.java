package com.example.simpleecomerce;

import com.example.simpleecomerce.entity.Category;
import com.example.simpleecomerce.repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CategoryTest {

    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    void contextLoads() {
    }


    @Test
    @Transactional
    public void addCategoryTest(){
        Category category =  new Category();
        category.setCategoryName("XAOMI");
        category.setImage("https://assets.stickpng.com/images/6102dadda849c40004f9a13b.png");
        category.setActive(true);
        categoryRepository.save(category);
    }

    @Test
    @Transactional
    public void updateCategoryTest(){
        Optional<Category> categoryOptional =  categoryRepository.findCategoriesByCategoryName("samsung ");
        Category  category = categoryOptional.get();
        category.setImage("https://cdn-icons-png.flaticon.com/512/882/882747.png");
        categoryRepository.save(category);
    }

    @Test
    @Transactional
    public void deleteCatTest(){
        Optional<Category> categoryOptional =  categoryRepository.findById(7L);
        Category category= categoryOptional.get();
        category.setActive(false);
        categoryRepository.save(category);
    }


    @Test
    public void testGetProductsByAllCatagories(){
        categoryRepository.findCategoriesByActiveTrue();
    }



}
