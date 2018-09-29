import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastFileCopy {

	public static void main(String[] args) throws IOException{
		BufferedInputStream istream=new BufferedInputStream(new FileInputStream("D:/Demo/vsc.exe"));
		BufferedOutputStream ostream=new BufferedOutputStream(new FileOutputStream("D:/Demo/vsx.exe"));
		
		long start=System.currentTimeMillis();
		
		int b=0;
		while(true) {
			b=istream.read();
			if(b==-1) break;
			ostream.write(b);
		}

		long end=System.currentTimeMillis();
		System.out.println("Copy time: "+(end-start)+" m.s.");
		
		istream.close();
		ostream.close();
	}

}
