package stack_queue;

public class stack {
	private  int  [] arr;
	
	private int top ;
	
	public stack ()
	{
		arr=new int[5];
		top=-1;
	}
	public stack(int cap)
	{
		arr =new int[cap];
	}
	
	public boolean isEmpty()
	{
		return top ==-1;
	}
	public boolean isfull()
	{
		return top==arr.length-1;
	}
	public void push(int item)throws Exception
	{
		if(isfull()==true)
		{
			throw new Exception("stack full hai");
		}
		
		top++;
		arr[top]=item;
	}
	public int pop()throws Exception
	{
		if(isEmpty()==true)
		{
			throw new Exception("stack khali hai");
		}
		
		int val =arr[top];
		top--;
		return val;
		
	}
	public int peek()throws Exception
	{
		if(isEmpty()==true)
		{
			throw new Exception("stack khali hai");
		}
		
		int val =arr[top];
		
		return val;
		
	}
	public int size()
	{
		return top =top+1;
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	 
	
	

}
