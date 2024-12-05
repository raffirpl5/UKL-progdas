package SoalUKL;

import java.util.Scanner;

public class soalMudah1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di program berbelanja");
        System.out.println("Masukkan total harga barang yang kamu beli : ");
        int totalBelanja = in.nextInt();
        int diskon = 0;
        int harga = 0;

        if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            System.out.println(" Anda mendapatkan diskon sebesar 10% ");
            harga += totalBelanja; 
            diskon += (totalBelanja * 0.1);
            harga -= diskon;
        } else if(totalBelanja >= 200000) {
            System.out.println(" Anda mendapatkan diskon sebesar 20% ");
            harga += totalBelanja; 
            diskon += (harga * 0.2);
            harga -= diskon;
        }else {
            System.out.println(" Anda tidak mendapatkan diskon");
            harga += totalBelanja;
             
        }

        System.out.println(" Total belanja kamu adalah : " + totalBelanja);
        System.out.println(" Diskon : " + diskon);
        System.out.println(" Total belanja yang harus kamu bayarkan adalah : "+ harga);
        
    }
}
