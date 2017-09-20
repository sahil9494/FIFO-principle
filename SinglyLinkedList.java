import java.util.*;
/*
 * This class will make the linked list and implement the abstract data type queue to solve
 * the famous accounting problem/ concept called FIFO.
 * I will implement a queue of shares and will calculate the profit/ loss of the user 
 * when he/she buys shares for a number of days and sells it when the holding period is over
 * 
 */



public class SinglyLinkedList<E> implements Queue<E>{

	private IntNode first;
	private IntNode last;
	private int size;
	private IntNode sentinnel;
	
	
	// constructor to initialize the linked list
	
	public SinglyLinkedList(){
		size=0;
		first=new IntNode<E>();
		first.setNext(last);
		
	}
	// checks if the linked list is empty
	
	public boolean isEmpty(){
		return size==0;
		
	}
	
	// returns the first node in the queue
	
	public IntNode first(){
	
		if(isEmpty()){
			System.out.println("Nothing in the front");
			
		}
		else{
			E temp1=(E) first.getNext().getShares();
			E temp2=(E) first.getNext().getPrice();
			IntNode<E> something= new IntNode<E>(temp1,temp2);
			sentinnel=something;			
		}			
		return sentinnel;
	}
	// adds an item at the back of the queue
	
	public void enqueue(E e1, E e2){
		IntNode<E> something= new IntNode<E>(e1,e2);
		if(isEmpty()){
			IntNode<E> temp=first;
			first.setNext(something);
			something.setNext(last);					
		}
		else{
			IntNode<E> temp=first;
			while(temp.getNext()!=null){
				temp=temp.getNext();
				
			}
			temp.setNext(something);
			something.setNext(last);
			}
		size++;
		}
	// removes the item from the front of the queue
	
	
	public void dequeue(){
	
		if(isEmpty()){
			System.out.println("There is nothing in the list");
			
		}
		else{
			IntNode<E> temp=first.getNext();
			first.setNext(temp.getNext());
				
		}
			size--;
		
	}
	// size or how many size you wanna hold on to a stock??
	public int getSize(){
		return size;
	}
	// prints out the contents of the Node
	
	public String toString(){
		String s="";
		IntNode<E> current=first;
		while(current.getNext()!=null){
			current=current.getNext();
			s+="NumShares->"+current.getShares()+" "+"Price-> "+" "+current.getPrice()+"\n";
		}
		
		return s;
	}
	
	public int capitalgain(int a, int b){
		int profit=0;
		
		while(a>0 && first.getNext()!=null){
			
			
		if(a>(int)first.getNext().getShares()){
			profit+=(int)first.getNext().getShares()*((b)-(int)first.getNext().getPrice());
			a-=(int)first.getNext().getShares();
			}
			else{
			
				profit+=a*((b)-(int)first.getNext().getPrice());
				
				a-=a;
			}
			first=first.getNext();
			
		}
		return profit;
	}
}
