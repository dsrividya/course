import java.util.Arrays;
import java.util.List;

class Node{
   public int data;
   public Node next;

public Node(int data, Node next)
{
    this.data=data;
    this.next=next;
}
public  Node(int data)
{
    this.data=data;
}
}

public class InserNode {
    public static void printll(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data+"");
            head=head.next;
        }
    }
    public static Node insertHead( int val,Node head) {
        Node temp = new Node(val);
        temp.next=head;
        return temp;
    }

    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        head = insertHead(val,head);

        // Printing the linked list
        InserNode.printll(head);
    }

}
