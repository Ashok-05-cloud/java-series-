public class MazePath {

    static void findPaths(
            int row,
            int col,
            int n,
            int m,
            String path) {

        if (row == n - 1 &&
            col == m - 1) {

            System.out.println(path);
            return;
        }

        // Move Down
        if (row + 1 < n) {

            findPaths(
                row + 1,
                col,
                n,
                m,
                path + "D"
            );
        }

        // Move Right
        if (col + 1 < m) {

            findPaths(
                row,
                col + 1,
                n,
                m,
                path + "R"
            );
        }
    }

    public static void main(String[] args) {

        findPaths(
            0,
            0,
            3,
            3,
            ""
        );
    }
}