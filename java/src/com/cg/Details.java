package com.cg;

public class Details {
	 
		public static void main (String []args) {
			
			int rate;
			String size;
			int qnt;
  
	//Scanner sc = new Scanner(System.in)
	
	Pizza p1 = new Pizza("Medium",20,3);
    Pizza p2 = new Pizza("Medium",20,3);
    
    // guys iam oeriding equals method
    // checking object data
    
    if(p1.equals(p2))
    	System.out.println("Yes Identical");
    else
    	System.out.println("Not identical");
		}
}
