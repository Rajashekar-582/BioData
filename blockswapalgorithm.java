import java.util.*;
class blockswapalgorithm{
public static void main(String[] args)throws IOException
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 int k=sc.nextInt();
 for(int i=k;k<n;i++)
 {
 System.out.print(a[i]+" ");
 }
 for(int j=0;j<n;j++)
 {
 System.out.print(a[j]+" ");
 }
 }
 }