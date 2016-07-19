public class Counter 
{

	static int count =0;

	public static int getCount()
	{
		return count;
	}

	public static void setCount(int count) 
	{
		Counter.count = count;
	} 
	public static void increment() {
		Counter.count++;
	}
}
