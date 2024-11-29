/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author victus
 */
public interface MetodeBayarPakeAplikasi extends MetodeBayar{
    public double bayarGoPay (int idUser, double saldo, double belanjaTotal); 
    public double bayarShopee (int idUser, double saldo, double belanjaTotal);
}
