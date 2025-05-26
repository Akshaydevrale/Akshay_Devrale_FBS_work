#include<stdio.h>
//sum of all num
void sum(int a[]);
void main()
{
	int a[5],i;
	printf("Enter the numbers in array: ");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	sum(a);
}
void sum(int a[])
{
	int num,i;
	for(i=0;i<5;i++)
	{
		num=num+a[i];
	}
	printf("sum of array :%d ",num);
}
