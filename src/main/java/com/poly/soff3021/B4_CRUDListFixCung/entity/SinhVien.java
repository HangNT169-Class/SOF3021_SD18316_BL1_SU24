package com.poly.soff3021.B4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SinhVien {

    private String mssv;

    private String ten;

    private int tuoi;

    private String diaChi;

    private boolean gioiTinh;

}
