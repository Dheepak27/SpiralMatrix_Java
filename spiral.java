import java.util.*;
public class spiral
{
   Scanner sc=new Scanner(System.in);
   int n,arr[][],spiral[];int ind=0;
   void input()
   {
  System.out.println("Enter n");
  n=sc.nextInt();
  arr=new int[n][n];
  spiral=new int[n*n];
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
  arr[i][j]=sc.nextInt();
  }
  }
}
   void spimat()
   {
 int count=0;
 int a=0,b=0,c=n-1,d=n-1;
 int p=n-1,q=0,r=1;
 int s=n-1;
 int m=0;
  while(count!=n-2)
  {
  int w=a,x=b,y=c,z=d;
  for(w=a;w<p;w++)
  {  
  spiral[ind++]=arr[m][w];
  }
  for(x=b;x<p;x++)
  {
  spiral[ind++]=arr[x][s];
  }
  for(y=c;y>q;y--)
  {  
  spiral[ind++]=arr[s][y];
  }
  for(z=d;z>=r;z--)
  {
  spiral[ind++]=arr[z][m];
  }
  count++;
  a=a+1;b=b+1;c=c-1;d=d-1;r=r+1;p=p-1;s=s-1;q=q+1;m=m+1;
  }
  int k;
  if(n%2!=0)
  {
           k=(n-1)/2;
     spiral[spiral.length-1]=arr[k][k];
  }
  else
  {
  k=(n-1)/2;
      spiral[spiral.length-1]=arr[k+1][k];
  }
   }
  void print()
  {
  if(n==2)
  {
  System.out.println(arr[0][0]+" "+arr[0][1]);
  System.out.println(arr[1][1]+" "+arr[1][0]);
  }

  else
  for(int i=0;i<spiral.length;i++)
  {
  System.out.print(spiral[i]+" ");
  if((i+1)%n==0)
  System.out.println();
  }
  }
public static void main(String [] args)
   {
  spiral ob=new spiral();
  ob.input();
  ob.spimat();
  ob.print();
   }
}
