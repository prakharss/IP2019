public class FactoryMain {
	public static void main(String a[])
	{
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Closed");
		obj.spec;

		// OS obj = osf.getInstance("Closed");
		// obj.spec;

		// OS obj = osf.getInstance("Other");
		// obj.spec;
	}
}

public class OperatingSytemFactory
{
	public OS getInstance(string str)
	{
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}
}

public interface OS
{
	void spec();
}

public class Android implements OS
{
	@Override
	public void spec()
	{
		System.out.println("Most Powerful OS");
	}
}

public class IOS implements OS
{
	@Override
	public void spec()
	{
		System.out.println("Most Secure OS");
	}
}

public class Windows implements OS
{
	@Override
	public void spec()
	{
		System.out.println("I am about to die");
	}
}