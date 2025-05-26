#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main()
{
	char a[10];
	char b[10];
	
	printf("Enter the string:");
	scanf("%s",a);
	printf("Enter the string:");
	scanf("%s",b);

	int ptr=mystrcmp(a,b);
	printf("%d",ptr);
}

int  mystrcmp(char* b,char* a)
  {
  	int i=0;
  	int sum1=0;
  	int sum2=0;
  	while(a[i]!='\0')
  	{
  		sum1=sum1+a[i];
  		i++;
	  }
	  i=0;
	  while(b[i]!='\0')
	  {
	  	sum2=sum2+b[i];
	  	i++;
	  }
	  if(sum1==sum2)
	  return 0;
	  else
	  if(sum1<sum2)
	  return 1;
	  else
	  return -1;
  }
