package com.chess_game.chess_game_server.service;

import com.chess_game.chess_game_server.config.GameConfig;
import com.chess_game.chess_game_server.dto.BoardResponse;
import com.chess_game.chess_game_server.exception.BoardException;
import com.chess_game.chess_game_server.model.Board;
import com.chess_game.chess_game_server.model.ChessPieces.Color;
import com.chess_game.chess_game_server.model.ChessPieces.Piece;
import com.chess_game.chess_game_server.model.ChessPieces.Rook;
import com.chess_game.chess_game_server.model.Position;
import org.springframework.stereotype.Service;

@Service
public class ClassicChessGameService {

    private GameConfig config;
    private Board board;

    public ClassicChessGameService() {
        this.board = new Board(8, 8);
        initialTestSetup();
    }


    public BoardResponse getBoardState() {
        return new BoardResponse(board);
    }

    public boolean[][] getPossibleMoves(int row, int col) {
        Piece piece = board.getPieceAt(row, col);
        if(piece == null) {
            throw new BoardException("No piece at row " + row + " and col " + col);
        }
        return piece.getPossibleMoves(board, new Position(row, col));
    }

    public Piece performChessMove(Position source, Position target) {
        Piece capturedPiece = makeMove(source, target);
        if(capturedPiece != null) {

        }

        return capturedPiece;

    }

    private Piece makeMove(Position source, Position target) {
        Piece capturedPiece = board.removePieceAt(target);
        Piece movedPiece = board.getPieceAt(source);
        board.placePieceAt(movedPiece, source);


        return capturedPiece;
    }

    private void initialTestSetup(){
        board.placeNewPiece(new Rook(Color.WHITE), new Position(0, 0));
        board.placeNewPiece(new Rook(Color.WHITE), new Position(1, 2));
        board.placeNewPiece(new Rook(Color.WHITE), new Position(1, 3));
        board.placeNewPiece(new Rook(Color.WHITE), new Position(1, 4));
    }
}
