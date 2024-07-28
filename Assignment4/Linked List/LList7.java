import java.util.*;
public class LList7{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = next;
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

    public void lastNthNode(int n){
        int length=0;
        Node temp=head;
        while(temp!=null) {
            temp = temp.next;
            length++;
        }
        //System.out.println(length);
        temp=head;
        for(int i=1;i<=(length-n); i++)
            temp=temp.next;
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         LList7 list = new LList7();
        list.addBeginning(2);
        list.addEnding(4);
        list.addEnding(6);
        list.addEnding(8);
        list.addEnding(10);
        list.addEnding(12);

        list.display();
        System.out.println("Enter the nth node from last: ");
        int n = input.nextInt();
        list.lastNthNode(n);
    }

}
