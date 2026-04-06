public class Hitung {

    static void penjumlahan(int x, int y){
        int hasil = x + y;
        System.out.println("Hasil: "+ hasil);
    }
    static void pengurangan(int x, int y){
        int hasil  = x - y;
        System.out.println("Hasil: "+ hasil);
    }
    void perkalian(int x, int y){
        int hasil = x * y;
        System.out.println("Hasil: "+ hasil);
    }
    void pembagian(int x, int y){
        if(y != 0){
            int hasil = x/y;
        } else {
            System.out.println("Gak bisa kaya gitu mpruy");
            return;
        }
        int FPB = sederhana(x, y);
        x /= FPB;
        y /= FPB;
        double hasil = (double)x/y;
        System.out.println("Hasil: "+ hasil);
    }
    int sederhana(int x, int y){
        while(x != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
