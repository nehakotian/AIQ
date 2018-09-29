import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new FileReader("D:/song.txt"));
		String line=null;
		
		while(true) {
			line=reader.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		
		reader.close();

	}

}
