// seřazení tří čísel podle velikosti (vzestupně)
// Algoritmus používá techniku Bubble sort
// Složitost jsou 3 porovnání a v nejhorším případě 3 prohození
// Neexistuje algoritmus s méně, než 3 porovnáními
//je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package serazenitricisel;

import java.util.Scanner;


public class SerazeniTriCisel {

  
    public static void main(String[] args) {
        int[] pole = new int[3];
        Scanner vstup = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.print("Zadej "+(i+1)+". číslo: ");
            pole[i] = vstup.nextInt();
        }
        
        if (pole[0]>pole[1]) {
            // prohozeni obsahu proměnných pole[0],pole[1]
            int pom = pole[0];
            pole[0] = pole[1];
            pole[1] = pom;
        }
        if (pole[1]>pole[2]) {
            // prohozeni obsahu proměnných pole[1],pole[2]
            int pom = pole[1];
            pole[1] = pole[2];
            pole[2] = pom;
        }
        if (pole[0]>pole[1]) {
            // prohozeni obsahu proměnných pole[0],pole[1]
            int pom = pole[0];
            pole[0] = pole[1];
            pole[1] = pom;
    }
    System.out.println("Seřazeno: "+ pole[0] +","+ pole[1] +","+ pole[2]);
}
}