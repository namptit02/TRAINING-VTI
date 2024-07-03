package org.example;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return donGia * 10 / 100;
    }
//    SanPham sp =new SanPham();

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin san pham");

        System.out.println("Nhap ten san pham:");
        setTenSp(sc.nextLine());

        System.out.println("Nhap don gia:");
        setDonGia(sc.nextDouble());

        System.out.println("Nhap giam gia:");
        setGiamGia(sc.nextDouble());
    }

    //    public void nhapKoCoGiamGia(){
//        System.out.println("Nhap thong tin san pham");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap ten sp");
//        this.tenSp = sc.nextLine();
//        System.out.println("Nhap don gia");
//        this.donGia = sc.nextDouble();
////        System.out.println("nhap giam gia");
////        this.giamGia = sc. nextDouble();
//
//    }
    public void xuat() {
        System.out.println("Ten san pham: " + getTenSp());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Giam gia: " + getGiamGia());
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
