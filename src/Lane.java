package g30322.Daczo.Cadar.Amalia.l9;
import java.util.LinkedList;


public class Lane {
	private int id;
	private LinkedList<Car> cars =new LinkedList<Car>();
	Lane(int id){
		this.id=id;
	}
	public void addCar(Car c) {
	    cars.add(c);
	}
	public void removeCar(int n) {
		int j=0;
		for(Car c : cars) {
			if (j<n) {
			    c.checkDirection();
			    try {
                    Thread.sleep(1000);
              } catch (InterruptedException e) {
                    e.printStackTrace();
              }
			    j++;
			}else {
				break;
			}
		}
		for(int i=0;i<n;i++)
			cars.removeLast();
	}
	public void setColor(TrafficLight tf) {
		 tf.setLight();
	}
	public int getId() {
		return id;
	}
	 public int getSize() {
	    return cars.size();
	}
	 public void checkNbCars(int n) throws MaximumCapacityException{
		 if(n>25)
	            throw new MaximumCapacityException("Too many cars on the input lane!");
	 }
	 public void displayLane() {
		System.out.println("Lane:"+id+" has:"+getSize()+" cars");
	 }
}
