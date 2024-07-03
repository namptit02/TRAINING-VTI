package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab3Bai3 {
    //    Viết chương trình nhập mảng số nguyên từ bàn phím.
//    Sắp xếp và xuất mảng vừa nhập ra màn hình.
//    Xuất phần tử có giá trị nhỏ nhất ra màn hình
//    Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tongChiaHetCho3 = 0;
        int dem = 0;

        Arrays.sort(arr);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
            if (arr[j] % 3 == 0) {
                tongChiaHetCho3 += arr[j];
                dem++;
            }
        }
        System.out.println();

        System.out.println("Phan tu nho nhat: " + arr[0]);
        System.out.println("Trung binh cong cac so chia het cho 3: " + tongChiaHetCho3 / dem);

    }
}
