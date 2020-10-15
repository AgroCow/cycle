class zad2_5
{
public static void main (String[] args)
{

int q=34,p=21;

for (int i=1; i <= q; i++)
   {
    for (int j=1; j <= p; j++)  
	{
		if((q%i==0))
		{
			if(p % j ==0)
			{
		if(q % i != p % j)
			{
			 System.out.println("Делитель " + i +" Взаимно простой с числом "+ p);         
			}
			}
		}
    }
   }
   
}
}


