// node class 


public class IntNode<E> {

	private E shares;
	private E price;
	
	private IntNode<E> next;
	
	public IntNode(){
		
	}
	public IntNode(E shares, E price){
		this.shares=shares;
		this.price=price;
		
		next=null;
	}
	public E getShares(){
		return shares;
		
	}
	public E getPrice(){
		return price;
		
	}
	public void setShares(E shares){
		
		this.shares=shares;
		
	}
	public void setPrice(E price){
		this.price=price;
		
	}
	public IntNode getNext(){
		return next;
		
	}
	
	public void setNext(IntNode n){
		next=n;
	}
	public String toString(){
		return ""+shares +"" + price;
		
		
	}
	
	
	
}
