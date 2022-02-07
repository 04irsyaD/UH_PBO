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
public class siswa_java {
    String  nilai;
    int a= 80;
    int b =70;
    
    
    Scanner input  =new Scanner (System.in);
    
    
    
    
    void data_siswa(){
        System.out.print("masukan nama :");
        String name = input.nextLine();
        System.out.print("masukan kelas :");
        String kelas = input.nextLine();
        System.out.println("masukan bomor absen :");
        int absen = input.nextInt();
        
        
    }
    
    
    void nilai_rpl(){
        System.out.print("masukan nilai produktif :");
        int nilai = input.nextInt();
        if (nilai >=80)
            System.out.println("selamat anda lulus");
        else if (nilai >=70)
            System.out.println("anda harus belajar lagi");
        else
            System.out.println("anda harus belajar lagi");
                
        
       
        
    }
}

            
    
    
    
    
    
    
    

