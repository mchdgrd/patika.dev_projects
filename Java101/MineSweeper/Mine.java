package Java101.MineSweeper;

import java.util.Random;

public class Mine {
    int size;
    String[][] mines;
    String[][] map;
    int mineCount;
    int emptyCount;
    boolean isFinish = false;
    boolean isWin;

    Mine(int size) {
        this.size = size;

        this.mines = new String[size][size];
        this.map = new String[size][size];

        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines.length; j++) {
                map[i][j] = "-";
                mines[i][j] = "-";
            }
        }
        randomize();

        showMines();
        showMap();
    }

    void checkMine(int row, int col) {
        if (map[row][col].equals("-")) {
            if (mines[row][col].equals("*")) {
                map[row][col] = "*";
                loseGame();
            } else {
                if (checkNear(row, col) == 0) {
                    for (int i = row-1; i <= row+1; i++) {
                        for (int j = col-1; j <= col+1; j++) {
                            if (!(i < 0 || i >= size || j < 0 || j >= size)) {
                                checkMine(i, j);
                            }
                        }
                    }
                }
                showMap();
                if (emptyCount <= 0) {
                    winGame();
                }
            }
        }
    }

    int checkNear(int row, int col) {
        int areaMineCount = 0;
        for (int i = row-1; i <= row+1; i++) {
            for (int j = col-1; j <= col+1; j++) {
                if (!(i < 0 || i >= size || j < 0 || j >= size)) {
                    if (mines[i][j].equals("*")) {
                        areaMineCount++;
                    }
                }
            }
        }
        map[row][col] = "" + areaMineCount;
        emptyCount--;
        return areaMineCount;
    }

    void loseGame() {
        showMap();
        System.out.println("You Lost...");
        isFinish = true;
        isWin = false;
    }

    void winGame() {
        System.out.println("You Won!!!");
        isFinish = true;
        isWin = true;
    }

    void showMines() {
        System.out.println();
        for (String[] s : mines) {
            for (String ss : s) {
                System.out.print(ss + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void showMap() {
        System.out.println();
        for (String[] s : map) {
            for (String ss : s) {
                System.out.print(ss + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void randomize() {
        int area = size * size;
        mineCount = area / 4;
        emptyCount = area - mineCount;
        for (int i = 0; i < mineCount; ) {
            Random random = new Random();
            int randomNumber = random.nextInt(area);
            int numberRow = randomNumber / size;
            int numberCol = randomNumber % size;
            if (!mines[numberRow][numberCol].equals("*")) {
                mines[numberRow][numberCol] = "*";
                i++;
            }
        }
    }
}
