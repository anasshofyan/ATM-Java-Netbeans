/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Anak Teknik Indo
 */
public class ATM {
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        MenuUtama menuUtama = new MenuUtama(bank);
        menuUtama.setVisible(true);
        
       // menuUtama.setVisible(true);
    }
}
