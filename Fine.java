import java.util.Scanner; 
  
 public class Fine { 
     public static void main(String[] args) { 
         int days; 
         float fine; 
         System.out.println("Enter the number of days the member is late to return the book "); 
         Scanner sc=new Scanner(System.in); 
         days= sc.nextInt(); 
         if(days<=30){ 
             if (days>0 && days<=5){ 
                 fine=0.5f*days; 
                 System.out.println("Your fine=Rs."+ fine); 
             } else if (days>5 && days<=10) { 
                 fine=0.5f*5+(days-5); 
                 System.out.println("Your fine=Rs."+ fine); 
             }else { 
                 fine=0.5f*5+5+(days-10)*5; 
                 System.out.println("Your fine =Rs." + fine); 
             } 
         } 
         else { 
             System.out.println("Your membership has been cancelled"); 
         } 
     } 
 }
