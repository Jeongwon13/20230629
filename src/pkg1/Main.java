package pkg1;

import java.util.*;

public class Main {
	
	public char solution(int n, String k) {
		
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : k.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		System.out.println("containsKey: "+map.containsKey('F'));
		System.out.println("첫번째 size: "+map.size());
		System.out.println("map.remove: "+map.remove('A'));
		System.out.println("두번째 size: "+map.size());
		
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			System.out.println("key와 map.get(key)의 값은? : "+key + ", " + map.get(key));
			if(map.get(key)>max) {
				max=map.get(key);
				 
				answer=key;
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String k = sc.next();
		
		System.out.print(T.solution(n, k));
	}
}
