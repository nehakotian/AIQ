import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		String path="D:/song.txt";
		//FileWriter fw =new FileWriter(path,true); to append
		FileWriter fw =new FileWriter(path); //Opening file in char stream //to overwrite
		BufferedWriter writer=new BufferedWriter(fw); //Wrapping buffer around stream
		//Writing content to the file
		writer.write("Hello World!");
		writer.newLine();
		writer.write("I'm waiting for the chance to see your face.");
		writer.newLine();
		writer.write("I'm craving to see the different kind of place.");
		writer.close();
		fw.close();
	}
}
