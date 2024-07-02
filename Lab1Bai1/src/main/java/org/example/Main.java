package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Viết chương trình cho  phép  nhập  họ và tên sinh viên, điểm trung  bình từ
//        bàn phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.



        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên");
        String hoTen = sc.nextLine();
        System.out.println("Điểm");
        Double diem = sc.nextDouble();
        System.out.print(hoTen+" "+diem+" điểm");


    }
}
