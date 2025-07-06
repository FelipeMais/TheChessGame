package com.chess_game.chess_game_server.dto;

public class MoveResponse {

    private boolean[][] possibleMoves;

    public MoveResponse(boolean[][] possibleMoves) {
        this.possibleMoves = possibleMoves;
    }

    public boolean[][] getPossibleMoves() {
        return possibleMoves;
    }

    public void setPossibleMoves(boolean[][] possibleMoves) {
        this.possibleMoves = possibleMoves;
    }
}

