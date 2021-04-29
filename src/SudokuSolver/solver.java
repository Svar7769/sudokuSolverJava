package SudokuSolver;

public class solver {
    static void solve() {
        for (int i=0; i<9; i++ ) {
            for (int j = 0; j < 9; j++) {
                if (sudokuSolver.grid[i][j] == 0) {
                    for (int n = 1; n <= 9; n++) {
                        if (checker.check(i, j, n)) {
                            sudokuSolver.grid[i][j] = n;
                            solve();
                        }
                        if (n == 9) {
                            sudokuSolver.grid[i][j] = 0;
                            return;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < sudokuSolver.grid.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < sudokuSolver.grid[i].length; j++) { //this equals to the column in each row.
                System.out.print(sudokuSolver.grid[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
}
