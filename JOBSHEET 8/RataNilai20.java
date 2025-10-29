import java.util.Scanner;
public class RataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai,nilai,rataNilai;
        for(int j=1 ; j<=5; j++){
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke-" + j);
            for(int k=1 ; k<=5 ; k++){
            System.out.print("Masukan nilai ke- " + k + "=");
            nilai = sc.nextFloat();
            totalNilai += nilai;


        }
        rataNilai=totalNilai/5;
        System.out.println("Rata-rata mahasiswa ke- " + j + " adalah " + rataNilai);


    }
    
}
}
