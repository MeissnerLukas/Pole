
package pole;


public class Pole {

    
    public static void main(String[] args) {
        double[] pole = new double[10];
        
        
        //naplnění pole náhodnými čísly
        for (int i=1; i<4; i++) {
            pole[i] = Math.random();
        }
        
        //výpis pole
        for (int i=1; i<4; i++) {
            System.out.println(i+": "+pole[i]);
        }
    }
    
    
}
