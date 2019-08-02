package prime;

public class string {
	public static void main(String args[])
	{
		String s="I Love my India";
		//String wrd="";
		String a=s+" ";
		int count=0;
		int len=a.length();
		for(int x=0;x<len;x++)
		{
			char ch=a.charAt(x);
			if( ch!=' ')
				continue;
			else
				count++;
		}
		System.out.println("The no. of words = "+count);
	}

}
