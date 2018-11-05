package com.min;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
            Person p = new Person(57.5f,1.672f);
            System.out.println(p.bmi());
            
            String name = "Jasmine";
            int english = 80;
            int math = 90;
            System.out.println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2);
            
            Student j = new Student("Jasmine" , 80 , 90);
            j.print();
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the temperature : (C)");
            double C = scanner.nextDouble();
            double F = (C*9.0/5)+32;
            System.out.printf("%.1f C = %.1f F\n",C,F);
            
        }
 
	}
   
	
	
    
   
