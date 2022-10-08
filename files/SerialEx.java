
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialEx {
public static void main(String[] args) throws IOException, ClassNotFoundException {
//serialization
Student s1=new Student(1,"karthik", "c language");
FileOutputStream fo=new FileOutputStream("input");
ObjectOutputStream out=new ObjectOutputStream(fo);
out.writeObject(s1);
System.out.println("the write operation is done into the file input");
out.close();
fo.close();
//deserialization
FileInputStream fi=new FileInputStream("input");
ObjectInputStream oi=new ObjectInputStream(fi);
//LHS Student type object RHS of the type super class object
Student s=(Student) oi.readObject();
System.out.println("Deserialized values");
System.out.println(s);
}
}
