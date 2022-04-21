package demooop;

// 	This class implements Engine interface through Override that is another way of perform polymorphism in Java

public class MyVehicle implements Engine 
{

	int speed;
	int gear;
	
// 	This method assign the value of the argument to the variable gear and print a message
	@Override
	public void changeGear(int a) 
	{
		// TODO Auto-generated method stub
		this.gear = a;
		System.out.println("Gear = " +gear);
	}

// 	This method assign the value of the argument to the variable speed and print a message
	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		this.speed = a;
		System.out.println("Speed = " +speed);
	}

	public static void main(String[] args) {
		// The main method makes an object of MyVehicle and calls its methods(this step was made just for test) but 
		// Can we make an object of the interface "Engine" and calls that in this method?
		
		MyVehicle obj1 = new MyVehicle();
		
		obj1.changeGear(6);
		obj1.speedUp(7);

	}

}
