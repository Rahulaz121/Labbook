package com.cg;

import java.util.Scanner;
//public static void main(String[] args) {
public class Array {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String [][]data= {

			   {"Strno","Stname","Marks"},
			   {"1","Rahul","90"},
			   {"2","Prajwal","80"},
			   {"3","Bharat","70"},
			   {"4","Moin","75"},
			   {"5","chandu","85"}

	   };
			System.out.println("Enter Roll no");
			int rno=sc.nextInt();

			// Write your code
			if(rno>data.length) {
				System.out.println("student details not found");
			} else {
				System.out.println("Student details  fiund");
			}
			for(int i=0;i<data.length;i++) {
				
				for(int j=0;j<data[i].length;j++) {
					
					System.out.print("  "+data[i][j]);
				}
				System.out.println();
			}
  }
}






boolean flag=false;

		for(int i=1;i<data.length;i++) {


	                    if(rno==Integer.parseInt(data[i][0]))

	                    {

	                    	System.out.println(data[i][1]+"  "+data[i][2]);

	                    	flag=true;

	                    }


	    }	
