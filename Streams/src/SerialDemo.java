import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws Exception {
		Person p = new Person ("Polo", 21);
		System.out.println(p);

		//Serializing person object
		FileOutputStream  fos = new FileOutputStream("D:/Demo/pers.dat");
		ObjectOutputStream ostream = new ObjectOutputStream(fos);
		ostream.writeObject(p);  //object serialized
		ostream.close();
		fos.close();
		
		//Deserialzing person object
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream("D:/Demo/pers.dat"));
		
		Object po = istream.readObject();
		System.out.println(po);
		istream.close();
	}

}
