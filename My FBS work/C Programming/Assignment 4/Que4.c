#include<stdio.h>
int main()
{
	int n,i,j,temp,sum,fact,num;
	printf("Enter the number N :");
	scanf("%d",&n);
	
	printf("Strong numbers :");
	for(i=1;i<=n;i++)
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
	return 0;
}
