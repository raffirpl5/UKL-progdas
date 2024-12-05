package SoalUKL;

import java.util.Scanner;

public class soalSedang2 {
    public static void main(String[] args) {
        System.out.print(" Menghitung Luas permukaan Bola ");
        Scanner j = new Scanner (System.in);

        int jari = 0;
        System.out.println(" Masukkan jari - jari :");
        jari = j.nextInt();
        System.out.println(" 4 * 3.14 * " + jari + " * " + jari);

        volume(jari);

    }
    public static void volume(int jari){
        System.out.println(" Luas permukaan bola adalah = " + (4*3.14*jari*jari));
    }      

}
