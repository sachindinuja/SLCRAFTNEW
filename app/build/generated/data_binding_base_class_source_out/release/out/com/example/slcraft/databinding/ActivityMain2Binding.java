// Generated by view binder compiler. Do not edit!
package com.example.slcraft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.slcraft.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Bt2p2;

  @NonNull
  public final Button Bt3p2;

  @NonNull
  public final Button Bt4p2;

  @NonNull
  public final Button Bt5p2;

  @NonNull
  public final Button Bt6p2;

  @NonNull
  public final Button New1;

  @NonNull
  public final TextView Texp2;

  @NonNull
  public final EditText Uinput1p2;

  @NonNull
  public final EditText Uinput2p2;

  @NonNull
  public final EditText Uinput3p2;

  @NonNull
  public final EditText Uinput4p2;

  private ActivityMain2Binding(@NonNull ConstraintLayout rootView, @NonNull Button Bt2p2,
      @NonNull Button Bt3p2, @NonNull Button Bt4p2, @NonNull Button Bt5p2, @NonNull Button Bt6p2,
      @NonNull Button New1, @NonNull TextView Texp2, @NonNull EditText Uinput1p2,
      @NonNull EditText Uinput2p2, @NonNull EditText Uinput3p2, @NonNull EditText Uinput4p2) {
    this.rootView = rootView;
    this.Bt2p2 = Bt2p2;
    this.Bt3p2 = Bt3p2;
    this.Bt4p2 = Bt4p2;
    this.Bt5p2 = Bt5p2;
    this.Bt6p2 = Bt6p2;
    this.New1 = New1;
    this.Texp2 = Texp2;
    this.Uinput1p2 = Uinput1p2;
    this.Uinput2p2 = Uinput2p2;
    this.Uinput3p2 = Uinput3p2;
    this.Uinput4p2 = Uinput4p2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Bt2p2;
      Button Bt2p2 = ViewBindings.findChildViewById(rootView, id);
      if (Bt2p2 == null) {
        break missingId;
      }

      id = R.id.Bt3p2;
      Button Bt3p2 = ViewBindings.findChildViewById(rootView, id);
      if (Bt3p2 == null) {
        break missingId;
      }

      id = R.id.Bt4p2;
      Button Bt4p2 = ViewBindings.findChildViewById(rootView, id);
      if (Bt4p2 == null) {
        break missingId;
      }

      id = R.id.Bt5p2;
      Button Bt5p2 = ViewBindings.findChildViewById(rootView, id);
      if (Bt5p2 == null) {
        break missingId;
      }

      id = R.id.Bt6p2;
      Button Bt6p2 = ViewBindings.findChildViewById(rootView, id);
      if (Bt6p2 == null) {
        break missingId;
      }

      id = R.id.New1;
      Button New1 = ViewBindings.findChildViewById(rootView, id);
      if (New1 == null) {
        break missingId;
      }

      id = R.id.Texp2;
      TextView Texp2 = ViewBindings.findChildViewById(rootView, id);
      if (Texp2 == null) {
        break missingId;
      }

      id = R.id.Uinput1p2;
      EditText Uinput1p2 = ViewBindings.findChildViewById(rootView, id);
      if (Uinput1p2 == null) {
        break missingId;
      }

      id = R.id.Uinput2p2;
      EditText Uinput2p2 = ViewBindings.findChildViewById(rootView, id);
      if (Uinput2p2 == null) {
        break missingId;
      }

      id = R.id.Uinput3p2;
      EditText Uinput3p2 = ViewBindings.findChildViewById(rootView, id);
      if (Uinput3p2 == null) {
        break missingId;
      }

      id = R.id.Uinput4p2;
      EditText Uinput4p2 = ViewBindings.findChildViewById(rootView, id);
      if (Uinput4p2 == null) {
        break missingId;
      }

      return new ActivityMain2Binding((ConstraintLayout) rootView, Bt2p2, Bt3p2, Bt4p2, Bt5p2,
          Bt6p2, New1, Texp2, Uinput1p2, Uinput2p2, Uinput3p2, Uinput4p2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
