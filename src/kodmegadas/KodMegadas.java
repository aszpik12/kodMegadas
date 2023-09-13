/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kodmegadas;

import java.util.Scanner;

/**
 *
 * @author TegzesMárton(SZF_202
 */
public class KodMegadas {
    
    static Scanner src = new Scanner(System.in);
    static int szam;
    static  int megadotKod;
    public static void main(String[] args) {
        pinjatek();
    }

    private static void pinjatek() {
       szam = bekeres();
       elennorzes(belepes(szam));
       
    }

    private static int bekeres() {
        int megadas = 0;
       do{
           if(megadas < 1){
                kodmegadasa();
                megadas++;
           }
           else{
               System.out.println("Nem negfelelő a formátum, minimum 4 maximum 6 számjegy legyen");
               kodmegadasa();
               
           }
       }
       while(!(megadotKod >= 1000 && megadotKod <= 999999));
        System.out.println("pin elmentve!");
       return megadotKod;
    }

    private static int belepes(int megadotKod) {
        int pin;
        int probalkozasok_szama = 1;
        do{
            System.out.println("Ad meg a belépésikódot:"+probalkozasok_szama+"/3");
            pin = kodmegadasa();
            probalkozasok_szama++;
            
        }
        while(probalkozasok_szama < 4 && pin != megadotKod);
        return probalkozasok_szama;
    }

    private static int kodmegadasa() {
        
        System.out.printf("kód megadása(4-6): ");
        megadotKod = src.nextInt();
        return megadotKod;
    }

    private static void elennorzes(int belepes) {
        if(belepes <= 4){
            System.out.println("Sikeres Belépés");
        }
        else{
            System.out.println("Belépés megtagadva");
        }
    }
    
}
