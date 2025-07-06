package com.chess_game.chess_game_server.model;

import com.chess_game.chess_game_server.model.ChessPieces.ChessPiece;

import java.awt.*;

public class Board {
    private ChessPiece[][] board;

    public Board() {
        board = new ChessPiece[8][8];
    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    public ChessPiece getPieceAt(int row, int col) {
        return board[row][col];
    }

    public ChessPiece getPieceAt(Position position){
        return getPieceAt(position.getRow(), position.getColumn());
    }
}
