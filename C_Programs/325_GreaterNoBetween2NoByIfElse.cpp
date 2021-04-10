//wap to accept 2 numbers from the user and display the greater number.(if else)

#include <stdio.h>
#include<conio.h>

int main()
{
	int n1, n2;
	printf("Enter Number n1 and n2 : ");
	scanf("%d%d", &n1, &n2);
	if (n1 > n2)
		printf("\nn1 is greater than n2");
	else
		printf("\nn2 is greater than n1");
	return 0;
}
