package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Lab2App.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Display and test objects that are shapes to see if methods work.
 * </p>
 * <p>
 * Created shapes and answered questions that were part of the lab2pdf.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Start off by creating shapes with their parameters. Then print them out to see if
 * our methods worked inside their classes. Created an array to check if it will be 
 * the same output and it is. Finally tested compareTo() method which return 1,0, or -1.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Lab2App {
	public static void main(String[] args) {
		//Can not create an instance of a shape class because it doesn't have a complete method. Its abstract.
		//Shape s1 = new Shape("Square");
		
		Cube cube = new Cube("Cube", 5.00);
		Cone cone = new Cone("Cone", 3.00, 2.00);
		Cylinder cylinder = new Cylinder("Cylinder", 6.00, 7.00);
		Sphere sphere = new Sphere("Sphere", 4.00);
		Circle circle = new Circle("Circle", 10.00);
		Rectangle rectangle = new Rectangle("Rectangle", 8.00, 9.00);
		Triangle triangle = new Triangle("Triangle", 11.00, 12.00, 13.00);
		Square square = new Square("Square", 14.00);
		
		System.out.println(cube);
		System.out.println(cone);
		System.out.println(cylinder);
		System.out.println(sphere);
		System.out.println(circle);
		System.out.println(rectangle);
		System.out.println(triangle);
		System.out.println(square);
		
		System.out.println(triangle.isValid(11.00, 12.00, 13.00));
		System.out.println(triangle.isValid(2.00, 2.00, 10.00));
		
		//this array works because all these objects are considered children classes of the shape class. So they are all shapes.
		Shape[] shape = {cube, cone, cylinder, sphere, circle, rectangle, triangle, square};
		
		//outputs are the same as step 3
		for(Shape aShape: shape) {
			System.out.println(aShape);
		}
		
		//If returns 1, area/volume is greater. If return 0, area/volume are equal. If return -1, area/volume is less.
		System.out.println(circle.compareTo(rectangle));
		System.out.println(rectangle.compareTo(circle));
		System.out.println(circle.compareTo(circle));
		System.out.println(triangle.compareTo(rectangle));
		System.out.println(cylinder.compareTo(sphere));
		System.out.println(sphere.compareTo(sphere));
		
		int object3D = cone.compareTo(sphere);
			if(object3D > 0) {
				System.out.println("The cone's volume is larger than the sphere's.");
			}
			if(object3D < 0) {
				System.out.println("The cone's volume is smaller than the sphere's.");
			}
			if (object3D == 0) {
				System.out.println("The cone's volume is equal to the sphere's.");
			}


			int object3D2 = sphere.compareTo(sphere);
			if(object3D2 > 0) {
				System.out.println("The cone's volume is larger than the sphere's.");
			}
			if(object3D2 < 0) {
				System.out.println("The cone's volume is smaller than the sphere's.");
			}
			if (object3D2 == 0) {
				System.out.println("The cone's volume is equal to the sphere's.");
			}
			
			
			int object3D3 = sphere.compareTo(cone);
			if(object3D3 > 0) {
				System.out.println("The cone's volume is larger than the sphere's.");
			}
			if(object3D3 < 0) {
				System.out.println("The cone's volume is smaller than the sphere's.");
			}
			if (object3D3 == 0){
				System.out.println("The cone's volume is equal to the sphere's.");
			}
		
	}
}
