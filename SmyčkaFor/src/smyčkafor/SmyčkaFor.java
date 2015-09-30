
package smyčkafor;

public class SmyčkaFor {

    
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Násobilka");
        
        for (int j = 1; j <= 10; j++) {
            // násobilka 1
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%2d ", i * j);
                
            }
        }
        
        
        //násobilka 1
        for (int i=1; i<=10; i++) {
            System.out.print(i*1+"  ");
        }
        System.out.println();
        
        
        //násobilka 2
        for (int i=1; i<=10; i++) {
            System.out.print(i*2+"  ");
        }
        System.out.println();
        
        //násbilka 3
        for (int i=1; i<=10; i++) {
            System.out.print(i*3+"  ");
        }
        System.out.println();
    }
    
        
    
}
