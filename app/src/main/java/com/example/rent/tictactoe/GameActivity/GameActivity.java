package com.example.rent.tictactoe.GameActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rent.tictactoe.GameContract;
import com.example.rent.tictactoe.R;
import com.example.rent.tictactoe.presenter.GamePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameActivity extends AppCompatActivity implements GameContract.GameView {

    @BindView(R.id.message)
    TextView messageText;

    @BindView(R.id.board)
    ViewGroup board;

    @BindView(R.id.button)
    ImageView button;

    private GamePresenter gamePresenter;

    Vibrator vibrator;

    Animation rotation;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gamePresenter = new GamePresenter(this);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Override
    public void fillBoardViews(Boolean[] values) {
        for (int i = 0; i < values.length; i++) {
            String tagToFind = String.valueOf(i);
            TextView field = (TextView) board.findViewWithTag(tagToFind);
            String playerName = getPlayerName(values[i]);
            field.setText(playerName);
        }
    }

    @Override
    public void showPlayerRoundMessage(boolean player) {
        String playerName = getPlayerName(player);
        String message = getString(R.string.player_turn_info, playerName);
        int textColor = ContextCompat.getColor(this, R.color.colorPrimary);
        messageText.setTextColor(textColor);
        messageText.setText(message);




    }


    @Override
    public void showPlayerWinMessage(boolean player) {
        String playerName = getPlayerName(player);
        String message = getString(R.string.player_win_message, playerName);
        int textColor = ContextCompat.getColor(this, R.color.colorWin);
        messageText.setTextColor(textColor);
        messageText.setText(message);
        rotation = AnimationUtils.loadAnimation(GameActivity.this, R.anim.animation);
        messageText.startAnimation(rotation);



    }



    @Override
    public void showDrawMessage() {
        int textColor = ContextCompat.getColor(this, R.color.colorWin);
        messageText.setTextColor(textColor);
        messageText.setText(R.string.player_draw_message);
    }

    @OnClick({R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine})
    public void onFieldClick(View view) {
        String tag = view.getTag().toString();
        int fieldNumber = Integer.parseInt(tag);
        gamePresenter.onBoardFieldClick(fieldNumber);
        vibrator.vibrate(300);
    }

    @OnClick(R.id.button)
    public void startNewGame() {
        gamePresenter.onNewGame();
        messageText.clearAnimation();





    }


    private String getPlayerName(Boolean value) {
        if (value == null) {
            return "";
        }

        return value ? getString(R.string.player_1) : getString(R.string.player_0);
    }




}

