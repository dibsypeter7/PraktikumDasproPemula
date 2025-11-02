import java.util.Scanner;

public class tugasnomer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang ikut: ");
        int jumlahPoli = sc.nextInt();
        sc.nextLine();
    
        for (int i = 1; i <= jumlahPoli; i++) {
            System.out.println("\n=== Data Politeknik ke-" + i + " ===");
            System.out.print("Nama Politeknik: ");
            String namaPoli = sc.nextLine();
            System.out.println("\n--- Data Atlet Politeknik " + namaPoli + " ---");

            System.out.println("\nCabang: Badminton");
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("    -> Atlet " + j + ": " + namaAtlet);
            }

            System.out.println("\nCabang: Tenis Meja");
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("    -> Atlet " + j + ": " + namaAtlet);
            }

            System.out.println("\nCabang: Basket");
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("    -> Atlet " + j + ": " + namaAtlet);
            }

            System.out.println("\nCabang: Bola Voli");
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("    -> Atlet " + j + ": " + namaAtlet);
            }
        }

        System.out.println("\n=== Data seluruh Politeknik sudah dimasukkan ===");
    }
}
