import java.util.Scanner; 
 public class Steel_Grade { 
     public static void main(String[] args) { 
         float hardness,cc,ts; 
         Scanner sc=new Scanner(System.in); 
         System.out.println("Enter the hardness,carbon content and tensile strength of steel"); 
         hardness= sc.nextFloat(); 
         cc=sc.nextFloat(); 
         ts= sc.nextFloat(); 
         if (hardness>50 && cc<0.7 && ts>5600){ 
             System.out.println("Grade=10"); 
         } else if (hardness>50 && cc<0.7 && ts<=5600 ) { 
             System.out.println("Grade=9"); 
         } else if (hardness<=50 && cc<0.7 && ts>5600) { 
             System.out.println("Grade=8"); 
         } else if (hardness>50 && cc>=0.7 && ts>5600) { 
             System.out.println("Grade=7"); 
         } else if ((hardness>50 && cc>=0.7 && ts<=5600) || (hardness<=50 && cc<0.7 && ts<=5600) || (hardness<=50 && cc>=0.7 && ts>5600)) { 
             System.out.println("Grade=6"); 
         } 
         else { 
             System.out.println("Grade=5"); 
         } 
     } 
 }
