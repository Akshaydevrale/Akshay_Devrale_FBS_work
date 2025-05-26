#include<stdio.h>
void main()
{
	int a[5],num,i;
	printf("Enter the number of array");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Search the number");
	scanf("%d",&num);
	for(i=0;i<num;i++)
	{
		if(a[i]==num)

	{
		printf("num is found");
		return;
    	}
	}
	printf("num not found");
}
