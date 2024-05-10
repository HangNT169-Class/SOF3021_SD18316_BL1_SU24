package com.poly.soff3021.B3_SpringValidationVaRequest.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DangKyRequest {

    private String username;

    private int tuoi;

    private String diaChi;

    private String password;

    private String confirmPass;

}
