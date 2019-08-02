package string;

public class s2 
{
	public static void main(String args[])
	{
		String word="I am learning java ";
		int i=0;
		char guess=' ';
		for (int index = word.indexOf(guess);
			     index >= 0;
			     index = word.indexOf(guess, index + 1))
			{
			    System.out.println(word.substring(i,index));
			    i=index+1;
			}
		
		
		
	}
}
