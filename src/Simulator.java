package g30322.Daczo.Cadar.Amalia.l9;

import java.io.IOException;
import java.util.Random;

public class Simulator {
	public static void main(String[] args)throws IOException {
		Controller c=new Controller();
		CrossRoad c1=new CrossRoad("Main Street");
		c1.display();
		int m=0;
		int i=0;
		try {
		while(m<100) {
		if(i>=4) {
			i=0;
		}else {
		Random r=new Random();
		int  n = r.nextInt(30);
		if(n<5)
			n=5;
		try {
		c1.lin[i].checkNbCars(n);
		} catch (MaximumCapacityException e) {
	            System.out.println("Exception:"+e.getMessage());
	            
		}
		for(int j=0;j<n;j++) 
    		c1.lin[i].addCar(c1.getCars());
		c1.lin[i].displayLane();
		c.trafficController(c1,i);
		i++;
		}
		m=m+c.getN();
		}}finally{ 
    	System.out.println("The 100 sec cycle is over!");
  	  }
	}	
}
