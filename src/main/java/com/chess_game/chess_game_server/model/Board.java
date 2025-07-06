package com.chess_game.chess_game_server.model;

import com.chess_game.chess_game_server.exception.BoardException;
import com.chess_game.chess_game_server.model.ChessPieces.Color;
import com.chess_game.chess_game_server.model.ChessPieces.Piece;

public class Board {
    private Piece[][] board;
    int rows;
    int columns;

    public Board(int rows, int cols) {
        if(rows < 1 || cols < 1) {
            throw new BoardException("Invalid board length");
        }
        this.rows = rows;
        this.columns = cols;
        board = new Piece[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public Piece getPieceAt(int row, int col) {
        return board[row][col];
    }

    public Piece getPieceAt(Position position){
        return getPieceAt(position.getRow(), position.getColumn());
    }

    public boolean isTherePieceAt(Position position){
        return getPieceAt(position) != null;
    }

    public boolean isTherePieceAt(int row, int col){
        return getPieceAt(row, col) != null;
    }

    public boolean isValidPosition(int row, int col){
        return row >= 0 && row < 8 && col >= 0 && col < 8;//substituir por valores dinamicos mais tarde
    }

    public boolean isValidPosition(Position position){
        return isValidPosition(position.getRow(), position.getColumn());
    }

    public void placeNewPiece(Piece piece, Position position) {

        if(isTherePieceAt(position)){
            throw new BoardException("There is already a piece this position");
        }

        if(!isValidPosition(position)){
            throw new BoardException("Invalid position");
        }

        board[position.getRow()][position.getColumn()] = piece;
    }

    public void placePieceAt(Piece piece, Position targetPosition){
        board[targetPosition.getRow()][targetPosition.getColumn()] = piece;
    }

    public Piece removePieceAt(Position position){
        return removePieceAt(position.getRow(), position.getColumn());
    }

    public Piece removePieceAt(int row, int col){
        if(!isValidPosition(row, col)){
            throw new BoardException("Invalid position");
        }

        Piece piece = getPieceAt(row, col);
        board[row][col] = null;
        return piece;
    }

    public boolean isThereAnOpenPiece(Color currentPlayer, Position position){
        return getPieceAt(position).getColor() != currentPlayer;
    }

    public boolean thereIsAPieceAt(Position position){
        if(!isValidPosition(position)){
            throw new BoardException("Invalid position");
        }

        return getPieceAt(position) != null;
    }

}
