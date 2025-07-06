package com.chess_game.chess_game_server.model.ChessPieces;

import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.Moves.IMovement;
import com.chess_game.chess_game_server.model.Position;

import java.util.List;

public abstract class Piece {
    private String name;
    private List<IMovement> moveTypes;
    private Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public Piece(Color color, List<IMovement> moveTypes) {
        this.color = color;
        this.moveTypes = moveTypes;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean[][] getPossibleMoves(Board board, Position position) {
        boolean[][] possibleMoves = new boolean[board.getRows()][board.getColumns()];

        for (IMovement movement : this.moveTypes) {
            movement.possibleMoves(board, position, this, possibleMoves);
        }

        return possibleMoves;
    }
}
