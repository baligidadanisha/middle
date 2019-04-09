package middle;

class Node
{
	int data;
	Node next;
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}
}
/**
 * 
 * @param head
 *
 */
public class middlelinked {
	int ele(Node head)
	{
		Node f=head;
		Node s=head;
		while(f!=null&&f.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
		return s.data;
	}

}
