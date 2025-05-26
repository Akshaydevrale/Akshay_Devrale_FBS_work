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
Salesmanager store(Salesmanager);
void display(Salesmanager);
void main()
{
	Salesmanager s1;
	s1=store(s1);
	display(s1);
}
Salesmanager store(Salesmanager s)
{
	printf("Enter id :");
	scanf("%d",&s.id);
	printf("Enter Name :");
	scanf("%s",&s.name);
	printf("Enter salary :");
	scanf("%d",&s.salary);
	printf("Enter incentive :");
	scanf("%d",&s.incentive);
	printf("Enter target :");
	scanf("%d",&s.target);
	
	return s;
}
void display(Salesmanager s)
{
	printf("Id :%d ",s.id);
	printf("Name :%s ",s.name);
	printf("Salary :%d ",s.salary);
	printf("Incentive :%d ",s.incentive);
	printf("Target :%d ",s.target);
}
