package SoalUKL;

import java.util.Scanner;

public class soalSulit2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        System.out.println(" Program validasi angka negatif dalam array");
        int [] angka = new int[12l];  
        
        for (int i = 0; i< angka.length; i++) {
            System.out.println(" Masukkan angka ke-"  + (i + 1) + " :");
            angka[i] = in.nextInt();
        }

        System.out.println(" ELemen mengandung angka negatif :");
        for (int i = 0; i< angka.length; i++) {
            for (int j = 1; j< angka.length; j++) {
                if (angka[j] == -i) {
                     System.out.println(-i + " ");
                    break;
                }
        
            }
        }
    }
}