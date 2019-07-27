package g30322.Daczo.Cadar.Amalia.l9;

public class TrafficLight {
	private int color=0;
	private int id;
	TrafficLight(int id){
		this.id=id;
	}
	public int getTrafficLightId() {
		return id;
	}
	public void setLight() {
		  if(color==1) {
			  color=0;
		  }else {
			  color=1;
		  }
	}
	public void checkColor(Lane l) {
		if(color==1) {
			System.out.println("~~~~~GREEN FOR LANE: "+l.getId()+"~~~~~");
		}
		else{
			System.out.println("~~~~~RED FOR ALL~~~~~");
		}
	}
}
