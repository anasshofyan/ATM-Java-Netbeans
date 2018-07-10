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
public enum JenisKartu {
    SILVER(3000000), PLATINUM(4000000), GOLD(5000000);
    private int batas;
    
    private JenisKartu(int batas){
        this.batas = batas;
    }
    public int getBatas(){
        return batas;
    }
    
}
