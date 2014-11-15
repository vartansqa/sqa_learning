package inheritance;

public class Shape extends Shape1 {
	 
	 private double height; 
	 private double width;

	 public Shape(String name, double height, double width ) {
	  super();
	  this.height = height;
	  this.width = width;
	  System.out.println("** This is from Exercise17Triangle overloaded constractor **");
	  
	 }

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	 }

