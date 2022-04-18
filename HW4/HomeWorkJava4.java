/**
* Java 1. Homework 4
*
* @author Yana Merkulova
* @version 02.04.2022
*/

import java.util.Random;
import java.util.Scanner;

class HomeWorkJava4 {
    
    Random random;
    Scanner scanner;
    char[][] table;
    
    public static void main(String[] args) {
        new HomeWorkJava4().game();
    }
    
    HomeWorkJava4() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
    
    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWin('o')) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }
    
    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }
    
    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(x, y));
        table[x][y] = 'x';
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x, y));
        table[x][y] = 'o';
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }
    
    boolean checkWin(char ch) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                for (int yy = -1; yy < 2; yy++) {
                    for (int xx = -1; xx < 2; xx++) {
                        if (checkLine(ch, y, x, yy, xx) == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    int checkLine(char ch, int x, int y, int xx, int yy) {
        int a = 0;
        if (xx == 0 && yy == 0)
            return 0;
        for (int b = 0, xb = x, yb = y; b < 3; b++, xb += xx, yb += yy)
            if (xb >= 0 && yb >= 0 && xb < 3 && yb < 3 && table[yb][xb] == ch)
                a++;
        return a;
    }
        /*
        if (table [0][0] == ch && table [0][0] == ch && table [0][2] == ch) return true;
        if (table [1][0] == ch && table [1][1] == ch && table [1][2] == ch) return true;
        if (table [2][0] == ch && table [2][2] == ch && table [2][2] == ch) return true;
        
        if (table [0][0] == ch && table [1][0] == ch && table [2][0] == ch) return true;
        if (table [0][1] == ch && table [1][1] == ch && table [2][1] == ch) return true;
        if (table [0][2] == ch && table [1][2] == ch && table [2][2] == ch) return true;
        
        if (table [0][0] == ch && table [1][1] == ch && table [2][2] == ch) return true;
        if (table [2][0] == ch && table [1][1] == ch && table [0][2] == ch) return true;
        */
    
    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}