package csc130.Ruiz.lab1;
import java.util.Arrays;
/**
 * Title: Matrix class.
 * 
 * @author Anibal Ruiz
 * 
 * Description: The purpose of this lab is to learn how to create and 
 * use two-dimensional arrays in Java.  
 */

public class Matrix 
{
	private int[][] data;
	
	/**
	 * Default constructor defines a 2x2 matrix with zero values
	 * @param r
	 * @param c
	 */
	public Matrix(int r, int c)
	{
		if(r >= 0 && c >= 0)
			data = new int[r][c];
		else
			data = new int[2][2];
	}
	
	/**
	 * Parameterized constructor verifies the 2-D array passed, if valid it initializes the array.
Otherwise, it sets this matrix’s array to null.
	 * @param a
	 */
	public Matrix(int[][] a)
	{
		if(isMatrix(a))
			data = Arrays.copyOf(a, a.length);
		else
			data = new int[2][2];
	}
	
	/**
	 * isMatrix verifies the matrix has data
	 * @return true if the matrix's array i snot full. otherwise, it returns false.
	 */
	public boolean isMatrix()
	{
		if(data == null)
			return true;
		return false;
	}
	
	/**
	 * isMatrix- verifies that the parameter is not null and each row in the array has the same number of columns
	 * @param x arr - 2D array representing the matrix
	 * @return Returns true if the array is not null and each row in the array has the
same number of columns. Otherwise, it returns false.
	 */
	public boolean isMatrix(int[][] x)
	{
		boolean valid = true;
		
		for(int i = 1; i < x.length && valid; i++)
		{
			if(x[0].length != x[i].length)
				valid = false;
		}
		return valid;
	}
	
	/**
	 * returns the matrix as a string
	 */
	public String toString()
	{
		String str = "";
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				str += data[i][j] + " ";
			}
		    str += "\n";
		}
		
		return str;
		 
	}
	
	/**
	 * add- If the dimensions of this matrix and the parameter are the same, addition takes place and returns the resulting matrix, otherwise it returns null

	 * @param om - the matrix to add to this one

	 * @return Adds this matrix to another matrix and returns a new matrix, if both
matrices have the same dimensions. Otherwise, it returns null.
	 */
	public Matrix add(Matrix om)
	{
		Matrix newMatrix = null;
		if(sameDimensions(om))
		{
			//create a new Matrix with the same dimensions as this matrix
		    newMatrix = new Matrix(new int[data.length][data[0].length]);
		    for(int i = 0; i < data.length; i++)
		    {
		    	for(int j = 0; j < data[i].length; j++)
			    {
		    		newMatrix.data[i][j] = this.data[i][j] + om.data[i][j];
			    }
		    }
		}
		return newMatrix;
		
	}
	
	/**
	 * Compares the dimensions of this matrix to that of another matrix
	 * @param om
	 * @return true, if they are the same. Otherwise, it returns false.
	 */
	public boolean sameDimensions(Matrix om)
	{
		return this.data.length == om.data.length && this.data[0].length == om.data[0].length;
	}
	
	/**
	 *  If the dimensions of this matrix and the parameter are the same, addition takes place and returns the resulting matrix, otherwise it
	 * @param om - the matrix to subtract from this one
	 * @return a new matrix, if both matrices have the same dimensions. Otherwise, it returns null.
	 */
	public Matrix subt(Matrix om)
	{
		Matrix newMatrix = null;
		
	    if(sameDimensions(om))
	    {
	    	newMatrix = new Matrix(new int[data.length][data[0].length]);
			for(int i = 0; i < data.length; i++)
			{
				for(int j = 0; j < data[i].length; j++)
				{
					newMatrix.data[i][j] = this.data[i][j] - om.data[i][j];
				}
			}
	    }
		
		return newMatrix;
	}
	
	/**
	 * Multiplies this matrix by another matrix, if this matrix’s rows matches
the columns of the other matrix
	 * @param om - the matrix to multiply this one by
	 * @return a new matrix. Otherwise, it returns null.
	 */
	public Matrix mult(Matrix om)
	{
		//initialize to null, because if the "if statement" is not true. then null should be displayed.
		Matrix newMatrix = null;
		
		//declare and initialize rows and columns for a more clear work
		//c = columns, r = rows.
		int r1 = data.length;
		int c1 = data[0].length;
		int r2 = om.data.length;
		int c2 = om.data[0].length;
		
		if(c1 == r2)
		{
			newMatrix = new Matrix(new int[r1][c2]);
			for(int i = 0; i < r1; i++)
			{
				for(int j = 0; j < c2; j++)
				{
					for(int k = 0; k < c1; k++)
					{
						newMatrix.data[i][j] += this.data[i][k] * om.data[k][j];
					}
				}
			}
		}
		return newMatrix;
		//this method works when it is tested with a 2x2 matrices multiplication
	}
	
	/**
	 * Multiplies each value in the matrix by the parameter passed 
	 * @param s scalar value
	 * @return  a new matrix.
	 */
	public Matrix scalar(int s)
	{
		Matrix newMatrix = new Matrix(new int[data.length][data[0].length]);
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				newMatrix.data[i][j] = this.data[i][j] * s;
			}
		}
		return newMatrix;
	}
	
	/**
	 * Compares the values of this matrix to that of the paramter
	 * @param om the matrix to compare to this one
	 * @return Returns true if the values of the matrices are the same. Otherwise, it returns false.
       boolean isMatrix()
        Returns true if the 
	 */
	public boolean equals(Matrix om)
	{
		if(sameDimensions(om))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Transposes the rows and columns of the matrix 
	 * @param om - the matrix to compare to this one
	 * @return a new Matrix
	 */
	public Matrix Transpose()
	{
		Matrix newMatrix = new Matrix(new int[data.length][data[0].length]);
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				newMatrix.data[i][j] = this.data[i][j];
			}
		}
		return newMatrix;
		
	}

}
