
public class Parking_system {
	int vehicleNum;
	int hoursParked;
	String vehicleType;
	double parkingFee;
	
	Parking_system (int num,int hours,String type)
	{
		vehicleNum = num;
		hoursParked = hours;
		vehicleType = type;
		
		switch(vehicleType)
		{
		case "Bike":
			parkingFee = 10*hoursParked;
			break;
		case "Car":
			parkingFee = 30*hoursParked;
			break;
		case "Bus":
			parkingFee = 50*hoursParked;
			break;
		}
		
	}
	void display()
	{
		System.out.println("Final fee: Rs."+parkingFee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking_system vehicle = new Parking_system(245,5,"Bike");
		vehicle.display();
	}

}
