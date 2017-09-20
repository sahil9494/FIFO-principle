import java.util.*;

// main method to take proper input from the user and solve the problem in hand


public class tester{

	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		
		SinglyLinkedList<Integer> thequeue= new SinglyLinkedList<Integer>();
		
		System.out.println("How many days do you wish to hold on to the stock?");
		int d=in.nextInt();
		int totalshares=0;
		while(d>0){
			System.out.println("Please enter the number of shares you are buying today:");
			String nums=in.next();	
			int numshares=Integer.parseInt(nums);
			
			
			
			System.out.println("Please enter the Buying price for today:");
			int buy=in.nextInt();
			
			thequeue.enqueue(numshares, buy);
			
			d--;
			
		totalshares+=numshares;
						
		}
		System.out.println(thequeue.getSize());
		System.out.println(thequeue);
		System.out.println("first in queue: \n " +thequeue.first().toString());
		
		System.out.println("Your desired shareholding time has been completed");
		
		System.out.println("How many shares do you want to sell?");
		int sharesell=in.nextInt();
		
		System.out.println("What is the Selling price?");
		int sell=in.nextInt();
	
		
		if(sharesell>totalshares){
			
		
		System.out.println("Cannot sell more shares than what you possess.Please check the quantity to be sold and enter it again.");
		System.out.println();
		System.out.println("Do you wish to correct your mistake(one chance will be given)?");
		String answer=in.next();
		if(answer.toLowerCase().equals("yes")){
		System.out.println("How many shares do you want to sell?");
		sharesell=in.nextInt();
		
		System.out.println("What is the Selling price?");
		sell=in.nextInt();
		System.out.println("The profit/loss on the sale of the shares is:" +thequeue.capitalgain(sharesell,sell)+" $");
		}

		else{
			System.out.println("The program will now exit");
			System.out.println("Have a good day!");
		}
		}
		else{
			System.out.println("The profit/loss on the sale of the shares is:" +thequeue.capitalgain(sharesell,sell)+" $");	
			System.out.println("Have a good day!");
		}
		

		}
	
	
	
}
