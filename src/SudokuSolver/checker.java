package SudokuSolver;

// It checks weather all the conditions are satisfied by  the input no or not

public class checker {
    static boolean check(int x, int y, int n){
        int i,j;

        // Check input condition for Sudoku

        for (i=0; i<9; i++) {
            if (sudokuSolver.grid[x][i]==n) {
                return false;
            }
            if (sudokuSolver.grid[i][y]==n) {
                return false;
            }
        }

        // Check all condition in a 3X3 block
        if (x <=2) {
            if (y <= 2) {
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 5) {
                for (i = 0; i < 3; i++) {
                    for (j = 3; j < 6; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 8) {
                for (i = 0; i < 3; i++) {
                    for (j = 6; j < 9; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            }
        }

        else if(x <= 5) {
            if (y <= 2) {
                for (i = 3; i < 6; i++) {
                    for (j = 0; j < 3; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 5) {
                for (i = 3; i < 6; i++) {
                    for (j = 3; j < 6; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 8) {
                for (i = 3; i < 6; i++) {
                    for (j = 6; j < 9; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            }
        }

        else if (x <= 8) {
            if (y <= 2) {
                for (i = 6; i < 9; i++) {
                    for (j = 0; j < 3; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 5) {
                for (i = 6; i < 9; i++) {
                    for (j = 3; j < 6; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            } else if (y <= 8) {
                for (i = 6; i < 9; i++) {
                    for (j = 6; j < 9; j++) {
                        if (sudokuSolver.grid[i][j] == n) {
                            return false;
                        }
                    }
                }
            }
        }

        // Return True if Every Condition is Satisfied
        return true;

    }
}
