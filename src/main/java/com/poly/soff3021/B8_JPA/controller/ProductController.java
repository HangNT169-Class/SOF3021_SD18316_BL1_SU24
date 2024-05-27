package com.poly.soff3021.B8_JPA.controller;

import com.poly.soff3021.B8_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/product/hien-thi")
    public String hienthiProduct(Model model) {
        model.addAttribute("list", repository.findAll());
        return "/buoi8/Product";
    }
}
