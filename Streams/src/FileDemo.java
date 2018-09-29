import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("D:/song.txt");
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(new Date(file.lastModified()));
			
			if(file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.length()+" chars");
			}else {
				System.out.println("Content of directory");
				for (String f : file.list()) 
					System.out.println(f);
			}	
			}else
				System.out.println(file+" does not exist");
		}

	}

