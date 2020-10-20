class pa
{

public static void main (String[] args)
 {
	int fs,f,ss=1,sn=0;
for(int i=0;i<1000;i++)
  {
	  fs=i;
  while (fs > 0) 
    {
	
     ss=ss*10+fs % 10;
     fs /=10;
    }

if(i==ss)
  {
	f=i*i;
	 while (f > 0)
		{
         sn=sn*10+f%10;
		 f/= 10;
        }
		
		if((i*i)==sn)
		{
		System.out.println("ПАЛЕНДРОМ ="+i);
		}
   }
   ss=0;sn=0;
  }
 
 }
}