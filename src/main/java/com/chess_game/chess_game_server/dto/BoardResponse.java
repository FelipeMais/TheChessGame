package com.chess_game.chess_game_server.dto;

import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.ChessPieces.ChessPiece;

public class BoardResponse {

    private PieceResponse[][] board;

    public BoardResponse(Board board) {
        this.board = new PieceResponse[8][8];
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                this.board[x][y] = null;
                ChessPiece piece = board.getPieceAt(x, y);
                if(piece != null){
                    this.board[x][y] = new PieceResponse(piece);
                }
            }
        }
    }

    public PieceResponse[][] getBoard() {
        return board;
    }
}
