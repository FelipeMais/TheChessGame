package com.chess_game.chess_game_server.service;

import com.chess_game.chess_game_server.config.GameConfig;
import com.chess_game.chess_game_server.dto.BoardResponse;
import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.ChessPieces.Color;
import org.springframework.stereotype.Service;

@Service
public class ChessGameService {

    private GameConfig config;
    private Board board;
    private Color currentColor;

    public  ChessGameService() {
        this.board = new Board();

    }


    public BoardResponse getBoardState() {
        return new BoardResponse(board);
    }
}
