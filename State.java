lass MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		MyData t2 = new MyData();
		
		t1.start();//5s
		Thread.sleep(100);
		System.out.println(t1.getState());//runnable
		t2.start();
		Thread.sleep(100);
		System.out.println(t2.getState());//timed waiting
		
		
	}
}

                                                                                                                                    .

class MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		MyData t2 = new MyData();
		
		t1.start();//5s
		t2.start();
		Thread.sleep(100);
		System.out.println(t1.getState());//runnable
		System.out.println(t2.getState());//timed waiting
		
		
	}
}

                                                                                                                                          .

class MyData{
    synchronized void display(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class Main
{
	public static void main(String[] args) {
		MyData t1 = new MyData();
		Thread th1 = new Thread(()->{
		    t1.display();
		});
		Thread th2 = new Thread(()->{
		    t1.display();
		});
		th1.start();
		th2.start();x
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		
	}
}
                                                                                                                                                   .
class MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("THREAD IS RUNNING");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		t1.start();
		Thread.sleep(100);
		System.out.println(t1.getState());
		t1.join();//Waiting
		System.out.println("MAIN THREAD");
	}
}


// ThreadObj.getState();

// new------>thread is created

// runnable----->its running or it is ready to run

// timed waiting--->one thread is waiting till the time is completed

// blocked---->One thread will be waiting until the running thread completes its task

// waiting---->

// terminated----thread is completed







class MyData{
    void display(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("THREAD");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData th = new MyData();
		Thread t1 = new Thread(()->{
		    th.display();
		});
		Thread t2 = new Thread(()->{
		    try{
		        t1.join();
		    }
		    catch(InterruptedException e){
		        
		    }
		});
		t1.start();
		t2.start();
		Thread.sleep(1000);//if 5000 ?
		System.out.println(t2.getState());
	}
}

class MyData{
    synchronized void waitMethod(){
        System.out.println("Before Wating");
        try{
            wait();
        }
        catch(Exception e){
            
        }
        
        System.out.println("Resumed");
    }
    synchronized void notifyMethod(){
        System.out.println("NOTIFY IS TRIGGERED");
        try{
            notifyAll();
        }
        catch(Exception e){
            
        }
    }
}

public class Main{
    public static void main(String[] a) throws InterruptedException{
        MyData md = new MyData();
        
        Thread t1 = new Thread(()->{
            md.waitMethod();
        });
        Thread t3 = new Thread(()->{
            md.waitMethod();
        });
        Thread t2 = new Thread(()->{
            md.notifyMethod();
        });
        
        t1.start();
        t3.start();
        Thread.sleep(2000);
        t2.start();
    }
}
