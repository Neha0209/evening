import java.util.*;
class node
{
	int data;
	node next;
	node head=null;
   node()
   {

   }
	public node(int data)
	{
	  this.data=data;
	  this.next=null;
	}
	public node add(int data)
	{
      node n=new node(data);
      if(head==null)
      {
       head=n;
      }
      else
      {
        node temp=head;
        while(temp.next!=null)
        {
        temp=temp.next;
        }
        temp.next=n;
      }
    return head;
	}
	public void  print(node h)
	{
       node temp=h;
       System.out.println("the data is");
       while(temp!=null)
       {
       	      System.out.println(temp.data);
       temp=temp.next;
 
       }
	}
	node first(node h,int f)
	{
		head=h;
		node temp=head;
		node n=new node(f);
		if(head==null)
		{
			head=n;
		}
		else
		{
           n.next=temp;
           head=n;
		}
		return head;
	}
	node any(int val,int pos,node h)
	{
		node head=h;
		node n=new node(val);
		node prev=head;
		int count=1;
		while(count<pos-1)
		{
			prev=prev.next;
			count++;
		}
		node curr=prev.next;
         prev.next=n;
         n.next=curr;
         return head;
	}
	node reverse(node head)
	{
		node previous=null;
		node current=head;
		node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
}

class link
{
	public static void main(String [] args)
	{
	  int t,num;
	  node h=null;
	  Scanner sc=new Scanner(System.in);
	  node my=new node();
	  t=sc.nextInt();
	  for(int i=0;i<t;i++)
	  {
	   num=sc.nextInt();
        h=my.add(num);
	  }
     my.print(h);
     System.out.println("enter the no to enter at first poisition");
     int f=sc.nextInt();
     h=my.first(h,f);
     my.print(h);
     System.out.println("enter the no to enter at defined poisition");
     int val=sc.nextInt();
     System.out.println("enter the poisition");
     int pos=sc.nextInt();
     h=my.any(val,pos,h);
     my.print(h);
    h= my.reverse(h);
    my.print(h);
	}
}