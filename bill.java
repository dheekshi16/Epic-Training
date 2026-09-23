import java.util.Scanner;
class Customer {
    int cusId;
    String cusName;
    String cusPhNo;
    int cusAge;
    Customer[] cusArr = new Customer[100];
    int index = 0;
    Customer() {

    }

    Customer(int id, String n, String p, int a) {
        this.cusId = id;
        this.cusName = n;
        this.cusPhNo = p;
        this.cusAge = a;
    }

    void createCustomer() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cus id:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter the Cus name:");
        String name = in.nextLine();
        System.out.println("Enter the Cus phno:");
        String phno = in.nextLine();
        System.out.println("Enter the Cus age:");
        int age = in.nextInt();
        Customer cus = new Customer(id, name, phno, age);
        cusArr[index] = cus;
        index++;
        System.out.println("Customer Created Successfully");
    }

    void displayCustomer() {
        for (int i = 0; i < index; i++) {
            System.out.println("Customer ID: " + cusArr[i].cusId);
            System.out.println("Name: " + cusArr[i].cusName);
            System.out.println("Ph no: " + cusArr[i].cusPhNo);
            System.out.println("Age: " + cusArr[i].cusAge);
        }
    }

    void GetCusbyID() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Customer ID:");
        int id = in.nextInt();
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (cusArr[i].cusId == id) {
                System.out.println("Name: " + cusArr[i].cusName);
                System.out.println("Ph No: " + cusArr[i].cusPhNo);
                System.out.println("Age: " + cusArr[i].cusAge);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not Found");
        }
    }
}


class Product {
    String proName;
    String proBrand;
    int proPrice;
    Product[] proArr = new Product[100];
    int index = 0;
    Product() {

    }

    Product(String n, String b, int p) {
        this.proName = n;
        this.proBrand = b;
        this.proPrice = p;
    }

    void createProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Pro name:");
        String name = in.nextLine();
        System.out.println("Enter the Pro brand:");
        String brand = in.nextLine();
        System.out.println("Enter the Pro price:");
        int price = in.nextInt();
        Product pro = new Product(name, brand, price);
        proArr[index] = pro;
        index++;
        System.out.println("Product Created Successfully");
    }

    void displayProduct() {
        for (int i = 0; i < index; i++) {
            System.out.println("Product ID: " + i);
            System.out.println("Name: " + proArr[i].proName);
            System.out.println("Brand: " + proArr[i].proBrand);
            System.out.println("Price: " + proArr[i].proPrice);
        }
    }

    void GetProbyID() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Product ID:");
        int id = in.nextInt();
        if (id >= 0 && id < index) {
            System.out.println("Name: " + proArr[id].proName);
            System.out.println("Brand: " + proArr[id].proBrand);
            System.out.println("Price: " + proArr[id].proPrice);
        } else {
            System.out.println("Product not Found");
        }
    }
}


class Bill {
    Product pro;

    int billId;
    int cusId;
    int GrandTotal;
    BillProduct bpObj;
    Bill[] billArr = new Bill[100];
    int index = 0;

    Bill() {

    }

    Bill(Product p) {
        this.pro = p;
    }

    Bill(int billId, int cusId, BillProduct obj) {
        this.billId = billId;
        this.cusId = cusId;
        this.bpObj = obj;
    }

    void createBill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer id:");
        int id = in.nextInt();
        System.out.println("Enter the no of products:");
        int n = in.nextInt();
        BillProduct bp = new BillProduct();
        int grandtotal = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Product Id:");
            int proId = in.nextInt();
            if (proId < 0 || proId >= pro.index) {
                System.out.println("Product Not Found");
                i--;
                continue;
            }

