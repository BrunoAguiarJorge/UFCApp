
package ufcapp1;

import java.util.HashSet;
import java.util.Set;


public class UFCApp1 {

    
    public static void main(String[] args) {
        Fighter f[] = new Fighter[6];
        f[0] = new Fighter("pretty boy", "France", 31, 2, 3, 2, 68.9f, 1.75f);
        f[1] = new Fighter("Bruno", "Brazil", 32 , 1, 5, 2, 80f, 1.75f);
        f[2] = new Fighter("pakito", "Brazil", 35, 2, 3, 1, 79f, 174f);
        f[3] = new Fighter("Brian", "Spain", 29, 4, 9, 1, 70f, 179f);
        f[4] = new Fighter("Rubens", "Ireland", 23, 1, 6, 4, 56f, 167f);
        f[5] = new Fighter("Banana", "Ireland", 56, 1, 8, 2, 53f, 169f);
        
        Fight UFC1 = new Fight();
        UFC1.setFight(f[3], f[5]);
        UFC1.fight();

        // call the objets 
        //f[0].introduction();
        //f[1].status();
        //f[2].win();
        //f[2].status();
        
//fazendo um teste tiubrow
        
    }
    
}
