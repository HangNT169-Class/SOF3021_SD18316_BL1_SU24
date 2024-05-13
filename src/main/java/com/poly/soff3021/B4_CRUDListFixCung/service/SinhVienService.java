package com.poly.soff3021.B4_CRUDListFixCung.service;

import com.poly.soff3021.B4_CRUDListFixCung.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien>lists = new ArrayList<>();

    public SinhVienService() {
        // Add phan tu vao list
        lists.add(new SinhVien("ma01","nguyen van a",22,"hanoi",true));
        lists.add(new SinhVien("ma02","nguyen van b",28,"hanoi",false));
        lists.add(new SinhVien("ma03","nguyen thi c",22,"hanoi",true));
        lists.add(new SinhVien("ma04","nguyen van a",18,"hanoi",false));
        lists.add(new SinhVien("ma05","nguyen van a",22,"hanoi",true));
    }

    public List<SinhVien>getAll(){
        return lists;
    }

    public void addSinhVien(SinhVien sv){
        lists.add(sv);
    }

    public void xoaSinhVien(String maSV){
       for(int i = 0 ; i < lists.size();i++){
           // neu tim thay doi tuong sv can xoa
           if(lists.get(i).getMssv().equalsIgnoreCase(maSV)){
               lists.remove(i); // tim thay thi xoa
           }
       }
    }

    public void updateSinhVien(String maSV, SinhVien newSinhVien){
        for(int i = 0 ; i < lists.size();i++){
            // neu tim thay doi tuong sv can xoa
            if(lists.get(i).getMssv().equalsIgnoreCase(maSV)){
               lists.set(i,newSinhVien); // Update doi tuong o vi tri tim thay
            }
        }
    }

    public SinhVien updateSinhVien(String maSV){
        for(int i = 0 ; i < lists.size();i++){
            // neu tim thay doi tuong sv can xoa
            if(lists.get(i).getMssv().equalsIgnoreCase(maSV)){
                return lists.get(i);
            }
        }
        return null; // Khong tim thay doi tuong SV
    }
}
