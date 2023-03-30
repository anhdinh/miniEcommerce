package com.example.simpleecomerce.controller;


import com.example.simpleecomerce.controller.dto.CatDto;
import com.example.simpleecomerce.entity.Category;
import com.example.simpleecomerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<CatDto> getCategories(){
       Set<Category> categories = categoryService.getAllCategoriesIsActive();
       CatDto catDto =  new CatDto();
       catDto.setCategories(categories);
       return  new ResponseEntity<>(catDto, HttpStatus.OK);
    }



}
