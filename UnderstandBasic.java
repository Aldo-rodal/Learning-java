package demooop;

// this program was made to understand and identify some basic components 
// that can be in a program of Java.

public class Bicycle {
// 	Variables
	static int goodWheel = 2;			
	static String stateOfBrakes = "ready";
	
// 	A Method
	static public void riding()
	{
		System.out.println("This bicycle is ready for riding");
	}
	
	static public void fallingOff() {
		System.out.println("You're going to fall off the bike");
	}

	public static void main(String[] args) {
//	A conditional that validate the values of the components of a bicycle.
		
		if ( "ready".equalsIgnoreCase(stateOfBrakes) && goodWheel == 2) {
			riding();
		} else {
			fallingOff():
		}
	}

}
