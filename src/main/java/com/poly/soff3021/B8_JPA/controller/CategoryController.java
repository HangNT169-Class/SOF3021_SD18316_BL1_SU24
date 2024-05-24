package com.poly.soff3021.B8_JPA.controller;

import com.poly.soff3021.B8_JPA.entity.Category1;
import com.poly.soff3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
// Tang controller 2 cach danh dau :
// 1. @Controller => MVC
// 2. @RestController => MVC, 3 layer..
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/hien-thi-tat-ca")
    public String hienThi(Model model) {
        List<Category1> lists = categoryRepository.findAll(); // get all <-> select * from
        // add hoac update
//        categoryRepository.save(doi tuong)
        // remove
//        categoryRepository.delete(doi tuong);
//        categoryRepository.deleteById(khoa chinh);
//        categoryRepository.findCategory1ByIdAndCategoryCode()
        model.addAttribute("lists1", lists);
        return "Category";
    }

    @GetMapping("a") // Tra ra json / xml
    @ResponseBody
    public List<Category1> getAll() {
        return categoryRepository.findAll();
    }

    // Phan trang -> Pageable

    // 10 , 3 phan tu 1 trang
    // 1 -> 3 (0)
    // 2 -> 3 (1)
    // 3 -> 3
    // 4-> 1
    // 3 : 2
    // 0: 2
    // 1: 1
    // 2: 0
    @GetMapping("/phan-trang")
    @ResponseBody
    // pageNo : so trang mong muon (trang dau tien, trang thu 2..)
    // size: so phan tu tren 1 trang
    public List<Category1> hienThi(@RequestParam(value = "size", required = false, defaultValue = "2") Integer size,
                                   @RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, size);
        List<Category1> pageCate = categoryRepository.findAll(pageable).getContent();
        return pageCate;
    }
}
