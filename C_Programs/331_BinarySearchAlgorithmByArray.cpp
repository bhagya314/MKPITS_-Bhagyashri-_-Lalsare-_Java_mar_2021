//wap to search an element in an array using binary search algorithm.

#include<stdio.h>
int main()
{
	int num[5] = { 1,2,3,4,5}; 
	int low=0,high=4,mid,notosearch;
	printf("enter no to be searched");
	scanf("%d",&notosearch); //5
	//writing logic for binary search
	while(low <= high) //4  <= 4
	{
		mid=(low+high)/2; // (4+ 4) /2 =4
		if(num[mid]==notosearch) // 5 == 5
		{
			printf("no %d found at position %d ",notosearch,mid);
			break;
		}
		else
		{
			if(num[mid] < notosearch) // 4 < 5
				low=mid+1; // 3+1 =4
			if(num[mid] > notosearch) // 3 > 5
				high=mid-1; // 
		}
		
	}
	if(low>high)
	{
		printf("\nno not found in an array");
	}
	return 0;

}
