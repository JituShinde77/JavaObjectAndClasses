class Rectangle{
	int length;
	int breadth;
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	int area(){
		return length * breadth;
	}
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println("Area of Rectangle 1: "+r1.area());
		Rectangle r2 = new Rectangle(5, 8);
		System.out.println("Area of Rectangle 2: "+r2.area());
	}
}
