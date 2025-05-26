#include<stdio.h>
#include<string.h>
typedef struct date
{
	int date;
	char month[10];
	int year;
}date;
void main()
{
	date s1;
	
	s1.date=03;
	strcpy(s1.month,"November");
	s1.year=2003;
	
	printf("Date:%d Month:%s Year:%d",s1.date,s1.month,s1.year);
}
