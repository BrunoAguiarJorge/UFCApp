
package ufcapp1;


public class UFCApp1 {

    
    public static void main(String[] args) {
        Fighter f[] = new Fighter[6];
        f[0] = new Fighter("pretty boy", "France", 31, 2, 3, 2, 68.9f, 1.75f);
        f[1] = new Fighter("Bruno", "Brazil", 32 , 1, 5, 2, 80f, 1.75f);
        f[2] = new Fighter("pakito", "Brazil", 35, 2, 3, 1, 79f, 174f);
        
        
        
        // call the objets 
        f[0].introduction();
        f[1].status();
        f[2].win();
        f[2].status();
        

        
    }
    
}
