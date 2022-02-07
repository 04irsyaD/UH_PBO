/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author Irsyad
 */
public class kelulusan_ja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("NIlai  siswa");
        System.out.println("---------------");
        
        siswa_java data = new siswa_java();
        data.data_siswa();
        data.nilai_rpl();
} 
    
}