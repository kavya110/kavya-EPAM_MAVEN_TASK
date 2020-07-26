package epam.sweetsproject;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        int nc,ch,cw,sw,i,tot=0,j=0,l;
        System.out.println("Enter the no.of children ");
        @SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
        nc=in.nextInt();
        int choco[] =new int [nc];
        String choconame[] =new String [nc];
        for(i=0;i<nc;i++)
        {
        	System.out.println("Enter the Sweet or Candy \n for Sweet press 1 and candies press 0\n");
        	ch=in.nextInt();
        	if(ch==1)
        	{
        		System.out.println("Enter the Sweet name and weight");
        		String sn=in.next();
        		sw=in.nextInt();
        		tot=tot+sw;
        		Sweets obsweet= new Sweets();
        		obsweet.sweets(sn, sw);
        		
        	}
        	if(ch==0)
        	{
        		System.out.println("Enter the Candy name and weight");
        		String cn=in.next();
        		cw=in.nextInt();
        		tot=tot+cw;
        		choconame[j]=cn;
        		choco[j]=cw;
        		j++;
        	}
        	
        	
        }
        l=j;
        for(i=0;i<nc;i++)
        {
        	for(j=i+1;j<nc;j++)
        	{
        		if(choco[i]>choco[j])
        		{
        			int temp=choco[i];
        			choco[i]=choco[j];
        			choco[j]=temp;
        			String temp1=choconame[i];
        			choconame[i]=choconame[j];
        			choconame[j]=temp1;
        			
        		}
        	}
        }
        System.out.println("The total weight of chocolates is : "+tot);
        System.out.println("The chocolates after sorting\n");
        for(i=0;i<nc;i++)
        {
        	if(choconame[i]!=null)	
        		System.out.println(choconame[i]);
        }        
        
    }
    public static class Gifts
    {
    	public static void Giftweight(int numb)
    	{ 
    		int weight=numb;
    	}
    	
    }
    public static class Sweets extends Gifts
    {
    	public void sweets(String name,int weight)
    	{
    		Gifts.Giftweight(weight);
    		String sweetname=name;
    		
    	}
    	
    }
    public static class Candies extends Gifts
    {

    	public void candies(String name,int weight)
    	{
    		String choc=name;
    		Gifts.Giftweight(weight);
    	}
    }
}
