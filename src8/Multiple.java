//WAP showing two threads working simultaneously upon two objects

//Two THreads performing two tasks at a time-Theatre example
class MyThread1 implements Runnable{

	//declare a string to represent the task
	String str;
	MyThread1(String str){
		this.str=str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(str+" : "+i);
			try {
				Thread.sleep(4000);//cease thread execution for 2000 millisecs
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multiple {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		//create two objects to represent two tasks
		MyThread1 obj1=new MyThread1("Cut the ticket");
		MyThread1 obj2=new MyThread1("Show the seat");
		
		//Create two Threads and attach then to the two object
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		//start the thread
		t1.start();
		t2.start();
	}

}
