package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;
		
		for(int i = 0 ; i < length ; i++) {
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
		br.close();
	}
}
