#include <stdio.h>

int main(void) {
	// your code goes here
	int n,q,i=0,j=0,count;
	scanf("%d",&n);
	scanf("%d",&q);
	j=n+1;
	while(j<q)
	{
		count=0;
		for(i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
				count=1;
				break;
			}
			if(count==0)
			{
				printf("%d",j);
			}
			j++;
		}
	}
	return 0;
}
