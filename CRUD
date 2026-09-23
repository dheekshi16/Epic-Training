class Node{
    int data;
    Node address;
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node obj1 = new Node(10,null);
		Node head = obj1;
		Node obj2 = new Node(20,null);
		obj1.address = obj2;
		Node obj3 = new Node(30,null);
		obj2.address = obj3;
		Node obj4 = new Node(40,null);
		obj3.address = obj4;
		System.out.println(head.address.address.address.data);
		Node temp = head;
		while (temp != null) {
		    System.out.println(temp.data);
		    temp = temp.address;
		}
	}
}


import java.util.Scanner;

class Node{
    int data;
    Node address;
    Node head = null,prev=null;
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
    
    Node(){
        
    }
    
    
    void insertData(Scanner in){
        System.out.println("Enter the no of Data: ");
            int n = in.nextInt();//3-->10,20,30
            for(int i=0;i<n;i++){
                int val = in.nextInt();//10
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    prev=obj;
                }
                else{
                    prev.address = obj;
                    prev=obj;
                }
            }
    }
    
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);//40
		    temp=temp.address;//null
		}
    }
    
    void insertFront(Scanner in){
        System.out.println("Enter value to insert at front: ");
        int val = in.nextInt(); 
        Node newNode = new Node(val, null);
        newNode.address = head;
        head = newNode;
    }
    void insertMiddle(Scanner in){
        System.out.println("Enter the position: ");
        int n = in.nextInt();
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        Node newNode = new Node(val, null);
        Node temp = head;
        for(int i=0; i<n-2; i++){
            temp = temp.address;
        }
        newNode.address = temp.address;
        temp.address = newNode;
        
    }
    void insertEnd(Scanner in){
        System.out.println("Enter value to insert at end: ");
        int val = in.nextInt();
        Node newNode = new Node(val, null);
        if(head == null){
            head = newNode;
            prev = newNode;
        }
        else{
            prev.address = newNode;
            prev = newNode;
        }
    }
    
    void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.address;
    }
    
    
    void deleteMiddle(Scanner in){
        System.out.println("Enter the position: ");
        int n = in.nextInt();
        Node temp = head;
        for(int i=0; i<n-2; i++){
            temp = temp.address;
            
        }
        temp.address = temp.address.address;
    }
    
    void deleteEnd(){
        Node temp = head;
        while(temp.address.address != null){
            temp = temp.address;
        }
        temp.address = null;
        prev = temp;
    }
    void revDisplay(Node temp){
        if (temp == null){
            return;
        }
        revDisplay(temp.address);
        System.out.println(temp.data);
    }
}
public class Main
{
	public static void main(String[] args) {    
	    Scanner in = new Scanner(System.in);
	    Node node = new Node();
	    while(true){
	        System.out.print("\n1)Insert Data \n2)Display Data \n3)Insert Front \n4)Insert Middle \n5)Insert End \n6)Delete Front \n7)Delete Middle \n8)Delete End \n9)Reverse Display");
	        int n = in.nextInt();
	        switch(n){
		        case 1:{
		            node.insertData(in);
		            break;
		        }
		        case 2:{
		            node.displayData();
		            break;
		        }
		        case 3:{
		            node.insertFront(in);
		            break;
		        }
		        case 4:{
		            node.insertMiddle(in);
		            break;
		        }case 5:{
		            node.insertEnd(in);
		            break;
		        }
		        case 6:{
		            node.deleteFront();
		            break;
		        }
		        case 7:{
		            node.deleteMiddle(in);
		            break;
		        }
		        case 8:{
		            node.deleteEnd();
		            break;
		        }
		        case 9:{
		            node.revDisplay(node.head);
		            break;
		        }
		        default: 
		            System.out.println("invalid");
		    }
	    }
	}
}
