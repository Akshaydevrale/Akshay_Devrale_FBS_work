#include<stdio.h>
void temprature(int);
void rectangle(int,int);
void add(int);
void evenodd(int);
void salary(int);
void age(int,int);
void main()
{
	int celsius;
	int l,w;
	int num;
	int no;
	int basic;
	int maleage,femaleage;
	
	printf("Enter temperature in Celsius: ");
    scanf("%d", &celsius);
	temprature(celsius);
	
	printf("\nEnter length and width of the rectangle: ");
    scanf("%d %d", &l, &w);
    rectangle(l,w);
    
    printf("\nEnter a three-digit number: ");
    scanf("%d", &num);
    add(num);
    
    printf("\nEnter the number to check evenodd:");
    scanf("%d",&no);
    evenodd(no);
    
    printf("\nEnter the salary:");
    scanf("%d",&basic);
    salary(basic);
    
    printf("\nEnter Maleage and Femaleage to marry: ");
    scanf("%d %d", &maleage, &femaleage);
    age(maleage,femaleage);

}
void temprature(int c)
{
	int f;
	f=(c*5/9)+32;
	printf("%d\n",f);
}
void rectangle(int l,int w)
{
	int area, perimeter;
    area = l*w;
    perimeter = 2*(l+w);
    
    printf("Area of the rectangle: %d\n", area);
    printf("Perimeter of the rectangle: %d\n", perimeter);
}
void add(int num)
{
	int a,b,c;
	a=num/100;
	int q1=num%100;
	b=q1/10;
	c=q1%10;
	int result=a+b+c;
	printf("Addition of three numbers = %d\n",result);
	printf("Reverse of the numbers = %d%d%d\n",c,b,a);
}
void evenodd(int no)
{
	if(no%2==0)
	printf("Number is even\n");
	else
	printf("Number is odd\n");
}
void salary(int basic)
{
	float da, ta, hra, total_salary;   
	if (basic <= 5000) 
	{
        da=basic*0.10;
        ta=basic*0.20;
        hra=basic*0.25;
    }
	else 
	{
        da=basic*0.15;
        ta=basic*0.25;
        hra=basic*0.30;
    }
    total_salary=basic+da+ta+hra;
    printf("Basic Salary: %f\n", basic);
    printf("DA: %f\n", da);
    printf("TA: %f\n", ta);
    printf("HRA: %f\n", hra);
    printf("Total Salary: %f\n", total_salary);
}
void age(int maleage,int femaleage)
{
	if(maleage>=21)
	printf("Male are Eligible to marry\n");
	else
	printf("Male are Not Eligible to marry\n");
	
	if(age>=18)
	printf("Female is Eligible to marry\n");
	else
	printf("Female is Not Eligible to marry\n");
}
