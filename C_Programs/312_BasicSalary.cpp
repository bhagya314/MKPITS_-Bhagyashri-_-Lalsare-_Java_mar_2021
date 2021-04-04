//10 WAP TO ACCEPT BASIC SALARY(bs) FROM THE USER AND CALCULATE HRA(17% OF BASIC)
//, DA(28% OF BASIC) , TA(56% OF BASIC) AND TOTAL SALARY(ts).

#include<stdio.h>
int main()
{
 	float bs,hra,da,ta,ts;
    printf("enter basic salary\n");
    scanf("%f",&bs);
    printf("\n");
    
    hra=(bs*17)/100;
    printf("hra =%f\n",hra);
    printf("\n");

    da =(bs*28)/100;
    printf("da=%f\n",da);
    printf("\n");

    ta= (bs*56)/100;
    printf("ta = %f\n",ta);
    printf("\n");

    ts=bs+hra+da+ta;
    printf("total salary =%f\n",ts);
    return 0;
}
