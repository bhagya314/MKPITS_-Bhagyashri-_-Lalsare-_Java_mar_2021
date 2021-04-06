//create a function calculate to calculate area and circ using pointers

#include<stdio.h>
#include<conio.h>
#include<string.h>
void calculate(int radius,float *a,float *c)
{
	*a= 3.14f * radius * radius;
	*c = 2 * 3.14f * radius;
}

	int main()
{
	int radius;
	float area,circ;
	printf("enter radius");
	scanf("%d",&radius);
	calculate(radius,&area,&circ);
	printf("\n area = %f",area);
	printf("\n circ = %f",circ);

}
