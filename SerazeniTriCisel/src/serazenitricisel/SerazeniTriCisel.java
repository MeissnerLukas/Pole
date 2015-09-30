// seřazení tří čísel podle velikosti (vzestupně)
// Algoritmus používá techniku Bubble sort
// Složitost jsou 3 porovnání a v nejhorším případě 3 prohození
// Neexistuje algoritmus s méně, než 3 porovnáními
//je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package serazenitricisel;


public class SerazeniTriCisel {

  
    public static void main(String[] args) {
        int a = 3;
        int b = 45;
        int c = 995;
        
        if (a>b) {
            // prohozeni obsahu proměnných b,c
            int pom = a;
            a = b;
            b = pom;
        }
        if (b>c) {
            // prohozeni obsahu proměnných b,c
            int pom = b;
            b = c;
            c = pom;
        }
        if (a>b) {
            // prohozeni obsahu proměnných b,c
            int pom = a;
            a = b;
            b = pom;
    }
    System.out.println("Seřazeno: "+ a +","+ b +","+ c);
}
}