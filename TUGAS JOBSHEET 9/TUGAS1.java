import java.util.Scanner;
public class TUGAS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        int nilai = sc.nextInt();
        int nilaiMhs [] = new int [nilai];

        for(int i=0; i < nilai; i++){
        System.out.print("Masukan Nilai Mahasiswa ke- " + (i+1) + " : ");
        nilaiMhs [i] = sc.nextInt();

        }

        int totalNilai = 0;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        
        for(int i=0; i < nilai; i++){
        totalNilai += nilaiMhs[i];

        if(nilaiMhs[i] > tertinggi){
            tertinggi = nilaiMhs[i];
        }

        if(nilaiMhs[i] < terendah){
            terendah = nilaiMhs[i];
        }
    }

        double rata2 = totalNilai / nilai;

        System.out.println("SELURUH NILAI MAHASISWA");
        for(int i=0; i < nilai; i++){
            System.out.println("Nilai ke- " + (i+1) + " : " + nilaiMhs[i]);
    }
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        
    }
}

