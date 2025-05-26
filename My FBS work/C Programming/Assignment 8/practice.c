#include<stdio.h>
void main()
{
	int a[5],i;
	int num;
	printf("ENTER THE NUMBER:");
	for(i=0;i<5;i++)
	scanf("%d",&a[i]);
	
	printf("SEARCH THE NUMBER IN THE ARRAY:");
	scanf("%d",&num);
	
	for(i=0;i<num;i++)
	{
		if(num==a[i])
		{
			printf("NUM FOUND=%d",a[i]);
			return;
		}
		
	}
	printf("NUM NOT FOUND");
}
