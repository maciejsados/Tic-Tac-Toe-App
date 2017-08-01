package com.example.rent.tictactoe;



public interface GameContract {

    interface GameView {
        void fillBoardViews(Boolean[] fieldValues);
        void showPlayerRoundMessage(boolean player);
        void showPlayerWinMessage(boolean player);
        void showDrawMessage();
    }

    interface GamePresenter {
        void onBoardFieldClick(int field);
        void onNewGame();
    }
}

