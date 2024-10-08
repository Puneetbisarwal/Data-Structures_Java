package lecture9;

public abstract class Vehicle {


	private String number;
	String color;
	double speed;

	Vehicle(String number){
		System.out.println("Inside Vehicle");
		this.number = number;
	}

	public void printDescription(){
		System.out.println("Vehicle :"+"Number :"+number+" Color "+color+" Speed"+speed);
	}
 public abstract String getType();
}

