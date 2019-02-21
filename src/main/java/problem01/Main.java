package problem01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		//
		// 코드를 완성 하십시오.
		//
		ArrayList rsltArrayList = new ArrayList<>();
		int[] maxRslt = new int[2];
		int max = 0;
		
		for(int idx = 0; idx < arr.length-1; idx++) {
			for(int jdx = idx+1; jdx < arr.length; jdx++) {
				if(max < (arr[idx] * arr[jdx])) {
					max = (arr[idx] * arr[jdx]);
					maxRslt[0] = (arr[idx]);
					maxRslt[1] = (arr[jdx]);
				}
				rsltArrayList.add((arr[idx] * arr[jdx]));
			}
		}
		rsltArrayList.clear();
		rsltArrayList.add(maxRslt[0]);
		rsltArrayList.add(maxRslt[1]);
		System.out.println(rsltArrayList);
	}
}
