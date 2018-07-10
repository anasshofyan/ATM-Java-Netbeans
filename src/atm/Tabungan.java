/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.*;
/**
 *
 * @author Anak Teknik Indo
 */
public class Tabungan {
    private int saldo;
    
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setAmbilSaldo(int ambilSaldo){
       int x = this.getSaldo() - ambilSaldo - 3000 ;
       this.setSaldo(x);
    }
     public void setTambahSaldo(int tambahSaldo){
       int y = getSaldo() + tambahSaldo ;
       this.setSaldo(y);
    }
}
