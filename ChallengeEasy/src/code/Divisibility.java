package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisibility {

	/*
	 * You are provided an array A of size N that contains non-negative integers.
	 * Your task is to determine whether the number that is formed by selecting the
	 * last digit of all the N numbers is divisible by .
	 */

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			
			e.printStackTrace();
		}

		StringTokenizer st = null;
		try {
			st = new StringTokenizer(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(st.nextToken());

		}

		long max = Long.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			long sum = 0;

			int left = arr.length - i;

			int vo = 1;

			int k = i;

			while (left > 0) {

				for (int j = 0; j < vo; j++) {

					sum += (long) arr[k++];

				}

				vo++;

				left -= vo;

			}

			if (max < sum)
				max = sum;

		}

		System.out.println(max);
	}

}
