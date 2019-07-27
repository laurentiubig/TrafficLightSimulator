package g30322.Daczo.Cadar.Amalia.l9;

public class Car {
	private int direction;
	public Car(int direction) {
		this.direction=direction;
	}
	public int getDirection(){
		return direction;
	}
	public void checkDirection() {
		if(direction==0) {
			System.out.println("Car goes forward");
		}else
		if(direction==1)
		{
			System.out.println("Car goes right");
		}else
		if(direction==2)
		{
			System.out.println("Car goes left");
		}	
		
	}
}
