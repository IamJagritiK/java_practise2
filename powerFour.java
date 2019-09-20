import java.util.Scanner;

class powerFour{

    static int isPowerOfFour(int n) 
    { 
        if(n == 0) 
        return 0; 
        while(n != 1) 
        {  
            if(n % 4 != 0) 
            return 0; 
            n = n / 4;      
        } 
        return 1; 
    }  
  
    // Driver program  
    public static void main(String[] args) 
    { 
        System.out.println("Enter the number to be tested:"); 
        Scanner scan = new Scanner(System.in);
        int test_no = scan.nextInt();

        if(isPowerOfFour(test_no) == 1) 
         System.out.println(test_no +  
                           " is a power of 4"); 
        else
         System.out.println(test_no +  
                           "is not a power of 4"); 
    } 


}