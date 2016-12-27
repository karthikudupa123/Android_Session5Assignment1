public class Assgn5_1
{
	public static void main(String []args)
	{
		System.out.print("Dimensions of circle: ");
		Circle cir = new Circle(6);	
		System.out.print("Dimensions of rectangle: ");		
		Rectangle rect 	= new Rectangle(10,8);		// Object creation
		System.out.print("Dimensions of triangle: ");
		Triangle tri 	= new Triangle(4,5,6);
		System.out.println();
		
			
		cir.findArea();
		cir.findPerimeter();
		rect.findArea();
		rect.findPerimeter();						// Function call
		tri.findArea();
		tri.findPerimeter();
	}
}

abstract class Figure								// Abstract class
{
	double dim1,dim2,dim3;

	// Constructor of abstract class Figure
	Figure(double a,double b,double c)				
	{
		dim1=a;
		dim2=b;
		dim3=c;
		System.out.println(dim1+" "+dim2+" "+dim3);
    }

	abstract void findArea();						// Abstract methods
	abstract void findPerimeter();
}

class Circle extends Figure
{
	Circle(double radius)
	{
		super(radius,0,0);							// Initialising the constructor with values
	}

	 void findArea()
	
	{
		double area= 3.14*dim1*dim1;				// Calculating area of circle
		System.out.println("Area of circle: "+area);
		
	}

	 void findPerimeter()
	{
		double perimeter= 2*3.14*dim1;				// Calculating perimeter of circle
		System.out.println("Perimeter of circle: "+perimeter+"\n");
		
	}
}

class Rectangle extends Figure
{
	Rectangle(double length,double breadth)
	{
		super(length,breadth,0);					// Initialising the constructor with values
	}
     void findArea()
	{
		double area= dim1*dim2;						//Calculating area of rectangle
		System.out.println("Area of rectangle: "+area);
		
	}

	 void findPerimeter()
	{
		double perimeter= 2*(dim1+dim2);			// Calculating perimeter of rectangle
		System.out.println("Perimeter of rectangle: "+perimeter+"\n");
	}
}

class Triangle extends Figure
{
	Triangle(double side1,double side2,double side3)
	{
		super(side1,side2,side3);					// Initialising the constructor with values
	}
     void findArea()
	{
		double s = (dim1 + dim2 + dim3) / 2;		//Calculating area of triangle
		double area= Math.sqrt(s * (s - dim1) * (s - dim2) * (s - dim3));
		System.out.println("Area of triangle: "+area);
	}

	 void findPerimeter()
	{
		double perimeter= dim1+dim2+dim3;			// Calculating perimeter of triangle
		System.out.println("Perimeter of triangle: "+perimeter);
	}
}
