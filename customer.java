import java.util.Scanner;


class Customer{
    String cusName;
    String cusEmail;
    Node li;
    
    Customer(Node li){
        this.li = li;
    }
    
    Customer(String name,String email){
        this.cusName = name;
        this.cusEmail = email;
    }
    
    void createCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer Name: ");
        String name = in.nextLine();
        System.out.println("Enter the customer Email: ");
        String email = in.nextLine();
        Customer cus = new Customer(name,email);
        li.insertData(in,cus);
    }
    
    
    void displayCustomer(){
        li.displayData();
    }
    
}












class Node{
    Customer data;
    Node next;
    Node head = null,tail=null;
    
    Node(Customer data,Node add){
        this.data=data;
        this.next = add;
    }
    
    Node(){
        
    }
    
    
    void insertData(Scanner in,Customer cus){
        
            
                Node obj = new Node(cus,null);
                if(head==null){
                    head = obj;
                    tail=obj;
                }
                else{
                    tail.next = obj;
                    tail=obj;
                }
            }
    
    
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println("The customer name is: "+temp.data.cusName);
		    System.out.println("The customer name is: "+temp.data.cusEmail);
		    
		    temp=temp.next;//null
		}
    }
    
    // void insertANode(Scanner in){
    //     System.out.println("Enter the value: ");
    //     int val = in.nextInt();//55
    //     System.out.println("Enter the position: ");
    //     int pos = in.nextInt();//4
        
    //     Node newNode = new Node(val,null);//8000
    //     if(pos==1){
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     else{
    //         Node temp = head;//1000
    //     //          0<2
    //     for(int i=0;i<pos-2;i++){
    //         temp=temp.next;
    //         //i=0==>temp=2000;
    //         //i=1==>temp=3000;
    //     }
    //     //temp=3000;
    //     if(temp.next == null){
    //         tail = newNode;
    //     }
    //     newNode.next = temp.next;
    //     temp.next = newNode;
    //     }
        
    // }
    
    
    // void deleteANode(Scanner in){
    //     System.out.println("Enter the position: ");
    //     int pos = in.nextInt();//1
    //     Node temp = head;//1000
    //     if(pos==1){
    //         head = temp.next;
    //     }
    //     else{
            
    //         for(int i=0;i<pos-2;i++){
    //             temp=temp.next;
                
    //         }
    //         //temp=1000
    //         if(temp.next.next == null){
    //             tail = temp;
    //         }
    //         temp.next = temp.next.next;
            
    //     }
    //     //temp.next = 3000
    // }
}
public class Main
{
	public static void main(String[] args) {
	    
	 
	    Scanner in = new Scanner(System.in);
	    
	    Node li = new Node();
	    Customer cus = new Customer(li);
	    while(true){
	        System.out.println("1) Create Customer 2) Display Customer");
	        int n = in.nextInt();
	        switch(n){
	            case 1:{
	                cus.createCustomer();
	                break;
	            }
	            case 2:{
	                cus.displayCustomer();
	                break;
	            }
	            
	        }
	    }
	    
	
	}
}
