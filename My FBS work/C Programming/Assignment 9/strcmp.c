#include<stdio.h>
#include<string.h>
void main()
{
	char a[]='apple';
	char b[]='banana';
	
	int result=strcmp(a,b);
	if(result==0)
		printf("String is same");
	else
		printf("String not same");
}
