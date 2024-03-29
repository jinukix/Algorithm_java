package _10816_숫자_카드2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>(n);
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(key, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
