// Generated code from Butter Knife. Do not modify!
package com.example.rent.tictactoe.GameActivity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.rent.tictactoe.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameActivity_ViewBinding<T extends GameActivity> implements Unbinder {
  protected T target;

  private View view2131427423;

  private View view2131427414;

  private View view2131427415;

  private View view2131427416;

  private View view2131427417;

  private View view2131427418;

  private View view2131427419;

  private View view2131427420;

  private View view2131427421;

  private View view2131427422;

  @UiThread
  public GameActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.messageText = Utils.findRequiredViewAsType(source, R.id.message, "field 'messageText'", TextView.class);
    target.board = Utils.findRequiredViewAsType(source, R.id.board, "field 'board'", ViewGroup.class);
    view = Utils.findRequiredView(source, R.id.button, "field 'button' and method 'startNewGame'");
    target.button = Utils.castView(view, R.id.button, "field 'button'", ImageView.class);
    view2131427423 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startNewGame();
      }
    });
    view = Utils.findRequiredView(source, R.id.one, "method 'onFieldClick'");
    view2131427414 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.two, "method 'onFieldClick'");
    view2131427415 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.three, "method 'onFieldClick'");
    view2131427416 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.four, "method 'onFieldClick'");
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.five, "method 'onFieldClick'");
    view2131427418 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.six, "method 'onFieldClick'");
    view2131427419 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.seven, "method 'onFieldClick'");
    view2131427420 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.eight, "method 'onFieldClick'");
    view2131427421 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.nine, "method 'onFieldClick'");
    view2131427422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFieldClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.messageText = null;
    target.board = null;
    target.button = null;

    view2131427423.setOnClickListener(null);
    view2131427423 = null;
    view2131427414.setOnClickListener(null);
    view2131427414 = null;
    view2131427415.setOnClickListener(null);
    view2131427415 = null;
    view2131427416.setOnClickListener(null);
    view2131427416 = null;
    view2131427417.setOnClickListener(null);
    view2131427417 = null;
    view2131427418.setOnClickListener(null);
    view2131427418 = null;
    view2131427419.setOnClickListener(null);
    view2131427419 = null;
    view2131427420.setOnClickListener(null);
    view2131427420 = null;
    view2131427421.setOnClickListener(null);
    view2131427421 = null;
    view2131427422.setOnClickListener(null);
    view2131427422 = null;

    this.target = null;
  }
}
