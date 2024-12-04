package Soalbeneran;

import java.util.Scanner;

public class soal21w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Input harus bilangan bulat positif.");
            return;
        }
       
        long faktorial = hitungFaktorial(n);
        System.out.println("Faktorial dari bilangan " + n + " adalah " + faktorial);
           }
           public static long hitungFaktorial(int n) {
            if (n==0) {
             return 1;
             } else {
             return n * hitungFaktorial(n-1);
        }
       
    }
}
