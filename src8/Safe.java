 
//Thread unsafe - Two Threads acting on same object
class Reserve1 implements Runnable{

	//available berths are 1
	int available=3;
	int wanted;
	
	//accept wanted berths at runtime
	Reserve1(int i){
		wanted=i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
		//display available berths
		System.out.println("Available Berths:"+available);
		//if available berths are more than wanted berths
		if(available>=wanted) {
			//get the passenger name
			String name=Thread.currentThread().getName();
			//allot the berth to him
			System.out.println(wanted+" Berths reserved for "+name);
			try {
				Thread.sleep(2000);//wait for printing the ticket
				available=available-wanted;
			}
			catch(InterruptedException e) {}
		}
		//if available berths are less, display sorry
		else {
			System.out.println("Sorry, no berths");
		}
	}
	}
	
}

public class Safe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tell that 1 berth is needed
		Reserve1 obj=new Reserve1(2);
		
		//attach first thread to the object
		Thread t1=new Thread(obj);
		//attach second thread to the object
		Thread t2=new Thread(obj);
		
		//take the thread names as person names
		t1.setName("First Person");
		t2.setName("Second Person");
		
		//send the requests for berth
		t1.start();
		t2.start();
		
		
	}

}
