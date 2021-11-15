package lab7;


public class Lab7TestApp {
	public static void main(String[] args) {
		LinkedList<Integer> ul1 = new LinkedList<Integer>();
		
		OrderedLinkedList<Integer> ol1 = new OrderedLinkedList<Integer>();
		OrderedLinkedList<Integer> ol2 = new OrderedLinkedList<Integer>();
		int[] num1 = { 6, 1, 13, 0, 14 };
		int[] num2 = { 3, 15, 5, 4 };

		testingUList(ul1, num1, num2);
		testingOList(ol1, ol2, num1, num2);
	}
	public static void testingUList(LinkedList<Integer> ul1, int[] num1, int[] num2) {
		for (int i : num1)
			ul1.add(i);
		for (int i : num2)
			ul1.add(i);
		System.out.println(ul1);
		System.out.println(ul1.remove(new Integer(1)));
		System.out.println(ul1);
		System.out.print("\nSublist 0-8:");
		System.out.println(ul1.subList(0, 8));
		System.out.println(ul1.indexOf(new Integer(13)));
		ul1.set(0, 2);
		System.out.println(ul1);
		System.out.println(ul1.get(0));		
	}
	public static void testingOList(OrderedLinkedList<Integer> ol1, OrderedLinkedList<Integer> ol2, int[] num1, int[] num2) {
		for (int i : num1)
			ol1.add(i);
		for (int i : num2)
			ol2.add(i);
		System.out.println(ol1);
		System.out.println(ol2);
		System.out.println(ol2); 
		System.out.print("\nSublist 0-8:");
		System.out.println(ol2.subList(1, 4));
		System.out.println("IndexOf (5):");
		System.out.println(ol2.indexOf(new Integer(5)));
		System.out.println("Remove (5):");
		System.out.println(ol2.remove(new Integer(5)));
		System.out.println(ol2);
		OrderedLinkedList<Integer> ol3 = ol2.merge(ol1); 
		System.out.println(ol3);
		//System.out.println(ol2); 
		//System.out.println(ol3.remove(new Integer(1)));
		//System.out.println(ol3); 
		//System.out.print("\nSublist 0-8:");
		//System.out.println(ol3.subList(0, 8)); 
		//System.out.println(ol3.search(new
		//Integer(13))); 
		//ol3.set(0, 2); System.out.println(ol3);
		// System.out.println(ol3.get(0));
		 	
	}
}