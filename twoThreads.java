class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}
class ThreadTest
{
	public static void main(String args[])
	{
		Thread1 A = new Thread1();
		Thread2 B = new Thread2();
		A.start();
		B.start();
	}
}