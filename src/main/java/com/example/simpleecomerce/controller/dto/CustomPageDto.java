package com.example.simpleecomerce.controller.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class CustomPageDto<T> {
    List<T> content;
    CustomPageable pageable;

    public CustomPageDto(Page<T> page) {
        this.content = page.getContent();
        this.pageable = new CustomPageable(page.getPageable().getPageNumber(),
                page.getPageable().getPageSize(), page.getTotalElements());
    }

    @Data
    class CustomPageable {
        int pageNumber;
        int pageSize;
        long totalElements;

        public CustomPageable(int pageNumber, int pageSize, long totalElements) {

            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
            this.totalElements = totalElements;
        }
    }
}