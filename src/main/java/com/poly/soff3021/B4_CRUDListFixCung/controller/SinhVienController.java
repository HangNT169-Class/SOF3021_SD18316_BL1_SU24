package com.poly.soff3021.B4_CRUDListFixCung.controller;

import com.poly.soff3021.B4_CRUDListFixCung.entity.SinhVien;
import com.poly.soff3021.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {

    private SinhVienService service = new SinhVienService();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {
        model.addAttribute("listSinhVien", service.getAll());
        return "buoi4/sinhviens";
    }

    @GetMapping("/sinh-vien/view-add")
    public String hienThiTrangAdd() {
        return "buoi4/add-sinh-vien";
    }

    // C1: request param
    // C2: su dụng model attribute truyền vào đối tượng như bài trước
    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@RequestParam("mssv") String maSV,
                              @RequestParam("ten") String ten,
                              @RequestParam("tuoi") String tuoi,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("gioiTinh") String gioiTinh) {
        // Khoi tao 1 doi tuong
        SinhVien sv = new SinhVien(maSV, ten, Integer.valueOf(tuoi), diaChi, Boolean.valueOf(gioiTinh));
        // Goi ham add trong service
        service.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi"; // CHUYEN TOI 1 TRANG NAO DAY
    }

    @GetMapping("/sinh-vien/remove/{a}")
    public String xoaSinhVien(@PathVariable("a") String ma) {
        service.xoaSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/detail/{a}")
    public String detailSinhVien(@PathVariable("a") String ma, Model model) {
        SinhVien sv = service.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/view-update/{a}")
    public String viewUpdate(@PathVariable("a") String ma, Model model) {
        SinhVien sv = service.detailSinhVien(ma);
        model.addAttribute("sv1", sv);
        return "buoi4/update-sinh-vien";
    }

}
