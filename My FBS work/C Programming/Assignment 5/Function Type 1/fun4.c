//Assignment 4,Function type 1.
void prime();
void perfect();
void strong();
void fibonacci();
void main()
{
	prime();
	perfect();
	strong();
	fibonacci();
}
void prime()
{
	int n,i,j, isprime;
	printf("Enter the value of n number:");
	scanf("%d",&n);
	
	printf("Prime numbers from 1 to %d is :",n);
	
	for(i=2;i<=n;i++)
	{
		isprime=1;
		for(j=2;j*j<=i;j++)
		{
			if(i%j==0){
			isprime=0;
			break;
		}
		}
		if(isprime)
		printf(" %d",i);
	}
	printf("\n");
	return 0;
}
void perfect()
{
	int i,j,n,sum;
	printf("Enter the number N :");
	scanf("%d",&n);
	
	printf("Perfect numbers between 1 and %d are :",n);
	for(i=1;i<=n;i++)
	{
		sum=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			{
			sum=sum+j;
			}
		}
		if(sum==i)
		printf(" %d",i);
	}
	printf("\n");
	return 0;
}
void strong()
{
	int n,i,j,temp,sum,fact,num;
	printf("Enter the number N :");
	scanf("%d",&n);
	
	printf("Strong numbers :");
	for(i=1;i<=n;i++)
	{
		temp=i;
		sum=0;
		
		while(temp>0)
		{
			fact=1;
			num=temp%10;
			for(j=1;j<=num;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		printf(" %d",i);
	}
	printf("\n");
	return 0;
}
void fibonacci()
{
	int n,i,j,first=0,last=1,sum;
	printf("Enter the number of terms :");
	scanf("%d",&n);
	
	printf("Fibonacci series :");
	for(i=0;i<n;i++)
	{
		printf(" %d",first);
		sum=first+last;
		for(j=0;j<1;j++)
		{
			first=last;
			last=sum;
		}
	}
}

