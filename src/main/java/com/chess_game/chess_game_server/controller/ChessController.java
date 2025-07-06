package com.chess_game.chess_game_server.controller;

import com.chess_game.chess_game_server.dto.MoveResponse;
import com.chess_game.chess_game_server.dto.PieceResponse;
import com.chess_game.chess_game_server.service.ClassicChessGameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChessController {

    ClassicChessGameService chessGameService;
    public ChessController(ClassicChessGameService chessGameService) {
        this.chessGameService = chessGameService;
    }

    @GetMapping("/board")
    public PieceResponse[][] getBoard() {
        return chessGameService.getBoardState().getBoard();
    }

    @PostMapping("/move")
    public String move(@RequestBody String body) {
        System.out.println("Jogada recebida: " + body);
        return "{\"status\": \"Jogada processada com sucesso\"}";
    }

    @GetMapping("/moves")
    public MoveResponse getPiecePossibleMoves(
            @RequestParam int row,
            @RequestParam int column
    ) {
        boolean[][] possibleMoves = chessGameService.getPossibleMoves(row, column);
        return new MoveResponse(possibleMoves);
    }

}