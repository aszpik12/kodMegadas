
package kodmegadas;

import java.util.Scanner;

public class KodMegadas {
    
    static Scanner src = new Scanner(System.in);
    static KodFelvetele kod = new KodFelvetele(); 
    static int szam;
    static  int megadotKod;
    public static void main(String[] args) {
        pinjatek();
    }

    private static void pinjatek() {
       szam = kod.bekeres();
       elennorzes(belepes(szam));
       
    }

    

    private static int belepes(int megadotKod) {
        int pin;
        int probalkozasok_szama = 1;
        do{
            System.out.println("Ad meg a belépésikódot:"+probalkozasok_szama+"/3");
            pin = new KodFelvetele.kodmegadasa();
            probalkozasok_szama++;
            
        }
        while(probalkozasok_szama < 4 && pin != megadotKod);
        return probalkozasok_szama;
    }

    private static void elennorzes(int belepes) {
        if(belepes <= 3){
            System.out.println("Sikeres Belépés");
        }
        else{
            System.out.println("Belépés megtagadva");
        }
    }
    
}
