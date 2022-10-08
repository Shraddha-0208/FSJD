import java.io.*;
//To create a thread and run it let the class extends Thread or implement 
//Runnable interface
class MyThread1 extends Thread{
	//write run() method inside this class
	boolean stop=false;
	public void run() {
		//only this code is executed by the thread
		for(int i=1;i<=1000000;i++) {
			System.out.println(i);
			if(stop==true) 
				return;//come out of run
		}
	}
}
//another class
public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		//create an object of MyThread class
		MyThread1 obj=new MyThread1();
		
		//create a thread and attach it to the object of MyThread class
		Thread t=new Thread(obj);
		
		//now run the thread on the object
		t.start();//now this thread will execute the code 
		//inside run() method of MyThread class
		
		//stop the thread when Enter key is pressed
		System.in.read();//wait till Enter key pressed
		obj.stop=true;
	}

}
