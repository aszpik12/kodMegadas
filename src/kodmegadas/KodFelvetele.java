
package kodmegadas;

import static kodmegadas.KodMegadas.megadotKod;
import static kodmegadas.KodMegadas.src;

public class KodFelvetele {

    public KodFelvetele() {
        bekeres();
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
    
     private static int kodmegadasa() {
        
        System.out.printf("kód megadása(4-6): ");
        megadotKod = src.nextInt();
        return megadotKod;
    }
    
}
