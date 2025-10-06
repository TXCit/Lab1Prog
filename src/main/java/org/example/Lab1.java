package org.example;

public class Lab1{
    public static void main(String[] args) {
        int[] n = new int[15];
        for (int i = 0; i < n.length; i = i + 1) {
            n[i] = 4 + i;
        }
        float[] x = new float[18];
        for (int i = 0; i < x.length; i = i + 1){
            x[i] = (float)(-15.0 + Math.random() * (3.0-(-15.0)));
        }
        double[][] s = new double[15][18];
        for (int i = 0; i < n.length; i = i + 1) {
            for (int j = 0; j < x.length; j = j + 1) {
                double kek = x[j];
                if (n[i] == 17) {
                    s[i][j] = Math.cos(Math.atan(1 / Math.exp(Math.abs(kek))));
                }
                if (n[i] == 4 || n[i] == 5 || n[i] == 8 || n[i] == 9 || n[i] == 10 || n[i] == 12 || n[i] == 14) {
                    s[i][j] = Math.cos((1.0/4) * (Math.exp(kek) + 0.5));
                }
                if (n[i] == 6 || n[i] == 7 || n[i] == 11 || n[i] == 13 || n[i] == 15 || n[i] == 16 || n[i] == 18){
                    s[i][j] = Math.atan((Math.PI / 4) * Math.exp(Math.cbrt(-(Math.pow((Math.abs(kek)), kek)))));
                }
            }
        }
        PM(s);
    }
    public static void PM(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.3f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}