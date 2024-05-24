package com.poly.soff3021.B8_JPA.controller;

import com.poly.soff3021.B8_JPA.entity.Category1;
import com.poly.soff3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // rest full API
public class Category1Controller {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("a1") // Tra ra json / xml
    public List<Category1> getAll(@RequestParam(value = "abcd", required = false) String name) {
        return categoryRepository.findAll();
    }

    @GetMapping("a2")
    public String abc(){
        return "aaaaaaa";
    }

}
