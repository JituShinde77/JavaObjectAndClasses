import java.util.*;
class Area{
	int length;
	int breadth;
	public Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	int returnArea()
	{
		return (length * breadth);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenght of Rectangle: ");
		int lenght = sc.nextInt();
		System.out.println("Enter the bridth of Rectangle: ");
		int bridth = sc.nextInt();
		Area a= new Area(lenght, bridth);
		System.out.println("Area of Rectangle: "+a.returnArea());
	}

}
