package org.example;

import java.util.Scanner;

public class Lab3Bai1 {


    public static void main(String[] args) {
//        BÀI 1
//        Viết chương trình nhập một số nguyên
//        từ bàn phím và cho biết số đó có phải là số nguyên tố hay không
//        (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();
        if (checkSNT(n)){
            System.out.println("so nguyen to");
        }else {
            System.out.println("Ko phai so nto");
        }
    }
    static boolean checkSNT(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
