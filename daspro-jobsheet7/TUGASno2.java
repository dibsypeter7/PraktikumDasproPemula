import java.util.Scanner;

public class TUGASno2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);


        int jenis, durasi;
        double total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue;
            }

            System.out.print("Masukkan durasi parkir : ");
            durasi = sc.nextInt();

           
            if (durasi > 5) {
                total += 12500; 
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            
            }

            System.out.println("Total sementara: Rp " + total + "\n");

        } while (true);

        System.out.println("=== LAPORAN PENDAPATAN PARKIR ===");
        System.out.println("Total pendapatan hari ini: Rp " + total);
    }
}
    
