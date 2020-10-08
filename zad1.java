class zad1
{
public static void main (String[] args)
{

int a,b,c;
System.out.println("m n a b c");
for(int i=0;i<10;i++)
{
	for(int j=0;j<10;j++)
	{
		a=i*i-j*j;
		b=2*i*j;
		c=i*i+j*j;
		if(c*c == (a*a+b*b))
		{
			System.out.println(i +" "+ j +" "+ a +" "+ b +" "+ c);
		}
	}
}




}


}