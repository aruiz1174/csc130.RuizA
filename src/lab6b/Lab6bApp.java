package lab6b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author Anibal Ruiz
 *
 */

public class Lab6bApp 
{
	/**
	 * Main method - test the OrderedArrayList
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)
	{
		
		OrderedArrayList<Packet> list = new OrderedArrayList<Packet>();
		String line = "";

		File file = new File("packet.dat");
		//Scanner scan = null;
		try {
			
			Scanner scan = new Scanner(file);
		//int i = 1;
		
		while(scan.hasNextLine()) 
		{
			line = scan.nextLine();
			System.out.println(line);
			String splitArray[] = line.split("\t", 2);
			int position = Integer.parseInt(splitArray[0]);
			String message = splitArray[1];
			Packet packet = new Packet(position, message);
			list.add(packet);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(displays(list));
	}

	public static String displays(OrderedArrayList<Packet> list)
	{
		String str = "";
		
		for(int i = 0; i < list.getSize(); i++)
		{
			str = str + list.remove(i) + "\n";
		}
		return str;
		
	}
	
//	public 
}
