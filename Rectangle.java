class Rectangle{
	int length;
	int bridth;
	public Rectangle(int l, int b){
		length = l;
		bridth = b;
	}
	int area(){
		return length * bridth;
	}
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println("Area of Rectangle 1: "+r1.area());
		Rectangle r2 = new Rectangle(5, 8);
		System.out.println("Area of Rectangle 2: "+r2.area());
	}
}
