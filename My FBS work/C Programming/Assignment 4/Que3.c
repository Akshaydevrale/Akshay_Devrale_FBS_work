#include<stdio.h>
int main()
{
	int i,j,n,sum;
	printf("Enter the number N :");
	scanf("%d",&n);
	
	printf("Perfect numbers between 1 and %d are :",n);
	for(i=1;i<=n;i++)
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
	return 0;
}
