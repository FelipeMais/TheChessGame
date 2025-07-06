package com.chess_game.chess_game_server.model;

public class Position {
    int row;
    int column;

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
