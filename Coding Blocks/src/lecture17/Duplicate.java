package lecture17;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {

	public static void remove(int a[]) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int ai : a) {
			if (map.containsKey(ai)) {
				System.out.println(ai);
			} else
				map.put(ai, true);
		}
	}

	public static void sumZero(int n[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n.length; i++) {

			if (map.containsKey(n[i] * -1)) {
				for (int j = 0; j < map.get(n[i]); j++) {
					System.out.println(n[i] + " " + (-1 * n[i]));
				}
			}
			if (map.containsKey(n[i])) {
				map.put(n[i], map.get(n[i]) + 1);
			} else {
				map.put(n[i], 1);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap<Integer,Boolean> map=new HashMap<>();
		//
		// int a[] ={1,2,3,4,5,6,1,2,1,1,8,8,8};
		// remove(a);

		// HashMap<Integer,Integer> map=new HashMap<>();
		// System.out.print("Enter the the Size = ");
		// Scanner sc=new Scanner(System.in);
		// int p=sc.nextInt();
		// int [] arr =[p];
		// for(int i=0;i<arr.length;i++) {
		// System.out.println("Enter the "+(i+1)+" Element = "+arr[i]);
		// }

		int a[] = { 1, -2, 2, -1, 4, 5, 0, 0, 2, 1, -2, -1 };
		sumZero(a);
	}
}
