package com.chess_game.chess_game_server.model.Moves;

import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.ChessPieces.Piece;
import com.chess_game.chess_game_server.model.Position;

public interface IMovement {
    public boolean[][] possibleMoves(Board board, Position position, Piece piece, boolean[][] moves);
}
