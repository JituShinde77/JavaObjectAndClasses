import java.util.*;
class Area{
	int length;
	int bridth;
	public Area(int l, int b){
		length = l;
		bridth = b;
	}
	int returnArea()
	{
		return (length * bridth);
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
