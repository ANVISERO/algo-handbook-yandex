package com.ANVISERO.algo.bruteforce.task2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int n;
        int k;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            n = Integer.parseInt(tokenizer.nextToken());
            k = Integer.parseInt(tokenizer.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            writer.write(String.valueOf(combination(n, k)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int combination(int n, int k) {
        if (n == 0 || k == 0 || n < k) {
            return 0;
        }
        int numerator = 1;
        int denominator = 1;
        for (int i = n; i > k; i--) {
            numerator *= i;
        }
        for (int i = 2; i <= n - k; i++) {
            denominator *= i;
        }
        return numerator / denominator;
    }
}
