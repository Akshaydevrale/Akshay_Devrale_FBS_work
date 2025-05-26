//pass by value
#include<stdio.h>
#include<string.h>
typedef struct Employee
{
	int id;
	char name[10];
	float salary;
	
}Employee;
Employee store(Employee);
void display(Employee);
void main()
{
	Employee e1;
	
	e1=store(e1);
	display(e1);
}
Employee store(Employee e)
{
	printf("Enter id:");
	scanf("%d",&e.id);
	printf("Enter name:");
	scanf("%s",&e.name);
	printf("Enter salary:");
	scanf("%f",&e.salary);
	
	return e;
}
void display(Employee e)
{
	printf("Id =%d ",e.id);
	printf("Name =%s ",e.name);
	printf("Salary =%f ",e.salary);

}
