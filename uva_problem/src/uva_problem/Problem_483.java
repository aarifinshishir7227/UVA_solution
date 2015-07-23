/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_problem;

/**
 *
 * @author aarifin
 */
public class Problem_483 {
    
    public void word_scamble(String str)
    {
        String [] temp = str.split(" ");
        System.out.println(temp.length);
        for (String temp1 : temp) {
            for (int i = temp1.length() - 1; i>=0; i--) {
                char c;
                c = temp1.charAt(i);
                System.out.print(c);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}
