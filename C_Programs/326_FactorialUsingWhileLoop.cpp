//wap to accept a no. from the user and print the factorial of that number
#include<stdio.h>
int main()
{
	int num,org_num;
	int fact=1;
	printf("enter number");
	scanf("%d",&num);
	org_num=num;
	while(num>0)
	{
		fact=fact*num;
		num = num -1;
		
	}
	printf("\n factorial of number %d=%d",org_num,fact);
}
