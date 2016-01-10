package slb;

public class LeftCar extends Thread
{
	int num;
	Bridge b;
	
	public LeftCar(Bridge _b, int n)
	{
		b = _b;
		num = n;
	}
	
	public void run()
	{
		try
		{
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"left car #"+num+" is now entering and wait");System.out.flush();
			b.left_in();
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"left car #"+num+" is entered");System.out.flush();
			Thread.sleep(3000);
			b.left_out();
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"left car #"+num+" is left");System.out.flush();
		} 
		catch (InterruptedException ee)
		{
			ee.printStackTrace();
		}
	}
}
