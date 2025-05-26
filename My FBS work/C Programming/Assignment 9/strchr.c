#include<stdio.h>
#include<string.h>
void main()
{
	char a[10];
	char b='k';
	printf("Enter string :");
	scanf("%d",&a);
	
	char* ptr=strchr(a,b);
	if(ptr=='\0')
	{
	printf("char found:%c",(ptr-a));
	printf("%s",&b);
	}
	else
	{
	printf("char not found...");
	}
}
