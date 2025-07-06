package com.chess_game.chess_game_server.controller;

import com.chess_game.chess_game_server.dto.BoardResponse;
import com.chess_game.chess_game_server.model.ChessPieces.ChessPiece;
import com.chess_game.chess_game_server.service.ChessGameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChessController {

    ChessGameService chessGameService;
    public ChessController(ChessGameService chessGameService) {
        this.chessGameService = chessGameService;
    }

    @GetMapping("/board")
    public BoardResponse getBoard() {
        return chessGameService.getBoardState();
    }

    @PostMapping("/move")
    public String move(@RequestBody String body) {
        System.out.println("Jogada recebida: " + body);
        return "{\"status\": \"Jogada processada com sucesso\"}";
    }
}