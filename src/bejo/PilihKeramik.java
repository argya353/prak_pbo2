/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejo;

/**
 *
 * @author ayaya
 */
public class PilihKeramik {
    public static void main(String args[]){
        System.out.println("Keramik A:");
        Keramik a=new Keramik(0.3,0.3,10,54000);
        a.hitungHarga();
        System.out.println("=============================================");
        
        System.out.println("Keramik B:");
        Keramik b=new Keramik(0.4,0.4,5,65000);
        b.hitungHarga();
        System.out.println("=============================================");
        
        System.out.println("Keramik C:");
        Keramik c=new Keramik(0.3,0.4,8,60000);
        c.hitungHarga();
        System.out.println("=============================================");
    }
}
