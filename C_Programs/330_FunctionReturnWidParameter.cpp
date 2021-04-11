#include<stdio.h>
int calculate(int n1,int n2)
{
	int sum = n1+n2;
	printf("\n sum of two numbers = %d",sum);
}
//from main the execution of the program starts.
int main()
{
	int num1,num2;
	printf("enter 2 numbers");
	scanf("%d%d",&num1,&num2);
	//calling the calculate function and passing 2 arguments num1 and num2 to function calculate
	calculate(num1,num2);
	printf("\n back to main function");
	
		
}

