package org.example;

import java.util.Scanner;

public class Lab4Bai1 {
    public static void main(String[] args) {
        System.out.println("----------Lab4Bai1----------");
        //lab4bai1
//        SanPham sanPham = new SanPham();
//        sanPham.nhap();
//        sanPham.xuat();
        System.out.println("-------Lab4Bai2--------");
        //Lab4Bai2
//        System.out.println("Thong tin san pham la");
//        SanPham sp1 = new SanPham();
//        SanPham sp2 = new SanPham();
//        sp1.nhap();
//        sp2.nhap();
//        sp1.xuat();
//        sp2.xuat();
        System.out.println("-------Lap4Bai3--------");
        //lab4Bai3
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sp ko giam gia");
        String tenSp = sc.nextLine();
        System.out.println("Nhap gia sp ko giam gia");
        double donGia = sc.nextDouble();
        SanPham sp = new SanPham(tenSp, donGia);
        SanPham sp1 = new SanPham();
        sp1.nhap();
        System.out.println("Sp ko co giam gia");

        sp.xuat();
        System.out.println("SP co giam gia");

        sp1.xuat();
    }
}
