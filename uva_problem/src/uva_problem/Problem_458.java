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
public class Problem_458 {
    public void decoder(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char c,y;
            c = str.charAt(i);
            y = (char) (c-7);
            System.out.print(""+y);
        }
        System.out.println("");
    }
}
