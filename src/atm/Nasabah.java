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
public class Nasabah {
    private String namaNasabah;
    private int noRek;
    private int PINnasabah;
    private Tabungan tabungan;
    private JenisKartu jenisKartu;
    
    public Nasabah(String namaNasabah, int noRek, int PINnasabah, Tabungan tabungan,JenisKartu jenisKartu)
    {
        this.namaNasabah = namaNasabah;
        this.noRek = noRek;
        this.PINnasabah = PINnasabah;
        this.tabungan = tabungan;        
        this.jenisKartu = jenisKartu;
    }
    public String getNamaNasabah(){
        return namaNasabah;
    }
    public int getNoRek(){
        return noRek;
    }
    public int getPinNasabah(){
        return PINnasabah;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public JenisKartu getJenisKartu(){
        return jenisKartu;
    }
}
