#include<stdio.h>
#include<string.h>
typedef struct Admin
{
	int id;
	char name[10];
	int salary;
	int allowance;
	
}Admin;
Admin store(Admin);
void display(Admin);
void main()
{
	Admin a1;
	a1=store(a1);
	display(a1);
}
Admin store(Admin a)
{
	printf("Enter id:");
	scanf("%d",&a.id);
	printf("Enter name:");
	scanf("%s",&a.name);
	printf("Enter salary:");
	scanf("%d",&a.salary);
	printf("Enter allowance:");
	scanf("%d",&a.allowance);
	return a;

}
void display(Admin a)
{
	printf("Id :%d ",a.id);
	printf("Name :%s ",a.name);
	printf("Salary :%d ",a.salary);
	printf("Allowance :%d ",a.allowance);
}
