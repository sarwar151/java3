import java.util.Scanner; 
  
 public class Triangle_Type { 
     public static void main(String[] args) { 
         float a,b,c; 
         Scanner sc=new Scanner(System.in); 
         System.out.println("Enter the three sides of the triangle"); 
         a=sc.nextFloat(); 
         b=sc.nextFloat(); 
         c=sc.nextFloat(); 
         if(a==b || b==c || a==c){ 
             System.out.println("Triangle is isosceles"); 
         } else if (a==b && b==c) { 
             System.out.println("Triangle is equilateral"); 
         } 
         else { 
             System.out.println("Triangle is scalene"); 
         } 
     } 
 }
