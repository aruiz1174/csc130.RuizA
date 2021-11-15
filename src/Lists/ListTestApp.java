package Lists;

public class ListTestApp {

	public static void main(String[] args) {
		int[] x = {1,4,3,6,7};
		LinkedList<Integer> ul1 = new LinkedList<Integer>(); 
		for(int i : x)
			ul1.add(i);
		System.out.println(ul1);
		ul1.remove(new Integer(4));
		System.out.println(ul1);
	}

}