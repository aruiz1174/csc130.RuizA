package lab9;
/**
 * Ttile: Application class
 * @author anibal ruiz
 * Description: test the binary search tree
 */

public class TestApplication 
{
	/**
	 * Static method -
	 * @param args
	 */
	public static void main(String[] args)
	{
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
	
		int[] nums = {6, 11, 9, 7, 4, 5, 10, 2, 19, 28, 1};
		for(int i : nums)
		{
			tree.insert(i);
		}
		
		System.out.println("Height: " + tree.height());
		tree.preOrder();
		tree.inOrder();
		tree.postOrder();
		System.out.println("\n");
		System.out.println();
		for (int i : nums)
			System.out.print(i + " ");
		System.out.println();
		tree.buildHeap(nums, nums.length);
		for (int i : nums)
			System.out.print(i + " ");
	}
	
	

}
