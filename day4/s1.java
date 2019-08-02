package string;

public class s1 {

	
	public static void main(String[] args) 
	{
		String s="I am learning java";
		String wrd="";
		String a=s+" ";
		int l=a.length();
		for(int x=0;x<l;x++)
		{
			char ch=a.charAt(x);
			if(ch!=' ')
				wrd=wrd+ch;
			else
			{
				System.out.println(wrd);
				wrd="";
			}
			
		}

	}

}
