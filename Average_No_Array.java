package com.arrayexample;

public class Average_No_Array {
	public static void main(String[] args) {
		int rollno[]=new int[3];
		rollno[0]=10;
		rollno[1]=11;
		rollno[2]=12;
		rollno[3]=13;
		int sum=0;
		double average=0;
		
		/*for(int i=0; i<rollno.legnth;i++) //Also we can do this(without equals to(=))
		 * for(int i=0; i<=rollno.legnth-1;i++) // if passing equals to(=) then should write length-1
		{
			sum=sum+rollno[i];
		}
		*/
		
		for(int i=0; i<=3;i++) 
		{
			sum=sum+rollno[i];
		}
		
		/*execution
		 * i=0,sum=0+10, sum=10
		 * i=1, sum=10+11, sum=21
		 * i=2, sum=21+12, sum=33
		 * i=3, sum=33+13, sum=43
		 */
		System.out.println(sum);
		average=sum/rollno.length;
		System.out.println(average);
	}

}
