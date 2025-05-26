#include<stdio.h>
#include<string.h>
typedef struct Date
{
	int date;
	int month;
	int year;
}Date;
Date store(Date);
void display(Date);
void main()
{
	Date d1;
	d1=store(d1);
	display (d1);
}Date store(Date d)
{
	printf("Enter date :");
	scanf("%d",&d.date);
	printf("Enter month :");
	scanf("%d",&d.month);
	printf("Enter year :");
	scanf("%d",&d.year);
	
	return d;
}
void display(Date d)
{
	printf("Date :%d ",d.date);
	printf("Month :%d ",d.month);
	printf("Year :%d ",d.year);
}

