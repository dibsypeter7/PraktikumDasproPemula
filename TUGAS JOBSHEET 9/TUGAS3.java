import java.util.Scanner;

public class TUGAS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", 
            "Ayam Geprek", 
            "Tahu Telor",
            "Nasi Padang", 
            "Lalapan", 
            "Matcha", 
            "Thai Tea",
            "Teh Tarik"
        };

        System.out.println("===== MENU KAFE =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println("======================");

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        System.out.println("\n=== Hasil Pencarian ===");
        if (ditemukan) {
            System.out.println("Pesananmu " + cari + " tersedia di menu.");
        } else {
            System.out.println("Pesananmu " + cari + " tidak ada di menu.");
        }
    }
}
