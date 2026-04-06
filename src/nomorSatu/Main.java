package nomorSatu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        Hitung.penjumlahan(angka1, angka2);

        System.out.print("Masukkan angka pertama: ");
        int angka3 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka4 = scanner.nextInt();
        Hitung.pengurangan(angka3, angka4);

        System.out.println("\n");
        Hitung hitung = new Hitung();
        System.out.print("Masukkan angka pertama: ");
        int angka5 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka6 = scanner.nextInt();
        hitung.perkalian(angka5, angka6);
        System.out.println("\n");

        System.out.print("Masukkan angka pertama: ");
        int angka7 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka8 = scanner.nextInt();
        hitung.pembagian(angka7, angka8);

        scanner.close();
    }
}
