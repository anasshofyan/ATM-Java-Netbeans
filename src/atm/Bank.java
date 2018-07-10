/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import static atm.JenisKartu.SILVER;
import java.util.ArrayList;

/**
 *
 * @author Anak Teknik Indo
 */
public class Bank extends ATM {
    private ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    //nama, norek, pin, saldo
    Nasabah Anas = new Nasabah("Anas", 1111, 123456, new Tabungan(9000000), JenisKartu.GOLD);
    Nasabah Adepe = new Nasabah("Adepe", 2222, 123456, new Tabungan(9000000), JenisKartu.PLATINUM);
    Nasabah Martunis = new Nasabah("Martunis", 3333, 123456, new Tabungan(7000000), JenisKartu.SILVER);
    
    public Bank(){
        nasabah.add(Anas);
        nasabah.add(Adepe);
        nasabah.add(Martunis);
    }
    public ArrayList<Nasabah> getAllNasabah(){
        return nasabah;
    }
    
}
