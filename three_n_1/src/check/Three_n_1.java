package check;
import java.io.*;

public class Three_n_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("please enter first value  -> ");
        int i;
        i= Integer.parseInt(read.readLine());
        System.out.print("enter the second value (the second input must be bigger than the first input) -> ");
        int j = Integer.parseInt(read.readLine());
        int value = (j+1)-i;
        int [] array = new int [value];
        int [] arr = new int [value];
        int kkk=0;
        for(int check = i;check<=j;check++)
        {
            int count=1;
            int luck;
            luck = check;
            if(luck ==1 )
                count =1;
            else
                while(luck!=1)
                {

                    if(luck%2==1)
                    {
                        luck=3*luck+1;
                    }
                    else
                        luck = luck/2;
                   
                    count++;
                    
                }   
            arr[kkk] = check;
           // System.out.print("-> "+count);
            // take the value of count in this array
                    array[kkk] = count;
                kkk++;// the value of count is increasing 
            
                    
            
        }
        //here sort the array for take the max value
        for(int ss=0;ss<arr.length;ss++)
        {
        	System.out.println(arr[ss] + " -> "+array[ss]);
        }
        int max_value = array[0];
        for(int now =1;now<array.length;now++)
        {
            if(max_value<array[now])
                max_value=array[now];
        }
        // end of sort 
           //Arrays.sort(array);
             // the output is given below   
            System.out.println("the desire output is -> "+max_value);
    }
    
}
