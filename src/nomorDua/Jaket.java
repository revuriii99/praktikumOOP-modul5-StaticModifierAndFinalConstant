package nomorDua;

public class Jaket {
    public final int hargaA = 100000;
    public final int hargaB = 125000;
    public final int hargaC = 175000;

    public int HargaTotal (int JumlahA,  int JumlahB, int JumlahC){
        int HargaABaru = (JumlahA > 100)? 95000  : hargaA;
        int HargaBBaru = (JumlahB > 100)? 120000 : hargaB;
        int HargaCBaru = (JumlahC > 100)? 160000 : hargaC;

        int Total_A = HargaABaru * JumlahA;
        int Total_B = HargaBBaru * JumlahB;
        int Total_C = HargaCBaru * JumlahC;

        return Total_A + Total_B + Total_C;
    }

    public void DetailPembelian(int JumlahA, int JumlahB, int JumlahC){

        int Harga_A_Baru = (JumlahA > 100)? 95000  : hargaA;
        int Harga_B_Baru = (JumlahB > 100)? 120000 : hargaB;
        int Harga_C_Baru = (JumlahC > 100)? 160000 : hargaC;

        System.out.println("Jaket A : "+ JumlahA + " x " + Harga_A_Baru + " : " + (Harga_A_Baru * JumlahA));
        System.out.println("Jaket B : "+ JumlahB + " x " + Harga_B_Baru + " : " + (Harga_B_Baru * JumlahB));
        System.out.println("Jaket C : "+ JumlahC + " x " + Harga_C_Baru + " : " + (Harga_C_Baru * JumlahC));
    }
}
