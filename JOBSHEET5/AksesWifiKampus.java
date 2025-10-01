import java.util.Scanner;

public class AksesWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis.equalsIgnoreCase("mahasiswa")) {
           
            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

    }
}