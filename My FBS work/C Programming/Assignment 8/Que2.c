#include<stdio.h>
void search(int a[]);
void main()
{
	int a[5],i;
	printf("Enter the numbers in array: ");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	search(a);
}
void search(int a[])
{
	int num,i;
	printf("Enter the number to search:");
	{
		scanf("%d",&num);
	}
	for(i=0;i<num;i++)
	{
		if(a[i]==num)
		{
			printf("%d num is found",num);
			return;
		}		
	}
	printf("Num is not found");
}
