/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aarifin
 */
public class Uva_problem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Problem_483 prob483 = new Problem_483();
        //prob483.word_scamble(read.readLine());
        Problem_494 prob494 = new Problem_494();
        //prob494.kintergarder_counting_game(read.readLine());
        Problem_495 prob495 = new Problem_495(); 
       // prob495.fibonacci_freeze(Integer.parseInt(read.readLine()));
        Problem_458 prob458 = new Problem_458();
        //prob458.decoder(read.readLine());
        Problem_490 prob490 = new Problem_490();
        prob490.rotating_sentence(read.readLine(), read.readLine());
        
        
    }
    
}
