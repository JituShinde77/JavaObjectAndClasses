class Triangle{
	float side1, side2, side3;

	void setValues(float side1, float side2, float side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	float findPerimeter(){
		float area= side1 + side2 + side3;
		return area;
	}

	double findArea(){
		// Semiperimeter
		float s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public static void main(String[] args){
		Triangle t1 = new Triangle();
		t1.setValues(3, 4, 5);
		System.out.println("Perimeter of Triangle = "+t1.findPerimeter());
		System.out.println("Area of Triagle: " +t1.findArea());
	}
}
