
import java.util.*;
public class Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        List<String> list = new ArrayList<>();        
		        String array[]= {"mogili@gmail.com","santhi.3@gmail.com","santhimogili@gmail.com","SanthiMogili@yahoo.com","123456@yahoo.in","987456@gmail.com","Sangeetha15@gmail.com","santosh30@yahoo.com","kotagiri@gmail.com","san123456@yahoo.in"};
		        Collections.addAll(list, array);    
		        Scanner sc =new Scanner(System.in);
		        
		        System.out.println("Enter your email ID :");
		        
		        String email = sc.next();
		        Iterator<String> it =list.iterator();
		        for(int i=0;i<array.length;i++) {
		            if(email.equals(array[i])) {
		                
		            System.out.println("User entered email is valid at the index "+i );
		            break;
		        }
		        
		        
		        sc.close();
		        }
	}
}
