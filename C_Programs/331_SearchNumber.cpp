//wap to store 5 no. in an array .
//then accept a no. from the user and search this number in an array.(search an element in an array)

#include<stdio.h>
int main()
{
	int num[5] = { 1,2,3,4,5}; 
	int usernumber;
	int cnt;
	printf("enter no to be searched in an array");
	scanf("%d",&usernumber) ; //6
	for(cnt=0;cnt<5;cnt++)
	{
		if(usernumber == num[cnt])
		{
			printf("\n no. found in an array at position %d",cnt+1);
			break;
		}
	
	}
	
	if(cnt == 5)
	{
		printf("\n no. not found in an array");
	}
	
	
	return 0;

}

