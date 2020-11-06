/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan35.program.tunjangan;


/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Program Tunjangan
 */
public class Gaji {

    double gaji;
    String status;
    
    
     public double hitungTunjangan () {
        double tunjangan;
        if (status.equals("menikah") || status.equals("Menikah")) {
            tunjangan = 0.35 * gaji;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
     }
     
     public double hitungTotalGaji() {
         return gaji + hitungTunjangan();
     }
}

