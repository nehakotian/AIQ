import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ChannelFileCopy {

	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();
		FileChannel sourceChannel = null;
		FileChannel destChannel = null;

		sourceChannel = new FileInputStream("D:/Demo/vsc.exe").getChannel();
		destChannel = new FileOutputStream("D:/Demo/vsx.exe").getChannel();
		destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

		sourceChannel.close();
		destChannel.close();

	}

}
