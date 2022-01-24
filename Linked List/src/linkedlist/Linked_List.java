/***Created By Mohit*********/
/***Time Complexity is O(n)**/
package linkedlist;
import java.io.*;
import java.util.Scanner;
public class Linked_List 
{
	Node head;
	public class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	PrintStream ps =System.out;
	public void add(int data)
	{
		    Scanner sc = new Scanner(System.in);
			int choice ;
			ps.println("Linked List Addititon ");
			ps.println("Where do you want to add the element");
			ps.println("1) At the beginning ");
			ps.println("2) At the end");
			ps.println("3) After a given node");
			ps.println("4) Exit");
			choice= sc.nextInt();
			if (choice ==1)
			{
				Node new_node =new Node(data);//we allocated the node and put in the data
				new_node .next=head;// make the next of new node as head
				head=new_node;//movve the head to point new node
				return;
			}
			else if (choice ==2)
			{
				if(head!=null)
				{
				Node new_node =new Node(data);
				new_node.next=null;//it will be the last node so the next of last node is null
				//we will traverse till the last node and add the value
				Node last=head;
				while(last.next!=null)
				{
					last=last.next;//traversing the linked list
				}
				last.next=new_node;
				return;
				}
				else 
				{
					head=new Node(data);//if linked list is empty make new node as head
				    return;	
				}
			}
			else if (choice ==3)
			{
				Node new_node =new Node(data);
				ps.println(" enter the position after which you want to insert a node");
				int pos=sc.nextInt();
				if (head !=null && pos==0)
				{
					new_node.next=head;
					head=new_node;
				}
				int i=0;
				Node last=head;
				Node prev=null;
				while(i<pos)
				{
					prev=last;
					last=last.next;
					if(last==null)
					{
						break;
					}
					i++;
				}
				new_node.next=last;
				prev.next=new_node;
				ps.println("value is inserted");
				return;
			}
			else if(choice==4)
			{
				System.exit(0);
			}
			sc.close();
	}
	private void extracted() 
	{
	}
	public void delete(int pos)
	{
		if(head==null)
		{
			ps.println("linked List is empty");
		}
		Node temp= head;
		if(pos==0)
		{
			head=temp.next;//if pos==0 that means delete head
			extracted();
		}
		for(int i=0;temp!=null&&i<pos-1;i++)
		{
			temp=temp.next;//find prev_node of the node to be deleted , by iterating it to pos-1
		}
		if(temp==null || temp.next==null)
		{
			extracted();
		}
		// NOde temp.next is the node to be deleted
		Node next=temp.next.next;
		temp.next=next;
		ps.println("Node is deleted");
		return;
	}
	public void Delete() 
	{
		head=null;
		ps.println("LinkedList is Deleted ");
	}
	int  length()
	{ /* Returns count of nodes in linked list */
		Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
	}
	Node reverse()
    {
		Node node =head;//reversing the list fom head
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList()
    {
    	Node node =head;//if we want to print from the second element , change head
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]) throws Exception
    {    	
    	Linked_List ll=new Linked_List();
    	Scanner sc=new Scanner(System.in);
    	PrintStream ps =System.out;
    	int ch;
    	do
    	{
    	ps.println("Linked List Implementation");
    	ps.println("What would you like to do");
    	ps.println("1) Add an element");
    	ps.println("2) Delete an element ");
    	ps.println("3) Delete the linked list");
    	ps.println("4) Print the list ");
    	ps.println("5) Reverse the list");
    	ps.println("6) Exit ");
        ch=sc.nextInt();
    	if(ch==1)
    	{
    		ps.println("enter the value to be inserted");
    		int value=sc.nextInt();
    		ll.add(value);
    	}
    	else if(ch==2)
    	{
    		ps.println("enter the position of the element to be deleted");
    	    int value=sc.nextInt();
    	    ll.delete(value);
    	}
    	else if (ch==3)
    	{
    		ll.Delete();
    	}
    	else if (ch==4)
    	{
    		ll.printList();
    	}
    	else if (ch==5)
    	{
    		ll.reverse();
    	}
    	else 
    		System.exit(0);
    }while(ch!=6);
    	sc.close();
    }
}
