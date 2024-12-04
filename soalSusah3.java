import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class soalSusah3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt(); 

        int[] arr = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frekuensi = new HashMap<>();

        for (int num : arr) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1); //pmilihan ketua kelas
        }

        System.out.println("Frekuensi setiap elemen:");
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul sebanyak " + entry.getValue() + " kali");
        }
    }
}
