/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author victus
 */
public interface MetodeBayar {
    public double BayarCash(int idUser, double cash, double belanja);
    public double BayarQRIS(int idUser, double cash, double belanja);
    public double BayarEwallet(int idUser, double cash, double belanja);
    public double BayarCreditCard(int idUser, double cash, double belanja);
    public double BayarDebitCard(int idUser, double cash, double belanja);
}
