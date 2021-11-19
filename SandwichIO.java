import java.io.*;
public class SandwichIO {
	public  static void writeOrderToFile(Order ord) {
		File orderFile = new File ("orderline.txt");
		try {
		if (!orderFile.exists())
				orderFile.createNewFile();
			} 
		catch (IOException ioe) {
				ioe.printStackTrace();
			}
		PrintWriter out = null;
		try {
			out = 			new PrintWriter(
							new BufferedWriter(
							new FileWriter("orderline.txt", true)));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		out.println(ord.toString());
		out.close();

	}

}
