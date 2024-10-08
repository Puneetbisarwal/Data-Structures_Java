package lecture12;

import java.util.Scanner;

public class StackUse {
	
	
	
//	public static boolean isBalanced(String input) {
//		StackUsingArray stack =new StackUsingArray();
//		for(int i=0;i<input.length();i++) {
//			char currentChar =input.charAt(i);
//			if(currentChar == "{"!! currentChar)
//		}
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArray s= new StackUsingArray();
		Scanner scanner =new Scanner(System.in);
		int next =scanner.nextInt();
		while(next !=0) {
			if(next ==-1) {
				try {
					System.out.println(s.pop());	
					System.out.println("Hey");
				} catch (StackEmptyException e) {
					System.out.println("Seems like Stack is empty, dont ask to pop");
				}
				
			} else {
				try {
					s.push(next);	
				} catch (StackFullException e) {
					System.out.println("Stack is Full, dont ask to push");
				}
				
			}
			System.out.println("Enter next Element = ");
			next =scanner.nextInt();
		}
		
         s.push(10);
         s.push(20);
         s.push(30);
         while(!s.isEmpty()) {
        	 System.out.println(s.pop());
         }
        	 s.pop();
        	 
	}

}
