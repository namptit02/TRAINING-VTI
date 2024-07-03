package org.example;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("An 1 de giai pt bac 1 ");
        System.out.println("An 2 de giai pt bac 2 ");
        System.out.println("An 3 de tinh tien dien ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                giaiPhuongTrinhBacNhat();
                break;
            case 2:
                giaiPhuongTrinhBacHai();
                break;
            case 3:
                tinhTienDien();
                break;
            default:
                System.out.println("thoat");
                break;
        }

    }

    public static void giaiPhuongTrinhBacNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo os nghiem");
            } else {
                System.out.println("Pt vo no");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("pt co nghiem duy nhat x= " + x);
        }
    }

    public static void giaiPhuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
//        System.out.println(canDelta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiep");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + -b / (2 * a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
            System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));


        }
    }

    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien");
        int soDien = sc.nextInt();
        int tiendien;
        System.out.println("tien dien la: ");
        if (soDien < 50) {
            tiendien = soDien * 1000;
        } else {
            tiendien = soDien * 1000 + (soDien - 50) * 1200;
        }
        System.out.println(tiendien);
    }



}
