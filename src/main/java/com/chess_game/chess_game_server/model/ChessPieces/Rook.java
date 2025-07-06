package com.chess_game.chess_game_server.model.ChessPieces;

import com.chess_game.chess_game_server.model.Moves.StraightLineMovement;
import com.chess_game.chess_game_server.model.Position;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, List.of(new StraightLineMovement()));
    }
}
