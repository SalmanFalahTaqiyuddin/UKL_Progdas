package Soalbeneran;
import java.util.Random;
import java.util.Scanner;

public class soal23w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char operator;
        int bilangan1, bilangan2, jawabanBenar, jawabanUser;
        boolean lanjut = true;

        while (lanjut) {
           
            int pilihanOperator = random.nextInt(3);
            switch (pilihanOperator) {
                case 0:
                    operator = '*';
                    break;
                case 1:
                    operator = '/';
                    break;
                default:
                    operator = '%';
            }

          
            bilangan1 = random.nextInt(10) + 1;
            bilangan2 = random.nextInt(10) + 1;

            switch (operator) {
                case '*':
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                case '/':
                    jawabanBenar = bilangan1 / bilangan2;
                    break;
                default:
                    jawabanBenar = bilangan1 % bilangan2;
            }

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            jawabanUser = scanner.nextInt();

    
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Ingin melanjutkan? (y/n): ");
            String pilihan = scanner.next();
            lanjut = pilihan.equalsIgnoreCase("y");
        }
    }
}