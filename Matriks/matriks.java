package Mukhammad.Ilham.Firdaus.Matriks;

import java.util.Scanner;

public class matriks {
    public static void main(String[] args) {
        method method = new method();
        Scanner input = new Scanner(System.in);
        int ordo = 0, baris = 0, kolom = 0;
        boolean z = true;
        while (z) {
            System.out.println("(EX: masukan 2 untuk ordo 2x2)");
            System.out.print("input ordo = ");
            ordo = input.nextInt();
            System.out.println();
            if (ordo >= 2){
                z = false;
            }
            else {
                System.out.println("Matrix Min 2x2");
            }
        }
        int[] matriks_pertama = new int[ordo * ordo];
        int[] matriks_kedua = new int[ordo * ordo];

        for (int u = 0; u < ordo; u++){
            for (int v = 0; v < ordo; v++){
                System.out.print("Masukan nilai matrix pada indexs ("+ baris+","+ v +") : ");
                matriks_pertama[kolom] = input.nextInt();
                kolom++;
            }
            baris++;
        }
        method.print_matriks(matriks_pertama,ordo);
        baris = 0;
        kolom = 0;
        for (int i = 0; i < ordo; i++){
            for (int j = 0; j < ordo; j++){
                System.out.print("Masukan nilai matrix pada indexs ("+ baris+","+j+") : ");
                matriks_kedua[kolom] = input.nextInt();
                kolom++;
            }
            baris++;
        }
        method.print_matriks(matriks_kedua,ordo);

        System.out.println("Matrix pertama : ");
        method.print_matriks(matriks_pertama,ordo);

        System.out.println("Matrix kedua : ");
        method.print_matriks(matriks_kedua,ordo);

        System.out.println("Hasil Penjumlahan ");
        method.penjumlahan_matriks(matriks_pertama, matriks_kedua,ordo);

        System.out.println("Hasil Pengurangan ");
        method.pengurangan_matriks(matriks_pertama, matriks_kedua,ordo);

        System.out.println("Hasil Perkalian ");
        method.perkalian_matriks(matriks_pertama, matriks_kedua,ordo);
    }

}
