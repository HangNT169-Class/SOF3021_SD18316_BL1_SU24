package com.poly.soff3021.B2_LamViecVoiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String dangnhap() {
        return "Login";
    }

    @PostMapping("/ket-qua")
    public String hienThiKetQuaDangNhap(@RequestParam("fname")String username,
                                        @RequestParam("lname")String password, Model model){
        model.addAttribute("a",username);
        model.addAttribute("b",password);

        // Lay gia tri tu JSP(VIEW) => controller
        // J4: getParameter
        // J5: @RequestParam
        return "ket-qua";
    }

}
