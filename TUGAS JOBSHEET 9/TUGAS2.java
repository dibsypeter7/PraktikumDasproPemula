import java.util.Scanner;
public class TUGAS2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Masukan Jumlah Pesanan Anda : ");
        int JumlahPesanan = sc.nextInt();
        sc.nextLine();

        String namaPesanan [] = new String [JumlahPesanan];
        int harga [] = new int [JumlahPesanan];

        for(int i=0; i < JumlahPesanan; i++){
            System.out.println("Pesanan ke- " + (i+1));
            System.out.print("Nama Makanan/Minuman? : ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga                 : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }

        int total = 0;
        for(int i=0; i < JumlahPesanan; i++){
            total += harga[i];
        }

        System.out.println("======== Daftar Pesanan ========");
        for(int i=0; i < JumlahPesanan; i++){
            System.out.println((i+1) + ". " + namaPesanan[i] + " - Rp " + harga[i]);

        }
        System.out.println("Total Biaya Yang Harus Dibayarkan : " + total);

        }
    }
