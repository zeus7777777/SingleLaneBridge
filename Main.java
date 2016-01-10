package slb;

import java.util.Random;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		int t, z = 0;
		Bridge b = new Bridge();
		Random r = new Random();
		
		while(true)
		{
			t = r.nextInt(10);
			Thread.sleep(t*100+1000);
			
			if(r.nextInt(10)<5)
			{
				LeftCar lc = new LeftCar(b, ++z);
				lc.start();
			}
			else
			{
				RightCar rc = new RightCar(b, ++z);
				rc.start();
			}
		}
	}
}
