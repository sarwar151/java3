import java.util.Scanner; 
  
 public class Worker_Efficiency { 
     public static void main(String[] args) { 
        float time; 
         System.out.println("Enter the time taken by the worker(in hours)"); 
         Scanner sc=new Scanner(System.in); 
         time=sc.nextFloat(); 
         if(time>=2 && time<=3){ 
             System.out.println("Highly Efficient Worker"); 
         } else if (time>=3 && time<=4) { 
             System.out.println("Improve your speed"); 
         } else if (time>=4 && time<=5){ 
             System.out.println("Training is given to improve his speed"); 
         } else if (time>5) { 
             System.out.println("Worker has to leave the company"); 
         } 
     } 
 }
