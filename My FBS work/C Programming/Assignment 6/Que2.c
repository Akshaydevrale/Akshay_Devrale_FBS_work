#include<stdio.h>
void area(int*,int*);
int main()
{
	int length,width;
	printf("Enter the values of length & width:");
	scanf("%d%d",&length,&width);
	area(&length,&width);
}
void area(int* a,int* b)
{
	int length=* a;
	int width=* b;
	int area, perimeter;
    area = length*width;
    perimeter = 2*(length+width);
    
    printf("Area of the rectangle: %d\n", area);
    printf("Perimeter of the rectangle: %d\n", perimeter);
    
}
