package prime;



public class pyramid {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int c=4;
for(int i=1;i<=5;i++)
{
for(int s=5;s>i;s--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(i);
System.out.print(" ");
}
System.out.println();
}
//int c=4;
for(int l=1;l<=4;l++)
{
for(int m=1;m<=l;m++)
{
System.out.print(" ");
}
for(int k=4;k>=l;k--)
{
System.out.print(c);
System.out.print(" ");
}
c--;

System.out.println();
}

}

}