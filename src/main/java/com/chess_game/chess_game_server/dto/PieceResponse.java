package com.chess_game.chess_game_server.dto;

import com.chess_game.chess_game_server.model.ChessPieces.Piece;
import com.chess_game.chess_game_server.model.ChessPieces.Color;
import com.chess_game.chess_game_server.model.Position;

public class PieceResponse {

    String type;
    Color color;

    public PieceResponse(Piece piece) {
        this.type = piece.getClass().getSimpleName();
        this.color = piece.getColor();
    }

    public Color getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
