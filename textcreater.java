import java.io.PrintWriter;
import java.io.IOException;

public class textcreater {

	public static void main(String[] args) {
	
		String pathname = "new-text-file.txt";
	
		try{
			PrintWriter writer = new PrintWriter(pathname, "UTF-8");
			writer.println("This is the first line");
			writer.println("This is the second line");
			writer.close();
		} catch(IOException e) {
			System.out.println("Error in creating file " + pathname+":" + e.getMessage());
		}
	}
}