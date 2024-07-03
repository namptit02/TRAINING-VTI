package org.example;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        //        BÀI 2 Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
//                Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap CD");
        double cd = sc.nextDouble();
        System.out.println("Nhap CR");
        double cr = sc.nextDouble();
        System.out.println("Chu vi HCN: " + (cd + cr) * 2 + " Dien tich HCN " + cd * cr + " Canh nho nhat HCN= "+Math.min(cd,cr));
    }

}
