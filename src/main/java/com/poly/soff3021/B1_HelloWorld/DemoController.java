package com.poly.soff3021.B1_HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    // Tat ca class duoc danh la @Controller => Day la tang trung gian
    // trao doi giua client(FE) vs server (BE)
    // TAT CA CAC HAM TRONG CONTROLLER LUON LUON TRA VE 1 STRING
    // TAT CAC CLASS DEU NAM TRONG CLASS => SPRING BOOT
    // => SPRING BOOT NHAN TAT CA CLASS TRONG DAY LA 1 BEAN
    // singleton

    // return ten cua file muon hien thi giao dien

    // CLIENT <=> SERVER
    // trao doi thong qua phuong thuc HTTP (HTTP methods)
    // GET, POST, PUT, DELETE
    // TUY NHIEN VS J4, J5: chi lam viec vs 2 phuong GET, POST
    // GET: Hien thi
    // POST: Xu ly
    @GetMapping("/xin-chao")
    public String hienThiGiaoDien(Model model){
        String mess = "hihihihi1242341";
        // Day gia tri tu controller -> jsp
        // J4: request.setAttribute(,)
        // J5: Model
        model.addAttribute("a1",mess);
        return "a";
    }
}
