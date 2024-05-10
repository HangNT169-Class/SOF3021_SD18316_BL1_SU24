package com.poly.soff3021.B3_SpringValidationVaRequest.controller;

import com.poly.soff3021.B3_SpringValidationVaRequest.request.DangKyRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DangKyController {

    @GetMapping("/sign-in")
    public String hienThiFormDangKy() {
        return "/buoi3/dangki";
    }

    @PostMapping("/home")
    public String hienThiKetQuaDangNhap(Model model, DangKyRequest request) {

        model.addAttribute("username", request.getUsername());
        model.addAttribute("tuoi", request.getTuoi());
        model.addAttribute("diaChi", request.getDiaChi());
        model.addAttribute("password", request.getPassword());
        model.addAttribute("confirmPass", request.getConfirmPass());
        return "buoi3/a";
    }
}
