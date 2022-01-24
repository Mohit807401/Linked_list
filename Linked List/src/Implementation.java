
public class Implementation 
{
public static void main(String args[])
{
	linked_list list=new linked_list();
	list.insert(10);
	list.insert(20);
	list.show();
	list.insert(30);
	list.show();
	list.insert(40);
	list.insert(50);
	list.show();
	list.delete(4);
	list.show();
	
}
}
class linked_list {
	   Node head;
	   public void insert(int data)
	   {
		   Node n= new Node();
		   n.data=data;
		   n.next=null;
		   if(head==null)
		   {
			   head=n;
		   }
		   else 
		   {
			   Node n1=head;
			   while(n1.next!=null)
			   {
				   n1=n1.next;
			   }
			   n1.next=n;
		   }
	   }
	   public void delete(int ind)
	   {
		   Node n2=head;
		   for(int i=0; n2.next!=null;i++)
		   {
			   
			   if(ind==i)
			   {
				   
				   continue;
			   }
			   n2=n2.next;
			   System.out.println(n2.data);
		   }
		   
	   }
	   public int index()
	   {
		   int i=0;
		  Node n=head;
		  while(n.next!=null)
		  {
			  
			  i++;
			  System.out.print(i);
			  n=n.next;
		  }
		  System.out.print(i+1);
		  return i;
		}
	   public void show()
	   {
		   int i=0;
		   Node n=head;
		   while(n.next!=null)
		   {
			  i++;
			  System.out.print(i+" ");
			   System.out.println(n.data);
			   n=n.next;
			   
		   }
		   System.out.print((i+1)+" ");
		   System.out.println(n.data);
		   
		   
	   }
	}
class Node 
{
	int data;
	Node next;
}