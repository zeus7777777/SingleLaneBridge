package slb;

public class RightCar extends Thread
{
	int num;
	Bridge b;
	
	public RightCar(Bridge _b, int n)
	{
		b = _b;
		num = n;
	}
	
	public void run()
	{
		try
		{
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"right car #"+num+" is now entering and wait");System.out.flush();
			b.right_in();
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"right car #"+num+" is entered");System.out.flush();
			Thread.sleep(3000);
			b.right_out();
			System.out.println("on bridge: left*"+b.left+" right*"+b.right+" -- "+
				"right car #"+num+" is left");System.out.flush();
		} 
		catch (InterruptedException ee)
		{
			ee.printStackTrace();
		}
	}
}
