import java.util.Scanner;

public class TUGASno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargatiket = 50000;
        int totaltiket = 0;
        double totalpenjualan = 0;
        int hari = 1;

        do{
            System.out.println("Hari-" + hari);
            System.out.print("Masukan Jumlah Tiket Anda :");
            int jumlahtiket = sc.nextInt();
            if(jumlahtiket < 0){
                System.out.println("Jumlah Tiket Tidak Valid, Mohon Coba Lagi!");
                continue;

            }
            if (jumlahtiket == 0) {
                break;
            }
            double hargaTotal = jumlahtiket * hargatiket;
            double diskon = 0;

            if(jumlahtiket > 10) {
                diskon = 0.15;
            }else if (jumlahtiket > 4) {
                diskon = 0.10;
            }
            
            double totalBayar = hargaTotal - (hargaTotal * diskon);
            
            totaltiket += jumlahtiket;
            totalpenjualan += totalBayar;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
            System.out.println();

            hari++;

        } while (true);

        
        System.out.println("=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totaltiket);
        System.out.println("Total penjualan: Rp " + totalpenjualan);
    }
}
