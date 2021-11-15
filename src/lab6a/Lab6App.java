package lab6a;

/**
 * <p>Title: Driver Class - Lab6App</p>
 *
 * <p>Copyright: Copyright (c) 2014</p>
 *
 * @author F. Graham
 * @version 1.0
 */
import java.sql.*;

public class Lab6App {
	
	public static void main(String[] args) {
		
		// Create an UnorderedArrayList object, list1, 
		// using the default constructor.  
		ArrayList<Product> list1 = new ArrayList<Product>();
		
		// Display the contents of the list.
		System.out.println("The list1 contains " + list1.getSize() + " items.");
		
		// Create a second list, list2, using the parameterized constructor, 
		// and specify a maximum size of 5.		
		ArrayList<Product> list2 = new ArrayList<Product>(5);
		
		// Display the contents of the list. 
		System.out.println("The list2 contains " + list2.getSize() + " items.\n");
		
		// Create a variable called products (a reference to an array of Product),
		// call the getData method which returns a Product array, 
		// and store the reference returned in products. 
		Product[] products = getData();
		for(Product p : products) {
			System.out.println(p);
			list1.add(p);
		}
		
		System.out.println("\nThe list1 contains " + list1.getSize() + " items.");
		
		//Call the testSearch method and pass the product whose id is “344d97” (an item that is not in the list).
		//If it is found, dis
		System.out.println("\nSearching for product 264j45:" + "\nProduct 264j45 located at index position: " + testSearch("264j45", list1));
		System.out.println("\nSearching for product 344d97:\n" + testSearch("344d97", list1));
		System.out.println("\nSearching for product 456u78:" + "\nProduct 456u78 located at index position: " + testSearch("456u78", list1));
		System.out.println("\nSearching for product 653o09:" + "\nProduct 653o09 located at index position: " + testSearch("653o09", list1));

		
		//Call the testRemove method and pass the product whose id is “344d97” (an item that is not in the list).
		//Display the items in the list to ensure that the list has not changed. 
		System.out.println("\n" + testRemove("355d98", list1));
		System.out.println("The list1 contains " + list1.getSize() + " items.");
		
		
		System.out.println(list1);
		
		System.out.println("\nRemoving product 344d97\n" + testRemove("344d97", list1));
		
		System.out.println("\n" + testRemove("456u78", list1));
		System.out.println("The list1 contains " + list1.getSize() + " items.");
		
		
		System.out.println(list1);
		
		System.out.println("\n" + testRemove("653o09", list1));
		System.out.println("The list1 contains " + list1.getSize() + " items.");
		System.out.println(list1);
	}
	
	/**
	 * Create a method, testSearch(key, ulist), and write the statement(s) necessary to locate the position
       of a product in the list. Call the method and pass the product whose id is “264j45” (an item found in the
       middle of the list). If it is found, display the product id and its location; otherwise display a message
        stating that the item was not found. 
	 * @param key for the product
	 * @param list for the array
	 * @return the posisiton
	 */
	public static String testSearch(String key, ArrayList<Product> list)
	{
		String str = "Product " + key + " Was not found in the list";
		for(int i = 0; i < list.getSize(); i++)
		{
			if(list.get(i).getId().equals(key))
			{
				return String.valueOf(i);
			}
		}
		return str;
	}
	
	/**
	 * Create a method, testRemove(key, ulist), and write the statement(s) necessary to remove a product
	 * from the list. Call the method and pass the product whose id is “355d98” (an item in the middle of the
	 * list) and the list. Display the items in the list to ensure it has been deleted. 
	 * @param key for String product
	 * @param list for array
	 * @return a string stating if the product was removed or not
	 */
	public static String testRemove(String key, ArrayList<Product> list)
	{
		String str = "Product " + key + " not found in the list.";
		for(int i = 0; i < list.getSize(); i++)
		{
			if(list.get(i).getId().equals(key))
			{
				list.remove(i);
				str = "Removing product " + key + "\nProduct " + key + " removed from the list";
			}
		}
		
		return str;
	}
		
	
	
	/**
	 * getData method -- gets the products from an SQLite database
	 * @return the an array of products
	 */
	public static Product[] getData(){		
		Statement stmt = null;
		int records = 0;
		Product[] products = null; 
		try {
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:products.db");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");			

			stmt = c.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM products;");
			ResultSetMetaData rsmd = rs.getMetaData();			
			
			for(int i = 1; i <= rsmd.getColumnCount(); i++)	{
				System.out.print(String.format("%-12s", rsmd.getColumnLabel(i)) + "\t");
				System.out.print(rsmd.getColumnTypeName(i) + "\t");
				System.out.println(rsmd.getPrecision(i));
			}
			
			rs = stmt.executeQuery("select count (*) AS totalRecords from products");
			int totalRecords = rs.getInt("totalRecords");
			System.out.println("Records: " + totalRecords);
			
			rs = stmt.executeQuery("SELECT * FROM products;");
			if(rs != null){
				products = new Product[totalRecords];
				while (rs.next()) {
					String prodId = rs.getString("prodId");
					int quantity = rs.getInt("quantity");
					double price = rs.getFloat("price");

					System.out.println(String.format("%3s %-6s %3d %6.2f",
							records, prodId, quantity, price));	
					products[records++] = new Product(prodId, quantity, price);
				}
				System.out.println();
			}
			
			stmt.close();
			c.commit();
			c.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException se){
			System.err.println(se.getClass().getName() + ": " + se.getMessage());
		}
		return products;
	}
}