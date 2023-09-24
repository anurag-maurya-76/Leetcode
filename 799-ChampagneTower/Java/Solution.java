class Solution {
    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[] prev_row = { poured };

        for (int row = 1; row < query_row + 1; row++) {
            double[] curr_row = new double[row + 1];
            for (int i = 0; i < row; i++) {
                double flow = prev_row[i] - 1;
                if (flow > 0) {
                    curr_row[i] += 0.5 * flow;
                    curr_row[i + 1] += 0.5 * flow;
                }
            }
            prev_row = curr_row.clone();
        }
        return Math.min(prev_row[query_glass], 1);
    }

    public static void main(String[] args) {
        System.out.println(champagneTower(500, 7, 3));
    }
}