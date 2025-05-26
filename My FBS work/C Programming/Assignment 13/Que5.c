#include<stdio.h>
#include<string.h>
typedef struct Salesmanager
{
	int id;
	char name[10];
	int salary;
	int incentive;
	int target;
}Salesmanager;
void main()
{
	Salesmanager s1;
	
	s1.id=111;
	strcpy(s1.name,"Akshay");
	s1.salary=50000;
	s1.incentive=1000;
	s1.target=99;
	
	printf("Id =%d Name =%s Salary =%d Incentive =%d Target =99",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
}
