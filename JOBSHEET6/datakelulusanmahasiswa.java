import java.util.Scanner;


public class datakelulusanmahasiswa {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("==== INPUT DATA MAHASISWA ====");
    System.out.print("NAMA :");
    String NAMA = sc.nextLine();
    System.out.print("NIM  :");
    int NIM = sc.nextInt();

    System.out.println("--- MATA KULIAH 1 : ALGORITMA DAN PERMOGRAMAN ---");
    System.out.print("NILAI UTS   :");
    int nilaiUTS1 = sc.nextInt();
    System.out.print("NILAI UAS   :");
    int nilaiUAS1 = sc.nextInt();
    System.out.print("NILAI TUGAS :");
    int nilaiTUGAS1 = sc.nextInt();

    System.out.println("--- MATA KULIAH 2 : STRUKTUR DATA ---");
    System.out.print("NILAI UTS   :");
    int nilaiUTS2 = sc.nextInt();
    System.out.print("NILAI UAS   :");
    int nilaiUAS2 = sc.nextInt();
    System.out.print("NILAI TUGAS :");
    int nilaiTUGAS2 = sc.nextInt();

    double akhir1 = nilaiUTS1 * 0.3 + nilaiUAS1 * 0.4 + nilaiTUGAS1 * 0.3;
    double akhir2 = nilaiUTS2 * 0.3 + nilaiUAS2 * 0.4 + nilaiTUGAS2 * 0.3;
    
    String huruf1, huruf2, status1, status2;
    if (akhir1 > 80 && akhir1 <= 100) {
        huruf1 = "A";
        }else if (akhir1 > 73 && akhir1 <= 80) {
         huruf1 = "B+";
        }else if (akhir1 > 65 && akhir1 <= 73) {
         huruf1 = "B";
        }else if (akhir1 > 60 && akhir1 <= 65) {
         huruf1 = "C+";
        }else if (akhir1 > 50 && akhir1 <= 60) {
         huruf1 = "C";
        }else if (akhir1 > 39 && akhir1 <= 50) {
         huruf1 = "D";
        }else {
         huruf1 = "E";
    }

    if (akhir2 > 80 && akhir2 <= 100) {
        huruf2 = "A";
        }else if (akhir2 > 73 && akhir2 <= 80) {
         huruf2 = "B+";
        }else if (akhir2 > 65 && akhir2 <= 73) {
         huruf2 = "B";
        }else if (akhir2 > 60 && akhir2 <= 65) {
         huruf2 = "C+";
        }else if (akhir2 > 50 && akhir2 <= 60) {
         huruf2 = "C";
        }else if (akhir2 > 39 && akhir2 <= 50) {
         huruf2 = "D";
        }else {
         huruf2 = "E";
    }

    if(akhir1 >= 60) {
        status1 = "LULUS";
        }else{
            status1 = "TIDAK LULUS";
        }if (akhir2 >= 60) {
            status2 = "LULUS";
            }else {
                status2 = "TIDAK LULUS";
        }


    System.out.println();
    System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
    System.out.println("NAMA  :" + NAMA);
    System.out.println("NIM   :" + NIM);
    System.out.println();
    System.out.printf("%-30s %-5s %-5s %-7s %-15s %-15s %-15s%n", 
                "MATA KULIAH", "UTS", "UAS", "TUGAS", "NILAI AKHIR","NILAI HURUF", "STATUS");
    System.out.println("------------------------------------------------------------------------------------------------");

    System.out.printf("%-30s %-5d %-5d %-7d %-15.2f %-15s %-15s%n",
                 "ALGORITMA DAN PEMROGRAMAN", nilaiUTS1, nilaiUAS1, nilaiTUGAS1, akhir1, huruf1, status1);

    System.out.printf("%-30s %-5d %-5d %-7d %-15.2f %-15s %-15s%n",
                "STRUKTUR DATA", nilaiUTS2, nilaiUAS2, nilaiTUGAS2, akhir2,huruf2, status2);
    
    System.out.println();
    double rataRata = (akhir1 + akhir2) / 2;
    System.out.println("RATA RATA NILAI AKHIR   :" + String.format("%.2f", rataRata));
    
    if(rataRata >= 70) {
        System.out.println("STATUS SEMESTER         :LULUS");
        } else { 
            System.out.println("STATUS SEMESTER         :TIDAK LULUS");

            }

    }
}

