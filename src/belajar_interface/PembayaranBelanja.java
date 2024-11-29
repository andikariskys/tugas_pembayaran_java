/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author victus
 */
public class PembayaranBelanja implements MetodeBayarPakeAplikasi{
    //double uangCash;
    double kembalian;
    int idUser;
    //double jumlah TotalBelanja;

    @Override
    public double bayarGoPay(int idUser, double saldo, double belanjaTotal) {
        this.idUser = idUser;
        kembalian = saldo - belanjaTotal;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan GoPay berhasil!");
        } else {
            System.out.println("Saldo GoPay tidak mencukupi");
        }
        return kembalian;
    }

    @Override
    public double bayarShopee(int idUser, double saldo, double belanjaTotal) {
        this.idUser = idUser;
        kembalian = saldo - belanjaTotal;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan ShopeePay berhasil!");
        } else {
            System.out.println("Saldo ShopeePay tidak mencukupi");
        }
        return kembalian;
    }

    @Override
    public double BayarCash(int idUser, double cash, double belanja) {
        this.idUser = idUser;
        kembalian = cash - belanja;
        if (kembalian > 0) {
            System.out.println("Pembayaran melalui tunai berhasil!");
        } else {
            System.out.println("Uang Anda kurang");
        }
        return kembalian;
    }

    @Override
    public double BayarQRIS(int idUser, double cash, double belanja) {
        this.idUser = idUser;
        kembalian = cash - belanja;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan QRIS berhasil!");
        } else {
            System.out.println("Saldo QRIS tidak mencukupi");
        }
        return kembalian;
    }

    @Override
    public double BayarEwallet(int idUser, double cash, double belanja) {
        this.idUser = idUser;
        kembalian = cash - belanja;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan e-wallet berhasil!");
        } else {
            System.out.println("Saldo e-wallet tidak mencukupi");
        }
        return kembalian;
    }

    @Override
    public double BayarCreditCard(int idUser, double cash, double belanja) {
        this.idUser = idUser;
        kembalian = cash - belanja;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan Kartu Kredit berhasil!");
        } else {
            System.out.println("Saldo Kartu Kredit tidak mencukupi");
        }
        return kembalian;
    }

    @Override
    public double BayarDebitCard(int idUser, double cash, double belanja) {
        this.idUser = idUser;
        kembalian = cash - belanja;
        if (kembalian > 0) {
            System.out.println("Pembayaran menggunakan Kartu Debit berhasil!");
        } else {
            System.out.println("Saldo Kartu Debit tidak mencukupi");
        }
        return kembalian;
    }
    
}
