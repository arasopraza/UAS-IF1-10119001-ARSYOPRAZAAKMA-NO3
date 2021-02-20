package com.arsy;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * NIM      : 10119001
 * KELAS    : IF1
 * TANGGAL  : 20-02-2021
 * NO SOAL  : 3
 * Deskripsi Program: Program menampilkan umur yg di input user
 */

public class Main {
    public static void main(String[] args) {
        int umur;
        boolean status;
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda : ");
        umur = scanner.nextInt();
        if (umur >= 17) {
            status = true;
            System.out.println("Status Dewasa : " + status);
        } else {
            status = false;
            System.out.println("Status Dewasa : " + status);
        }
    }
}
