package SWEA.Problem.D1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 98ms 19344KB

public class Prob2068 {
    public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int maximum = Integer.parseInt(st.nextToken());

			for (int j = 0; j < 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(maximum < num) maximum = num;
			}

			sb.append("#" + (i+1) + " " + maximum + "\n");
		}

		System.out.println(sb);
		br.close();
	}
}
