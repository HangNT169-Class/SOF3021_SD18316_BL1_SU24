package com.poly.soff3021.B8_JPA.controller;

import com.poly.soff3021.B8_JPA.entity.Category1;
import com.poly.soff3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/hien-thi-tat-ca")
    public String hienThi(Model model){
        List<Category1>lists = categoryRepository.findAll(); // get all <-> select * from
        // add hoac update
//        categoryRepository.save(doi tuong)
        // remove
//        categoryRepository.delete(doi tuong);
//        categoryRepository.deleteById(khoa chinh);
//        categoryRepository.findCategory1ByIdAndCategoryCode()
        model.addAttribute("lists1",lists);
        return "Category";
    }
}
