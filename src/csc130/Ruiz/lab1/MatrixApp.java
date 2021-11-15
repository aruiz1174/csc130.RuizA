package csc130.Ruiz.lab1;
/**
 * <b>Title:</b> The Matrix Application.<br>
 * 
 * @author Anibal Ruiz
 * 
 * Description: testing every instance method from the matrix class. The purpose of this lab
 *  is to learn how to create and use two-dimensional arrays in Java. 
 * <p> A matrix is a collection of numbers arranged in a rectangular array with a fixed number of rows
and columns – an m x n array.
Arithmetic operations such as addition and multiplication are defined for matrices. For example,
two matrices may be added or multiplied together to yield a new matrix.
 */

public class MatrixApp 
{
	public static void main(String[] args)
	{
		//declare and initialize variables
		Matrix a = new Matrix(new int[][]{{1,2},{4,3}});
		Matrix b = new Matrix(new int[][]{{3,2},{4,5}});
		Matrix c = new Matrix(new int [][]{{2, 2}, {-1, 1}});
		
		
		System.out.println("testing part1: \n");
		
		//test every scenario
		System.out.print("1. (A^T)^T = A  = ");
		System.out.println(a.Transpose().Transpose().equals(a));
		
		System.out.print("2. (A+B)^T = A^T + B^T  = ");
		System.out.println(a.add(b).Transpose().equals(a.Transpose().add(b).Transpose()));
		
		System.out.print("3. (rA)^T = rA^T  = ");
		System.out.println(a.scalar(2).Transpose().equals(a.scalar(2)));
		
		System.out.print("4. (AB)^T = B^TA^T  = ");
		System.out.println(a.mult(b).Transpose().equals(b.Transpose().mult(a).Transpose()));
		
		System.out.print("5. AB != BA  = ");
		System.out.println(a.mult(b).Transpose().equals(b.mult(a)));
		
		System.out.print("6. A(BC) = (AB)C  = ");
		System.out.println(a.mult(b.mult(c)).Transpose().equals(a.mult(b).mult(c)));
		
		System.out.print("7. A(B+C) = AB + AC  = ");
		System.out.println(a.mult(b.add(c)).Transpose().equals(a.mult(b).add(a.mult(c))));
		
		System.out.print("8. (A+B)C = AC + BC  = ");
		System.out.println(a.add(b).mult(c).Transpose().equals(a.mult(c).add(b.mult(c))));
		
		System.out.print("9. (2A)B = 2(AB) = A(2B)  = ");
		System.out.println((a.scalar(2)).mult(b).equals(a.mult((b.scalar(2)))));
		
		//declare and initialize new variables
		Matrix A = new Matrix(new int[][]{{1, -2, 3},{1, -1, 0}});
		Matrix B = new Matrix(new int[][]{{3, 4},{5, -1}, {1, -1}});
		Matrix C = new Matrix(new int [][]{{4, -1, 2}, {-1, 5, 1}});
		Matrix D = new Matrix(new int[][]{{-1, 0, 1}, {0, 2, 1}});
		Matrix E = new Matrix(new int[][]{{3, 4}, {-2, 3}, {0, 1}});
		Matrix F = new Matrix(new int [][]{{2}, {-3}});
		Matrix G = new Matrix(new int[][]{{2, -1}});
		
		System.out.println("\nTesting part2: ");
		
		System.out.println("\n(a) 3C - 4D =");
		System.out.println(C.scalar(3).subt(D.scalar(4)));
		
		System.out.println("(b) A - (D + 2C) =");
		System.out.println(A.subt(D.add(C.scalar(2))));
		
		System.out.println("(c) A - E =");
		System.out.println(A.subt(E));
		
		System.out.println("\n(d) AE =");
		System.out.println(A.mult(E));
		
		System.out.println("\n(e) 3BC - 4BD = ");
		System.out.println(B.mult(C).scalar(3).subt(B.mult(D).scalar(4)));
		
		System.out.println("\n(f) CB + D =");
		System.out.println(C.mult(B).add(D));
		
		System.out.println("\n(g) GC =");
		System.out.println(G.mult(C));
		
		System.out.println("\n(h) FG = ");
		System.out.println(F.mult(G));
		
		System.out.println("\n(i) C^2 = ");
		System.out.println(C.mult(C));
		
		System.out.println("\n(j) C + D = ");
		System.out.println(C.add(D));
		
	} 
	


}
