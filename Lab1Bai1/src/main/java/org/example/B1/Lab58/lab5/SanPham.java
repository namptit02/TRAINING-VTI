package org.example.B1.Lab58.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
