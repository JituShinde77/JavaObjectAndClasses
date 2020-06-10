class Triangle{
	float side1, side2, side3;

	void setValues(float s1, float s2, float s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
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
