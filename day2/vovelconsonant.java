package prime;
import java.util.Scanner;
public class vovelconsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the alphabet");
		Scanner sc=new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		if(alpha=='a'|| alpha=='e'|| alpha=='i'||alpha=='o'||alpha=='u'|| alpha=='A'|| alpha=='E'|| alpha=='I'|| alpha=='O'|| alpha=='U')
		System.out.println("alphabet is vowel");
		else
			System.out.println("Alphabet is consonant");

	}

}
