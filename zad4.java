class zad4
{
public static void main (String[] args)
{

double n=10,P=1,ii=100000,PP=1;

for(double i=1;i<10;i++)
{		
P=1/Math.pow(i+1,2);
if(i<ii)
{
	PP=P;
	ii=i;
}
}
	System.out.println("P= "+PP+"n= "+ii);
}
}