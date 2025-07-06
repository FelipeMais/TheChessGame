package com.chess_game.chess_game_server.model.Moves;

import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.ChessPieces.Piece;
import com.chess_game.chess_game_server.model.Position;

public class StraightLineMovement implements IMovement {

    @Override
    public boolean[][] possibleMoves(Board board, Position position, Piece piece, boolean[][] moves) {

        Position p = new Position(0, 0);

        p.setValues(position.getRow() - 1, position.getColumn());
        while (board.isValidPosition(p) && !board.thereIsAPieceAt(p)) {
            moves[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (board.isValidPosition(p) && board.isThereAnOpenPiece(piece.getColor(), p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        //À esquerda da peça
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (board.isValidPosition(p) && !board.thereIsAPieceAt(p)) {
            moves[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (board.isValidPosition(p) && board.isThereAnOpenPiece(piece.getColor(), p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        //À direita da peça
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (board.isValidPosition(p) && !board.thereIsAPieceAt(p)) {
            moves[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (board.isValidPosition(p) && board.isThereAnOpenPiece(piece.getColor(), p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }

        //Abaixo da Peça
        p.setValues(position.getRow() + 1, position.getColumn());
        while (board.isValidPosition(p) && !board.thereIsAPieceAt(p)) {
            moves[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (board.isValidPosition(p) && board.isThereAnOpenPiece(piece.getColor(), p)) {
            moves[p.getRow()][p.getColumn()] = true;
        }
        return moves;
    }
}
