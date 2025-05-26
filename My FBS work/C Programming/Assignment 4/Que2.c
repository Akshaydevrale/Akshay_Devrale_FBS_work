#include<stdio.h>
int main()
{
	int n,i,j, isprime;
	printf("Enter the value of n number:");
	scanf("%d",&n);
	
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
	return 0;
	
}
