
/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class Tprime {
    public static void main(String args[]) {
        // your code goes here
        int arr[] = new int[1000000 + 1];

        for (int i = 1; i <= 1000000; i++) {
            arr[i] = 1;
        }
        arr[1] = 0;
        for (int i = 2; i*i<=1000000; i++) {
            if (arr[i] == 1) {
                for (int j = i; j * i <= 1000000; j++) {

                    arr[i * j] = 0;
                }
            }

        }
        
        

   
            int count = 0;
            for (int i = 0; i <= 1000000; i++) {
                if (arr[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
      
    }
