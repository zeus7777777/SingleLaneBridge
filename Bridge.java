package slb;

public class Bridge
{
	int left, right;
	
	public Bridge()
	{
		left = right = 0;
	}
	
	synchronized public void left_in() throws InterruptedException
	{
		while(right>0)
			wait();
		left++;
	}
	synchronized public void left_out()
	{
		if(--left==0)
			notifyAll();
	}
	
	synchronized public void right_in() throws InterruptedException
	{
		while(left>0)
			wait();
		right++;
	}
	
	synchronized public void right_out()
	{
		if(--right==0)
			notifyAll();
	}
}
