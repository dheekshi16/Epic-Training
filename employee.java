abstract class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
    }
    abstract double salarycalculate();
}


class PermanentEmployee extends Employee {

    double bonus;

    PermanentEmployee(int employeeId, String employeeName,
                      double basicSalary, double bonus) {

        super (employeeId,employeeName,basicSalary);
        this.bonus = bonus;
    }

    @Override
    double salarycalculate() {

        return basicSalary+bonus;
    }
}

class ContractEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int employeeId, String employeeName,
                     double basicSalary, int hoursWorked,
                     double hourlyRate) {

        super(employeeId,employeeName,basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double salarycalculate() {

        return hoursWorked*hourlyRate;
    }
}


public class Main {

    public static void main(String[] args) {
        PermanentEmployee p =
            new PermanentEmployee(101, "Arun", 30000, 5000);
        ContractEmployee c =
            new ContractEmployee(102, "Rahul", 0, 160, 250);
        p.displayEmployee();
        System.out.println("Total Salary : " +p.salarycalculate());

        System.out.println();

        c.displayEmployee();
        System.out.println("Total Salary : " +c.salarycalculate());
    }
}


import java.util.*;
abstract class Payment {
    String CustomerName;
    int TransactionID;
    int Amount;
    
    Payment(String CustomerName, int TransactionID,int Amount){
        this.CustomerName = CustomerName;
        this.TransactionID = TransactionID;
        this.Amount = Amount;
    }
    
    void displayPaymentDetails() {
        System.out.println("Transaction ID : " + TransactionID);
        System.out.println("Customer Name  : " + CustomerName);
        System.out.println("Base Amount     : ₹" + Amount);
    }
    
    abstract boolean Validatepayment();
    abstract void Processpayment();
    abstract double transactionfee();
    abstract double cashback();
     double finalamount(){
        return Amount + transactionfee() - cashback();
    }
}

class CreditCardPayment extends Payment{
    String CardNo;
    CreditCardPayment(String CustomerName,int TransactionID,int Amount,String CardNo){
        super(CustomerName,TransactionID,Amount);
        this.CardNo = CardNo;
    }
    
    boolean Validatepayment(){
        if(CardNo.length() == 16){
            return true;
        }
        else{
             System.out.println( "Enter correct Card Number");
             return false;
        }
    }
    
    void Processpayment(){
        System.out.println("Transaction Process though CreditCardPayment");
    }
    
    double transactionfee(){
        return Amount*0.02;
    }
    
    double cashback(){
        return Amount*0.05;
    }
}


class UPIPayment extends Payment{
    String UPIid;
    UPIPayment(String CustomerName,int TransactionID,int Amount,String UPIid){
        super(CustomerName,TransactionID,Amount);
        this.UPIid = UPIid;
    }
    boolean Validatepayment(){
        if(UPIid != null && UPIid.contains("@")){
            return true;
        }
        else{
             System.out.println( "Enter correct UPIID");
             return false;
        }
    }
    
    void Processpayment(){
        System.out.println("Transaction Process though UPIPayment");
    }
    
    double transactionfee(){
        return Amount*0.005;
    }
    
    double cashback(){
        return Amount*0.02;
    }
}

class NetBankingPayment extends Payment{
    String AccNo;
    NetBankingPayment(String CustomerName,int TransactionID,int Amount,String AccNo){
        super(CustomerName,TransactionID,Amount);
        this.AccNo = AccNo;
    }
    
    boolean Validatepayment(){
        if(AccNo != null && AccNo.length() == 12){
            return true;
        }
        else{
             System.out.println( "Enter correct AccNo");
             return false;
        }
    }
    
    void Processpayment(){
        System.out.println("Transaction Process though NetBankingPayment ");
    }
    
    double transactionfee(){
        return Amount*0.01;
    }
}
public class Main
{
	public static void main(String[] args) {
		CreditCardPayment c = new CreditCardPayment("Thilakshitha",7337,73000,"1234567890737373");
		UPIPayment u = new UPIPayment ("Akshaya",3773,37000,"aksh@34");
		NetBankingPayment n = new NetBankingPayment("Amildhini",7373,33700,"987654321077");
		
		if (c.Validatepayment() == true){
		    c.displayPaymentDetails();
		    c.Processpayment();
		    System.out.println("Transactionfee: "+ c.transactionfee());
		    System.out.println("Cashback: "+ c.cashback());
		    System.out.println("Finalamount: "+ c.finalamount());
		}
		System.out.println();
		if (u.Validatepayment() == true){
		    u.displayPaymentDetails();
		    u.Processpayment();
		    System.out.println("Transactionfee: "+ u.transactionfee());
		    System.out.println("Cashback: "+ u.cashback());
		    System.out.println("Finalamount: "+ u.finalamount());
		}
		System.out.println();
		if (n.Validatepayment() == true){
		    n.displayPaymentDetails();
		    n.Processpayment();
		    System.out.println("Transactionfee: "+ n.transactionfee());
		    System.out.println("Cashback: "+ n.cashback());
		    System.out.println("Finalamount: "+ n.finalamount());
		}
	}
}

    
    double cashback(){
        return Amount*0.01;
    }
}
