/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_solve;
import java.util.Scanner;
/**
 *
 * @author aarifin
 */
public class Problem_solve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int x,y;
        
        
        int input = scan.nextInt();
        for(x=1;x<=100;x++)
        {
            
            for(y = x-1;y<x;y++)
            {
                
                if(input==0)
                {
                     System.exit(0);
                }
                else if(input == (x*x*x - y*y*y))
                {
                    System.out.println("the value of x is --> "+x+" and the value of y is ---> "+y);
                    input = scan.nextInt();
                    x=1;
                    y=0;
                    
                }
                else if(input < (x*x*x - y*y*y))
                {
                    System.out.println("no solution");
                    input = scan.nextInt();
                    x=1;
                    y=0;
                    
                }  
                else {
                    
                }
            }
        }
        
    }
    
}
