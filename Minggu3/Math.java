import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Math {
    int angka1;
    int angka2;
    int hasiltambah,hasilkurang,hasilbagi,hasilkali;
    float float1,float2;
    float fhasiltambah,fhasilkurang,fhasilbagi,fhasilkali;
    Scanner sc = new Scanner(System.in);
    public Matematika(){}
    void isiNilai()
    { 
        System.out.println("PENJUMLAHAN BILANGAN BULAT");
        System.out.print("input nilai pertama : ");angka1=sc.nextInt();
        System.out.print("input nilai kedua   : ");angka2=sc.nextInt();
    }
    //Method
    void pertambahan(){
        System.out.println("----------PERTAMBAHAN----------");
        hasiltambah = angka1+angka2;
        System.out.println("Pertambahan         : "+angka1+"+"+angka2+"="+hasiltambah);
        System.out.println("-------------------------------");
    }
    void pengurangan(){
        System.out.println("----------PENGURANGAN----------");
        hasilkurang = angka1-angka2;
        System.out.println("Pengurangan         : "+angka1+"-"+angka2+"="+hasilkurang);
        System.out.println("-------------------------------");
    }
    void perkalian(){
        System.out.println("----------PERKALIAN----------");
        hasilkali = angka1*angka2;
        System.out.println("Perkalian           : "+angka1+"x"+angka2+"="+hasilkali);
        System.out.println("-------------------------------");
    }
    void pembagian(){
        System.out.println("----------PEMBAGIAN----------");
        hasilbagi = angka1/angka2;
        System.out.println("Pembagian           : "+angka1+"/"+angka2+"="+hasilbagi);
        System.out.println("-------------------------------");
    }
    void isiPecahan()
    { 
        System.out.println("PENJUMLAHAN BILANGAN PECAHAN");
        System.out.print("input bil.pecahan pertama : ");float1=sc.nextFloat();
        System.out.print("input bil.pecahan kedua   : ");float2=sc.nextFloat();
    }
    //Method
    void tambahpecahan(){
        System.out.println("----------PERTAMBAHAN----------");
        fhasiltambah = float1+float2;
        System.out.println("Pertambahan                : "+float1+"+"+float2+"="+fhasiltambah);
        System.out.println("-------------------------------");
    }
}
