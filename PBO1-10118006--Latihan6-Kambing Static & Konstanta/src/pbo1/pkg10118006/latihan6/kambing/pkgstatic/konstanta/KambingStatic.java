/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118006.latihan6.kambing.pkgstatic.konstanta;

/**
 *
 * @author
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : PBO1
 * NIM   : 10118006
 * Deskripsi Program : Program ini berisi  program untuk implementasi static & konstanta
 */
public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
       public static final String NAMA_KAMBING = "MIDUN";
       
       public static void main(String[] args) {
           Mamalia.jumlahKambing = 485000;
           System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
       }
    
}
