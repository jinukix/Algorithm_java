package _9012_괄호;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (isValidPS(br.readLine())) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isValidPS(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
                if (close > open) {
                    return false;
                }
            }
        }

        return open == close;
    }
}
