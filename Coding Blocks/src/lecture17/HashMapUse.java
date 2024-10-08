package lecture17;

import java.util.HashMap;

public class HashMapUse {

	
	
	public static void printintersection(int a[],int b[]) {
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int ai:a) {
			map.put(ai, true);
		}
		
		for(int bi:b) {
			if(map.containsKey(bi)) {
			System.out.println(bi);
		  }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("this",1);
		map.put("this",10);
		System.out.println(map.get("this"));
		System.out.println(map.remove("this"));
		System.out.println(map.get("this"));
	}
}

//import java.util.HashMap;
//
//public class HashMapUse {
//
//	public static void printIntersection(int a[], int b[]) {
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for (int ai: a) {
//			map.put(ai, true);
//		}
//		
//		for (int bi: b) {
//			if (map.containsKey(bi)) {
//				System.out.println(bi);
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		String s = "this";
//		String v = new String("this");
//		if (s.equals(v)) {
//			System.out.println("same");
//		}
//		
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put(s, 10);
//		System.out.println(map.get(v));
//		
//		int a = s.hashCode();
//		int b = v.hashCode();
//		
//		Map<String, Integer> ourMap = new Map<>();
//		ourMap.add(s, 10);
//		System.out.println(ourMap.get(v));
		
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("this", 1);
//		map.put("this", 10);
//		System.out.println(map.get("this"));
//		System.out.println(map.remove("this"));
//		System.out.println(map.get("this"));
//	}

//}


