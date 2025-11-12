import java.util.Scanner;

public class SearchNilaiXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan di input: ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();

        int indeks;
        for (indeks = 0; indeks < n; indeks++) {
            if (arrNilai[indeks] == key) {
                System.out.println("Nilai " + key + " ketemu di mahasiswa ke-" + (indeks+1));
                break;
            }
        }

        if (indeks == n) {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
    }
}


