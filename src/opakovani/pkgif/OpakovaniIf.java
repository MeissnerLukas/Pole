// vypiš dvě vstupující čísla 
package opakovani.pkgif;

import java.util.Scanner;

public class OpakovaniIf {
    private static Object vstup;

    public static void main(String[] args) {
       // vstup od uživatele
        Scanner vstup = new Scanner(System.in);
       System.out.print("zadej číslo a: ");
       int a = vstup.nextInt ();
       System.out.print("zadej číslo b: ");
       int b = vstup.nextInt ();;
       // prohodit proměnné, pokud jsou hodnoty obráceně
       if (a > b) {
           //swap (a, b)
            int pomocná = a;
            a = b;
            b = pomocná;
      } 
     System.out.println("čísla podle pořadí: " + a + " " + b);
    }
    
}