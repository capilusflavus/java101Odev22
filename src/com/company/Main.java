package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number=scanner.nextInt();
        int toplam =0;

        while (number!=0){
            toplam +=number%10;
            number/=10;


        }
        System.out.println("Girdiniz sayının basamak değerleri toplamı : " + toplam);
    }
}
