
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("I have a problem \nMy problem is love \nMy solution is you \nlol making jokes!");
			writer.append("\n(A poem by Nizam)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}