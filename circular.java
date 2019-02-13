import java.util.*;
class node
{
   int data;
   node next;
   node head;

   node()
   {

   }
   node(int data)
   {
    this.data=data;
    this.next=null;

   }
   node add(int data)
   {
     node n=new node(data);
     node temp=head;

     if(head==null)
     {
      head=n;
      n.next=head;
     }
     else
     {
       while(temp.next!=head)
       {
        temp=temp.next;
       }
       temp.next=n;
       n.next=head;
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
   void print(node head)
   {
    node temp=head;
    while(temp.next!=head)
    {
     System.out.println(temp.data);
     temp=temp.next;
    }
    System.out.println(temp.data);
    System.out.println(temp.next);
   }
}

class circular
{
  public static void main(String [] args)
  {
     int t,num;
    node h=null;
    Scanner sc=new Scanner(System.in);
    node my=new node();
    t=sc.nextInt();
    for(int i=1;i<=t;i++)
    {
      System.out.println("enter "+i+" no");
     num=sc.nextInt();
    
      h=my.add(num);
    }
     my.print(h);
     System.out.println("enter the no to enter at defined poisition");
     int val=sc.nextInt();
     System.out.println("enter the poisition");
     int pos=sc.nextInt();
     h=my.any(val,pos,h);
     my.print(h);
  }
}