            System.out.println("Product Name: "+ pro.proArr[proId].proName);
            System.out.println("Product Price: " + pro.proArr[proId].proPrice);
            System.out.println("Enter the Product quantity:");
            int proQua = in.nextInt();
            int amount = proQua * pro.proArr[proId].proPrice;
            grandtotal = grandtotal + amount;
            BillProduct bplist =  new BillProduct(proId, proQua);
            bp.billproArr[i] = bplist;
        }

        bp.count = n;
        Bill bill = new Bill(index, id, bp);
        bill.GrandTotal = grandtotal;
        billArr[index] = bill;
        index++;
        System.out.println("GrandTotal: " + grandtotal);
        System.out.println("Bill Created Successfully");
    }

    void displayBill() {
        if (index == 0) {
            System.out.println("No Bill Found");
            return;
        }
        for (int i = 0; i < index; i++) {
            Bill temp = billArr[i];
            System.out.println("Bill ID: " + temp.billId);
            System.out.println("Customer ID: " + temp.cusId);
            BillProduct temppro = temp.bpObj;
            System.out.println("No of Product: " + temppro.count);
            for (int j = 0; j < temppro.count; j++) {
                int pId = temppro.billproArr[j].proId;
                int qty = temppro.billproArr[j].proQua;
                System.out.println("Product ID: " + pId);
                System.out.println("Quantity: " + qty);
                System.out.println("Product Name: " + pro.proArr[pId].proName);
                System.out.println("Product Price: " + pro.proArr[pId].proPrice);
                int amount = qty * pro.proArr[pId].proPrice;
                System.out.println("Amount: " + amount);
            }
            System.out.println("Grand Total: " + temp.GrandTotal);
        }
    }

    void GetBillbyID() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Bill ID:");
        int id = in.nextInt();
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (billArr[i].billId == id) {
                found = true;
                Bill temp = billArr[i];
                System.out.println("Bill ID: " + temp.billId);
                System.out.println("Customer ID: " + temp.cusId);
                BillProduct temppro = temp.bpObj;
                System.out.println("No of Product: "+ temppro.count);
                for (int j = 0; j < temppro.count; j++) {
                    int pId = temppro.billproArr[j].proId;
                    int qty = temppro.billproArr[j].proQua;
                    System.out.println("Product ID: " + pId);
                    System.out.println("Quantity: " + qty);
                    System.out.println("Product Name: " + pro.proArr[pId].proName);
                    System.out.println("Product Price: " + pro.proArr[pId].proPrice);
                    int amount = qty * pro.proArr[pId].proPrice;
                    System.out.println("Amount: " + amount);
                }
                System.out.println("Grand Total: " + temp.GrandTotal);
                break;
            }
        }
        if (!found) {
            System.out.println("Bill Not Found");
        }
    }
}


class BillProduct {
    int proId;
    int proQua;
    int count = 0;
    BillProduct[] billproArr = new BillProduct[100];
    BillProduct() {

    }

    BillProduct(int id, int qua) {
        this.proId = id;
        this.proQua = qua;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Customer cus = new Customer();
        Product pro = new Product();
        Bill bill = new Bill(pro);

        while (true) {
            System.out.println(
                    "1)Create Customer \n 2)Display Customer \n 3)Get Customer by ID \n 4)Create Product \n 5)Display Product \n 6)Get Product by ID \n 7)Buy Product \n 8)Display Bill \n 9)Get Bill By ID" );
            int n = in.nextInt();
            switch (n) {
                case 1: {
                    cus.createCustomer();
                    break;
                }
                case 2: {
                    cus.displayCustomer();
                    break;
                }
                case 3: {
                    cus.GetCusbyID();
                    break;
                }
                case 4: {
                    pro.createProduct();
                    break;
                }
                case 5: {
                    pro.displayProduct();
                    break;
                }
                case 6: {
                    pro.GetProbyID();
                    break;
                }
                case 7: {
                    bill.createBill();
                    break;
                }
                case 8: {
                    bill.displayBill();
                    break;
                }
                case 9: {
                    bill.GetBillbyID();
                    break;
                }
                default: {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
