import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class soalSusah2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt(); 

        int[] arr = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        if (!duplicates.isEmpty()) {
            System.out.print("Array memiliki duplikat elemen: ");
            for (int num : duplicates) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Tidak ada elemen duplikat dalam array.");
        }
    }
}
