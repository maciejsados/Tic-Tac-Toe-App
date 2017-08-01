package com.example.rent.tictactoe.presenter;

import android.content.Context;
import android.os.Vibrator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.rent.tictactoe.GameActivity.GameActivity;
import com.example.rent.tictactoe.GameContract;
import com.example.rent.tictactoe.R;


public class GamePresenter implements GameContract.GamePresenter {

    private GameContract.GameView gameView;

    private boolean currentPlayer; // false = gracz X, true == gracz O

    private boolean gameFinished;

    private Boolean[] fieldValues;


    private int[][] winStates = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}
    };


    public GamePresenter(GameContract.GameView gameView) {
        this.gameView = gameView;
        onNewGame();
    }


    @Override
    public void onNewGame() {
        gameFinished = false;
        fieldValues = new Boolean[9];
        currentPlayer = false;
        gameView.fillBoardViews(fieldValues);
        gameView.showPlayerRoundMessage(currentPlayer);

    }









    @Override
    public void onBoardFieldClick(int field) {
        if (fieldValues[field] != null || gameFinished) {
            return;
        }

        fieldValues[field] = currentPlayer;
        gameView.fillBoardViews(fieldValues);

        if (getWinner() != null) {
            gameView.showPlayerWinMessage(currentPlayer);
            gameFinished = true;
        } else if (allFieldsIsFilled()) {
            gameView.showDrawMessage();
        } else {
            currentPlayer = !currentPlayer;
            gameView.showPlayerRoundMessage(currentPlayer);
        }
    }


    public Boolean getWinner() {
        for (int[] win : winStates) {
            if (fieldValues[win[0]] == null || fieldValues[win[1]] == null || fieldValues[win[2]] == null) {
                continue;
            }

            if (fieldValues[win[0]].equals(fieldValues[win[1]]) && fieldValues[win[0]].equals(fieldValues[win[2]])) {
                return fieldValues[win[0]];

            }
        }

        return null;
    }

    private boolean allFieldsIsFilled() {
        for (Boolean b : fieldValues) {
            if (b == null) {
                return false;
            }
        }

        return true;
    }
}
