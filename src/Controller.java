package g30322.Daczo.Cadar.Amalia.l9;

import java.util.Random;

public class Controller {
	int n;
	public void trafficController(CrossRoad c,int i) {
				TrafficLight[] light=new TrafficLight[5];
				for(int j=0;j<4;j++) {
					light[j]=new TrafficLight(j);
				}
					c.lin[i].setColor(light[i]);
					light[i].checkColor(c.lin[i]);
					int rc=c.lin[i].getSize();
					Random r=new Random();
					n = r.nextInt(rc);
					if(n<5) {
						n=5;
					}
					c.lin[i].removeCar(n);
					c.lin[i].setColor(light[i]);
					light[i].checkColor(c.lin[i]);
	}
	public int getN() {
		return n;
	}
}

