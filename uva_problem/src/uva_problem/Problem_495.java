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
public class Problem_495 {
    public void fibonacci_freeze(int n)
    {
        int [] arr = new int [n];
        int first = 0;
        int second = 1;
        int calculate_value;
        for(int i=2;i<n;i++)
        {
            calculate_value = first + second;
            first = second;
            second = calculate_value;
            arr[i] = calculate_value;
        }
        System.out.println(""+(arr[n-1]+arr[n-2]));
    }
}
