// Generated by view binder compiler. Do not edit!
package com.example.mypa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.mypa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CalendarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addEvent;

  @NonNull
  public final FloatingActionButton btnEvents;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final EditText createEvent;

  @NonNull
  public final ImageView goBack;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout popUp;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RecyclerView rvCalendar;

  @NonNull
  public final TextView theDate;

  @NonNull
  public final TextView txtCalendar;

  @NonNull
  public final TextView txtSave;

  private CalendarBinding(@NonNull ConstraintLayout rootView, @NonNull Button addEvent,
      @NonNull FloatingActionButton btnEvents, @NonNull CalendarView calendarView,
      @NonNull EditText createEvent, @NonNull ImageView goBack, @NonNull ImageView imageView,
      @NonNull ConstraintLayout popUp, @NonNull RelativeLayout relativeLayout,
      @NonNull RecyclerView rvCalendar, @NonNull TextView theDate, @NonNull TextView txtCalendar,
      @NonNull TextView txtSave) {
    this.rootView = rootView;
    this.addEvent = addEvent;
    this.btnEvents = btnEvents;
    this.calendarView = calendarView;
    this.createEvent = createEvent;
    this.goBack = goBack;
    this.imageView = imageView;
    this.popUp = popUp;
    this.relativeLayout = relativeLayout;
    this.rvCalendar = rvCalendar;
    this.theDate = theDate;
    this.txtCalendar = txtCalendar;
    this.txtSave = txtSave;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addEvent;
      Button addEvent = rootView.findViewById(id);
      if (addEvent == null) {
        break missingId;
      }

      id = R.id.btnEvents;
      FloatingActionButton btnEvents = rootView.findViewById(id);
      if (btnEvents == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = rootView.findViewById(id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.createEvent;
      EditText createEvent = rootView.findViewById(id);
      if (createEvent == null) {
        break missingId;
      }

      id = R.id.goBack;
      ImageView goBack = rootView.findViewById(id);
      if (goBack == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.popUp;
      ConstraintLayout popUp = rootView.findViewById(id);
      if (popUp == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = rootView.findViewById(id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.rvCalendar;
      RecyclerView rvCalendar = rootView.findViewById(id);
      if (rvCalendar == null) {
        break missingId;
      }

      id = R.id.theDate;
      TextView theDate = rootView.findViewById(id);
      if (theDate == null) {
        break missingId;
      }

      id = R.id.txtCalendar;
      TextView txtCalendar = rootView.findViewById(id);
      if (txtCalendar == null) {
        break missingId;
      }

      id = R.id.txtSave;
      TextView txtSave = rootView.findViewById(id);
      if (txtSave == null) {
        break missingId;
      }

      return new CalendarBinding((ConstraintLayout) rootView, addEvent, btnEvents, calendarView,
          createEvent, goBack, imageView, popUp, relativeLayout, rvCalendar, theDate, txtCalendar,
          txtSave);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
