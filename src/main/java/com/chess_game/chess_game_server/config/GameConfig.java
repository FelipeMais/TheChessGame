package com.chess_game.chess_game_server.config;

public class GameConfig {

    int boardSize;


    public GameConfig(){
        this.boardSize = 8;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }


}
