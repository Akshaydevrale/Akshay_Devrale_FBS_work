//Fibonacci series
#include<stdio.h>
int main()
{
	int a=0,b=1,c,num,i;
	printf("Enter the number :");
	scanf("%d",&num);
	
    for(i=1;i<=num;i++)
    {
    	printf("Fibonacci series is :%d\n",a);
    	c=a+b;
    	a=b;
    	b=c;
	}	
}
