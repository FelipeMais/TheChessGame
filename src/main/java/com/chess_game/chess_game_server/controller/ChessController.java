package com.chess_game.chess_game_server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChessController {

    @GetMapping("/board")
    public String getBoard() {
        return "{\"board\": \"estado do tabuleiro\"}";
    }

    @PostMapping("/move")
    public String move(@RequestBody String body) {
        System.out.println("Jogada recebida: " + body);
        return "{\"status\": \"Jogada processada com sucesso\"}";
    }
}