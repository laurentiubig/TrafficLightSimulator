package g30322.Daczo.Cadar.Amalia.l9;

public class CrossRoad {
	private String name;
	public Lane[] lin=new Lane[5];
	CrossRoad(String name){
		this.name=name;
		for(int i=0;i<4;i++) {
			lin[i]=new Lane(i+1);
		}
	}
	public void display() {
		System.out.println("New Cross Road Called "+name+" Has Been Created!");
	}
	public Car getCars() {
		Car[] car=new Car[50];
		return car[0]=new Car((int)( Math.random() * 2));
	}
}
