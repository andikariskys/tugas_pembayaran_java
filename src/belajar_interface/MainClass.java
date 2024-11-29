/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;

import java.util.Scanner;

/**
 *
 * @author victus
 */
public class MainClass extends PembayaranBelanja{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kasir Sederhana");
        System.out.println("=========================");
        System.out.println("Pilih Pembayaran");
        System.out.println("a. Tunai");
        System.out.println("b. GoPay");
        System.out.println("c. ShopeePay");
        System.out.println("d. QRIS");
        System.out.println("e. e-wallet");
        System.out.println("f. Kartu Kredit");
        System.out.println("g. Kartu Debit");
        System.out.println("=========================");
        System.out.print("=> ");
        String jenis_pembayaran = input.nextLine();
        System.out.println("=========================");
        System.out.println("Pilih Member dibawah:");
        System.out.println("1. Andika");
        System.out.println("2. Rauf");
        System.out.println("3. Artaka");
        System.out.println("4. Luthfi");
        System.out.println("=========================");
        System.out.print("=> ");
        int id_user = input.nextInt();
        System.out.println("=========================");
        System.out.println("Saldo e-wallet/kartu/cash?");
        System.out.print("=> Rp. ");
        double saldo_cash = input.nextDouble();
        System.out.println("=========================");
        System.out.println("Total Pembelanjaan");
        System.out.print("=> Rp. ");
        double total_belanja = input.nextDouble();
        System.out.println("=========================");
        
        PembayaranBelanja pb = new PembayaranBelanja();
        
        switch (jenis_pembayaran) {
            case "a" -> {
                pb.BayarCash(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "b" -> {
                pb.bayarGoPay(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "c" -> {
                pb.bayarShopee(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "d" -> {
                pb.BayarQRIS(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "e" -> {
                pb.BayarEwallet(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "f" -> {
                pb.BayarCreditCard(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            case "g" -> {
                pb.BayarDebitCard(id_user, saldo_cash, total_belanja);
                System.out.println("Kembalian : " + pb.kembalian);
                System.out.println("Id Member : " + pb.idUser);
            }
            default -> System.out.println("Pilihan yang Anda masukkan salah");
        }
        
    }
}
