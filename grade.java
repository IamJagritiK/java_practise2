import java.util.*;

class grade 
{  
    
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println("grade of student"+i+"is"+a[i]);
        }
    }
    public static void avg(int a[])
    {
       int sum=0;
       float avg;
       for (int value : a) {
        sum += value;
       }
       avg=sum/a.length;
       System.out.println("average"+avg);
       
    }
    public static void max(int a[])
    {
       int max=0;
       int len=a.length;
       for(int i=0;i<len;i++)
       {
           if(a[i]>max)
           max=a[i];
       }
       System.out.println("max"+max);
       
    }
    public static void min(int a[])
    {
        int min=a[0];
        int len=a.length;
        for(int i=1;i<len;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("min"+min);
       
    }


   public static void main(String args[])  
   {  
      int num;
      System.out.println("enter the number of student");
      Scanner inputScanner = new Scanner(System.in);     
      num = inputScanner.nextInt();
      int arr[]=new int[num];
      System.out.println("please enter grade between 1-100 only");
      for(int i=0;i<num;i++)
      {
          int num1=inputScanner.nextInt();
          arr[i]=num1;
      }
      grade.display(arr);
      grade.avg(arr);
      grade.max(arr);
      grade.min(arr);



   }  

}