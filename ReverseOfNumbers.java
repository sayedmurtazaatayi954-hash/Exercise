
package reverseofnumbers;

import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 10 digital numbers");
        Scanner sc = new Scanner(System.in);
        int[] numbers=new int[10];
        for(int i =0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();}
            for(int i=numbers.length-1;i>=0;i--)
                System.out.println(numbers[i]);
       
    }
    
}
    
        
    }
}
