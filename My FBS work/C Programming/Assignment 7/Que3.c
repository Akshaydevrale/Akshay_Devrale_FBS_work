#include<stdio.h>
int main()
{
	int a[5],i;
	printf("Enter the array :");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	int num=0;
	for(i=0;i<5;i++)
	{
		num=num+a[i];
	}
	printf("Sum of all numbers is :%d",num);
}
