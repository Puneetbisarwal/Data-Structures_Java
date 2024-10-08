import java.util.Scanner;
public class numberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i, j, k;
		  for(i=num;i>=1;i--)
		  {
		    k = i;
		    for(j=1;j<=num;j++)
		    {
		      if(k <= num)
		      {
		        System.out.print(k);
		      }
		      else
		      {
		        System.out.print(num);
		      }
		      k++;
		    }
		  System.out.print("\n");
		  }
		
		}
	}


