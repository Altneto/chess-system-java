package application;

import boardgame.Position;

public class Program {
    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        Position position = new Position(row, column);
        System.out.println(position);
    }
}
