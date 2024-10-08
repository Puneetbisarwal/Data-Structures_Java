package lecture9;

public class StudentUse {
	int abc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Student.numStudents = 20;
//		System.out.println(Student.getNumStudents());
//	
////		System.out.println(Student.PI);
////		int a = 100;
////		String abc = new String("abc");
////		 Student s1 = new Student("abcd");
////		 Student s2 = new Student("ghi",10);
//		 Student s3 = s1+s2;
//		s1.rollNo = 100;
//		s1.rollNo = 200;
//		System.out.println(s1.rollNo);
	//	s1 = new Student();
	//	Student.numStudents = 10;	
	//	System.out.println(Student.numStudents);
		//Student.numStudents = 12;
	//	Student s1 = new Student();
	//	s1.setName("abc");
//		
	//	s1.name = "@@@";
		
	//	System.out.println("Name : "+s1.getName()+" Marks :"+s1.marks+" Sem :"+s1.sem);
	
	
		//name = "xyz";
//		Student s2 = new Student();
//		s2.name = "ghi";
//		s2.marks = 90;
//		s2.sem = 5;
//		System.out.println("Name : "+s2.name+" Marks :"+s2.marks+" Sem :"+s2.sem);
//		System.out.println(s2.numStudents);
		
		
		
		
		
		
	
// Student.numStudents=10;
// Student s1 =new Student();

// s1.setName("Akash");
// s1.marks=100;
// s1.sem=4;
// s1.numStudents=10;
// 	System.out.println("Name :"+s1.getName()+" Marks :"+s1.marks+" Sem :"+s1.sem);
 	
 //	 Student s2 =new Student();
 //	 s2.setName("Chandan");
// 	 s2.marks=90;
// 	 s2.sem=5;
// 	 	System.out.println("Name :"+s2.getName()+" Marks :"+s2.marks+" Sem :"+s2.sem);
//        System.out.print(s2.numStudents);	
        
//Student s1 =new Student ("Akash");
//s1.sem=5;
//s1.marks=100;
//s1.nm="Chandan";
//System.out.print("Name = "+s1.nm+"Sem = "+s1.sem+"Marks = "+s1.marks);
// Student.numStudents=10;
Student std[] = new Student[10];
 for(int i=0;i<std.length;i++)
 {
	 std[i]=new Student(i+" ");
	 std[i].marks=100-i;
 }
 
// Sort sc=new Sort();
// sc.bubblesort(std);
 Sort.bubblesort(std);
 for(int i=0;i<std.length;i++) {
	 System.out.println(std[i].marks);
 }


	}

}

