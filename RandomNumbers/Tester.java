import java.util.Random;
public class Tester {

	public static void main(String[] args) {
	//Problem number one:
	Random rando=new Random();
	int count=1;
	for(int a=0;a<33;a++)
	{
	int x=71+rando.nextInt(29);
	System.out.print(x+" ");
	if(count%15==0){System.out.println();}
	count++;
	}
	System.out.println();
	System.out.println();
	//Problem number two:
	Random randy=new Random();
	double y;
	int count1=1;
	for(int b=0;b<27;b++)
	{	
	y=47.44+99.78*randy.nextDouble();
	System.out.print(y+" ");
	if((count1%1)==0){System.out.println();}
	count++;
	}
	
	}

}
