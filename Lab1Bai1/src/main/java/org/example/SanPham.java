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
    private double getThueNhapKhau(){
        return donGia *10/100;
    }
    public void nhap(){
        System.out.println("Nhap thong tin san pham");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sp");
        this.tenSp = sc.nextLine();
        System.out.println("Nhap don gia");
        this.donGia = sc.nextDouble();
        System.out.println("nhap giam gia");
        this.giamGia = sc. nextDouble();

    }
    public void nhapKoCoGiamGia(){
        System.out.println("Nhap thong tin san pham");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sp");
        this.tenSp = sc.nextLine();
        System.out.println("Nhap don gia");
        this.donGia = sc.nextDouble();
//        System.out.println("nhap giam gia");
//        this.giamGia = sc. nextDouble();

    }
    public void xuat(){
//        System.out.println("Thong tin in ra man hinh la");
        System.out.println("Ten sp: " + tenSp);
        System.out.println("don gia: " + donGia);
        System.out.println("giam gia: "+ giamGia);
        System.out.println("thue nhap khau"+this.getThueNhapKhau());
    }
}
