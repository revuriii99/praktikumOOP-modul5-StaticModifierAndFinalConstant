package nomorDua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.print("Masukkan Jumlah Jaket A : ");
        int JumlahA = scanner.nextInt();
        System.out.print("Masukkan Jumlah Jaket B : ");
        int JumlahB = scanner.nextInt();
        System.out.print("Masukkan Jumlah Jaket C : ");
        int JumlahC = scanner.nextInt();

        System.out.println("Informasi Pembelian : ");
        jaket.DetailPembelian(JumlahA, JumlahB, JumlahC);

        int Total = jaket.HargaTotal(JumlahA, JumlahB, JumlahC);
        System.out.print("Total harga: " + Total);

        scanner.close();
    }
}
