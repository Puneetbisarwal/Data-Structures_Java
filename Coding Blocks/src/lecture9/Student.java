package lecture9;

public class Student implements CompareInterface<Student>  {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
        String nm ;
		private	String name ; 
		public 	int rollNo;
		int sem;
		double marks;
		String address;
		static int numStudents;
		final static double PI = 3.14;

		public Student(String name){
			nm = name;
			numStudents++;
		}

		Student(String sName, int sRollNo){
			name = sName;
			rollNo = sRollNo;
			numStudents++;
		}

		
		public  static int getNumStudents(){
		//	System.out.println(name);
			int a = 10;
			return numStudents;
		}

		public  String getName(){
			return name;
		}

		
		
		@Override
		public int compareTo(Student second) {
			// TODO Auto-generated method stub
			
			if(this.marks> second.marks) {
				return 1;
			}
			
			else 
			return 0;
		}

		//	public void setName(String sName){
		//		name = sName;
		//	}

//		final private String name="Rakesh";
//		public	int rollNo;
//			int sem;
//			double marks;
//			String Address;
//			static int numStudents;
//			
//			
//			public String getName() {
//				
//				return name;
//			}
	
	
	
	
	

	
	//	public void setName(String sName) {
	//		name=sName;
	//	}
		
		
//	}
	

}
