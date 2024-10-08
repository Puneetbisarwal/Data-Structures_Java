package lecture9;
	
	public class Car extends Vehicle implements VehicleInterface, Interface1 {

		final int numDoors = 4;
		
		Car(String number){
			super(number);
			System.out.println("Inside Car");
		//	this.numDoors = numDoors;
		
			
		}
		public  String getType()
		{
			return "car";
		}
		
		public void printDescription(){
			super.printDescription();
			System.out.println("Car :"+"Num Doors :"+numDoors+" Color "+color+" Speed"+speed);
		}
		@Override
		public void method1(int a) {
			// TODO Auto-generated method stub
			
		}
		
	}

