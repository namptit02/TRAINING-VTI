package org.example.B1.Lab58.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {
    //    static SanPham sanPham = new SanPham();
    static ArrayList<SanPham> dsSanPham = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----menu-------");
            System.out.println("1.Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan theo gia va xuat man hinh");
            System.out.println("3. tim va xoa sp theo ten");
            System.out.println("4. xuat gia trung binh cua cac san pham");
            int chucNang = sc.nextInt();
            switch (chucNang) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxepgiamdan();
                    break;
                default:
                    System.exit(0);
            }
        }

    }

    static void sapxepgiamdan() {
        Collections.sort(dsSanPham, new Comparator<SanPham>() {

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getGia(), o1.getGia());
            }
        });
        for (SanPham x : dsSanPham) {
            System.out.println(x.getTen() + " " + x.getGia());
        }
    }

    static void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            SanPham sanPham = new SanPham();
            System.out.println("Nhap ten san pham:");
            sanPham.setTen(sc.nextLine());
            System.out.println("Nhap gia san pham:");
            while (true) {
                String giaStr = sc.nextLine();
                if (giaStr.equalsIgnoreCase("N")) {
                    return;
                }
                try {
                    sanPham.setGia(Double.parseDouble(giaStr));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Gia khong hop le, vui long nhap lai:");
                }
            }
            dsSanPham.add(sanPham);
            System.out.println("Nhap them san pham Y/N?");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
