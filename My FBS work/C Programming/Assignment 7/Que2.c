#include<stdio.h>
int main()
{
	int a[5],i;
	printf("Enter the numbers array :");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	int num;
	printf("Enter the number to search :");
	
	for(i=0;i<1;i++)
	{
		scanf("%d",&num);
	}
	
	int n=0;
	for(i=0;i<5;i++)
	{
		if(num == a[i])
		{
		int n=i+1;
		}
	}
	if(n!=0)
		printf("%d Num is found",n);
	else
		printf("Num is not found");
}
