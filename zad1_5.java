class zad1_5
{
public static void main (String[] args)
{

int k=0,m=0,n=4;

for (int i=1; i <100; i++)
   {
    if ((i % 3)==k && (i % 5)==m && (i % 7)==n) 
     {  
System.out.println(" x= " + i);
      System.exit(0);
     }
  
   
   }

 
     System.out.println("Chislo ne naydeno");                    
      

}


}