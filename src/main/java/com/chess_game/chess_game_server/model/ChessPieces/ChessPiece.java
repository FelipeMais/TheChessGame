package com.chess_game.chess_game_server.model.ChessPieces;

import com.chess_game.chess_game_server.model.Position;

public abstract class ChessPiece {
    private String name;
    private Color color;
    private Position position;

    public ChessPiece(String name, Color color, Position position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
