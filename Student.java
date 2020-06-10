class Student{
	String name;
	int rollNo;
	void setStudent(String n, int r){
		name = n;
		rollNo = r;
	}
	void getStudent()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNo);
	}

	public static void main(String[] args){
		Student s1=new Student();
		s1.setStudent("John", 2);
		s1.getStudent();

	}
}
