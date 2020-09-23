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
public class Keramik {
    double size1;
    double size2;
    int box;
    int hBox;
    
    Keramik(double s1, double s2, int b, int hB){
        this.size1=s1;
        this.size2=s2;
        this.box=b;
        this.hBox=hB;
    }
    
    double hitungHarga(){
        double jml;
        double hrg;
        jml=this.box*this.size1*this.size2;
        hrg=100/jml*this.hBox;
        System.out.println("Harga total keramik adalah Rp"+Math.floor(hrg));
        return hrg;
    }
}