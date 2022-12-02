package BOJ.단계별로_풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭 124ms 14232KB

public class Prob2798_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int Number_Of_Card = Integer.parseInt(st1.nextToken());
        int Maximum_Number = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] All_Card = new int[Number_Of_Card];

        for (int i = 0; i < Number_Of_Card; i++) {
            All_Card[i] = Integer.parseInt(st2.nextToken());
        }

        BlackJack(All_Card, Maximum_Number);

        br.close();
    }

    public static void BlackJack(int[] card, int maximum) {

        StringBuilder sb = new StringBuilder();

        int close_maximum = 0;
        int length = card.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {

                    int sum = card[i] + card[j] + card[k];

                    if ((maximum - sum) <= (maximum - close_maximum) && sum <= maximum) {
                        close_maximum = sum;
                    }
                }
            }
        }

        sb.append(close_maximum);
        System.out.println(sb);
    }
}