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
public class Problem_490 {
    public void rotating_sentence(String str,String rts)
    {
        int xy = rts.length()-str.length();
        for(int i=0;i<xy;i++)
            str = str + " ";
        for(int i=0;i<rts.length();i++)
        {
            char c1,c2;
            c1 = rts.charAt(i);
            c2 = str.charAt(i);
            System.out.println(c1+""+c2);
        }
    }
    
}
