package com.chess_game.chess_game_server.dto;

import com.chess_game.chess_game_server.model.ChessPieces.ChessPiece;
import com.chess_game.chess_game_server.model.ChessPieces.Color;
import com.chess_game.chess_game_server.model.Position;

public class PieceResponse {

    String type;
    Color color;
    Position position;

    public PieceResponse(ChessPiece piece) {
        this.type = piece.getName();
        this.color = piece.getColor();
        this.position = piece.getPosition();
    }



}
