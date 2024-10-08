import java.util.Scanner;
public class armstrong {
	static int order(int x)
	{
	    int n = 0;
	    while (x != 0)
	    {
	        n++;
	        x = x/10;
	    }
	    return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int n = order(num);
    int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total +(int)(Math.pow(temp, n));
            number /= 10;
        }

        if(total == num)
            System.out.println(true);
        else
            System.out.println(false);
	}

}
