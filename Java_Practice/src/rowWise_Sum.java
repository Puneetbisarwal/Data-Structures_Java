import java.util.Scanner;

//public class rowWise_Sum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//int [][] num={
//		{1,2,1,1},
//		{3,4,1,1},
//		{5 ,6,1,1},
//		{7, 8,1,1},
//};
//		int rows=0,rowtotal=0;
//		
//		for(int i=0;i<num.length;i++){
//			for(int j=0;j<num.length;j++){
//				rowtotal+=num[i][j];
//			}
//			System.out.print(rowtotal+" ");
//			rowtotal=0;
//		}
////		System.out.print(rowtotal+" ");
//	}
//
//}






















public class rowWise_Sum {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s=new Scanner(System.in);
 
		int[][] array=new int[10][10];
        int i, j, m, n, sum = 0;
 
       
         m=s.nextInt();
         n=s.nextInt();
 
      
        for (i = 0; i < m; ++i)
        {
            for (j = 0; j < n; ++j) 
            {
                array[i][j]=s.nextInt();
            }
        }
 
		for (i = 0; i < m; ++i) 
        {
            for (j = 0; j < n; ++j) 
            {
                sum = sum + array[i][j] ;
            }
 
            System.out.print(sum+" ");
            sum = 0;
 
	}
}
}
