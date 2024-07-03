package org.example.B1.Lab58.lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
    //    BÀI 2
//    Viết chương trình thực hiện các chức năng sau
//1.  Nhập danh sách họ và tên
//2.  Xuất danh sách vừa nhập
//3.  Xuất danh sách ngẫu nhiên
//
//4.  Sắp xếp giảm dần và xuất danh sách
//5.  Tìm và xóa họ tên nhập từ bàn phím
//6.  Kết thúc
    static ArrayList<String> danhSachHoTen = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menuu");
        while (true) {
            System.out.println(" 1.chuc nang nhap");
            System.out.println("2.Chuc nang xuat");
            System.out.println("3. chuc nang sap xep");
            System.out.println("4. Chuc nang ngau nhien");
            System.out.println("5. Chuc nang xoa");
            int chucNang = sc.nextInt();
            switch (chucNang) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngaunhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    xoa();
                    break;
                default:
                    System.exit(0);
            }

        }
    }

    static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        while (true) {
            String hoTen = scanner.nextLine();
            danhSachHoTen.add(hoTen);

            System.out.print("Nhap them Y/N");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    static void xuat() {
        System.out.println("DS Ho ten");
        for (String x : danhSachHoTen) {
            System.out.println(x);
        }
    }

    static void sapxep() {
        System.out.println("Xep ho ten giam dan");
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        for (String x : danhSachHoTen) {
            System.out.println(x);
        }
    }

    static void ngaunhien() {
        System.out.println("Sap xep ngau nhien");
        Collections.shuffle(danhSachHoTen);
        for (String x : danhSachHoTen) {
            System.out.println(x);
        }
    }

    static void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu muon xoa");
        while (true) {
            int n = scanner.nextInt();
            danhSachHoTen.remove(n);
            System.out.println("Nhap them Y/N");
            if (scanner.nextLine().equals("N") || scanner.nextLine().equals("n")) {
                break;
            }
        }

    }
}
