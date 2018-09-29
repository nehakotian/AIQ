import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException{
		FileInputStream istream=new FileInputStream("D:/Demo/vsc.exe");
		FileOutputStream ostream=new FileOutputStream("D:/Demo/vsx.exe");
		long start=System.currentTimeMillis();
		int b=0;
		while(true) {
			b=istream.read();
			if(b==-1)break;
			ostream.write(b);
		}

		long end=System.currentTimeMillis();
		System.out.println("Copy time: "+(end-start)+" m.s.");
		
		istream.close();
		ostream.close();
	}

}
