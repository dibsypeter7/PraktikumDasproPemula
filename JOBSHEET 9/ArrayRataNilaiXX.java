import java.util.Scanner;

public class ArrayRataNilaiXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt(); 
        int[] nilaiMhs = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for(int i = 0; i < n; i++){
            total += nilaiMhs[i];
            if(nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rata2 = total / n;
        double rataLulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("\nRata-rata nilai seluruh mahasiswa = " + rata2);
        System.out.println("Banyaknya mahasiswa yang lulus = " + jumlahLulus);
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);
    }
}

