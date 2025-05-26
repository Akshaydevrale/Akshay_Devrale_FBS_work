#include<stdio.h>
#include<string.h>
void main()
{
	char a[20];
	printf("Enter string :");
	scanf("%s",&a);
	
	strupr(a);
	scanf("%s",a);
}
