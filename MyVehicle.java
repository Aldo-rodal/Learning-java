package demooop;

public class MyVehicle implements Engine 
{

	int speed;
	int gear;
	
	@Override
	public void changeGear(int a) 
	{
		// TODO Auto-generated method stub
		this.gear = a;
		System.out.println("Gear = " +gear);
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		this.speed = a;
		System.out.println("Speed = " +speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVehicle obj1 = new MyVehicle();
		
		obj1.changeGear(6);
		obj1.speedUp(7);

	}

}
