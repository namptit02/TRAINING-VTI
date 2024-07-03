package org.example.B1.Lab58.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    //    BÀI 1
//    Nhập danh sách số thực với số lượng tùy ý từ bàn phím
//    sau đó xuất danh sách vừa nhập và tổng của nó .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();
        System.out.println("So luong nhap vao");
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextDouble());
        }
        for(double x : arr) {
            System.out.println(x);
        }
    }

}
