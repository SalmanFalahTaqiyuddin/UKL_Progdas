package Soalbeneran;

import java.util.Scanner;


public class soal12w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        float angka = scanner.nextFloat();
        float hasil = angka % 2;
        System.out.println(hasil);
        
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        }else {
            System.out.println(angka + " adalah bilangan ganjil");
        
        }
    }
}
