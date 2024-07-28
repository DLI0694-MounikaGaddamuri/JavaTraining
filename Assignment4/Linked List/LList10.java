import java.util.*;
public class LList10{
    Node head;
     class Node{
         int data;
         Node next;

         Node(int data){
             this.data = data;
             this.next=next;
         }
     }
    public void addBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode=head;
        head=newNode;
    }

    public void addEnding(int data){
        Node newNode = new Node(data);
        Node temp=head;

        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void rotateList(int n){
         for(int i=1;i<=n;i++) {
             Node temp = head, first;
             while (temp.next != null)
                 temp = temp.next;
             temp.next = head;
             first = head;
             head = head.next;
             first.next = null;
         }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         LList10 list = new LList10();
        list.addBeginning(2);
        list.addEnding(4);
        list.addEnding(6);
        list.addEnding(8);
        list.addEnding(10);
        list.addEnding(12);

        list.display();

        System.out.println("Enter number of times to rotate the list: ");
        int n = input.nextInt();
        list.rotateList(n);
        list.display();

    }
}
