#include<stdio.h>
void prime(int);
void perfect(int);
void strong(int);
void fibonacci(int);
void main()
{
	int n;
	printf("Enter the value of n number:");
	scanf("%d",&n);
	prime(n);
	
	int no;
	printf("\nEnter the number N :");
	scanf("%d",&no);
	perfect(no);
	
	int number;
	printf("\nEnter the number N :");
	scanf("%d",&number);
	strong(number);
	
	int f;
	printf("\nEnter the number to print fibonacci series:");
	scanf("%d",&f);
	fibonacci(f);
}
void prime(int n)
{
	int i,j, isprime;
	printf("Prime numbers from 1 to %d is :",n);
	
	for(i=2;i<=n;i++)
	{
		isprime=1;
		for(j=2;j*j<=i;j++)
		{
			if(i%j==0){
			isprime=0;
			break;
		}
		}
		if(isprime)
		printf(" %d",i);
	}
	printf("\n");
}
void perfect(int no)
{
	int i,j,sum;
	printf("Perfect numbers between 1 and %d are :",no);
	for(i=1;i<=no;i++)
	{
		sum=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			{
			sum=sum+j;
			}
		}
		if(sum==i)
		printf(" %d",i);
	}
	printf("\n");

}
void strong(int number)
{
	int i,j,temp,sum,fact,num;
	printf("Prime numbers from 1 to %d is :",number);
	for(i=1;i<=number;i++)
	{
		temp=i;
		sum=0;
		
		while(temp>0)
		{
			fact=1;
			num=temp%10;
			for(j=1;j<=num;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		printf(" %d",i);
	}
	printf("\n");
}
void fibonacci(int f)
{
	int i,j,first=0,last=1,sum;
	printf("Fibonacci series of number %d :",f);
	for(i=0;i<f;i++)
	{
		printf(" %d",first);
		sum=first+last;
		for(j=0;j<1;j++)
		{
			first=last;
			last=sum;
		}
	}
}
