import java.util.Scanner;


class UserEncapsulation{
     private String firstName;
     private String lastName;
     private int age;
     private int salary;


     public int getAge() {
         if(age>0 && age<100){
            return age;
         }
         else return -1;
         
     }
        

     public String isValid(int ageParam) {
        
       if(ageParam>=18 && ageParam<=60)
       {
        String result="Valid";
        return result;
       }
       else{
        String result="NotValid";
        return result;
    }
     }

     public String getFullName(String firstParam,String lastParam) {
        

        String str3=firstParam.concat(lastParam);

       return str3;
     }
      
 


  
     public String getFirstName() {
        return firstName;
     }


     public String getLastName() {
        return lastName;
     }
  
  
     public int getSalary() {
        return salary;
     }
  
  
     public void setAge( int newAge) {
        if(newAge>0 && newAge<100)
        {
            age=newAge;
          
        } 
        
     }
  
     public void setFirstName(String newName) {
       firstName = newName;
     }
     
     public void setLastName(String newName) {
        lastName = newName;
      }
     

     public void setSalary( int newSalary) {
        salary = newSalary;
     }

     

}

  public class Encap{
     public static void main(String args[])
     {

         Scanner scan= new Scanner(System.in);

        System.out.println("Enter first name:");
        String enterFirstName= scan.nextLine();

        System.out.println("Enter last name:");
         String enterLastName= scan.nextLine();
         
         System.out.println("Enter age:");
         int enterAge= scan.nextInt();

        
         

       UserEncapsulation user1=new  UserEncapsulation();
       user1.setFirstName(enterFirstName);
       user1.setAge(enterAge);
       user1.setLastName(enterLastName);
       user1.isValid(enterAge);
       user1.getFullName(enterFirstName, enterLastName);
 
       String fullName = user1.getFullName(enterFirstName, enterLastName);
       String validInvalid=user1.isValid(enterAge);
   

      // System.out.println("Name : " + user1.getFirstName()  + user1.getLastName());

       System.out.println(validInvalid);
       System.out.println(fullName);
     }
}