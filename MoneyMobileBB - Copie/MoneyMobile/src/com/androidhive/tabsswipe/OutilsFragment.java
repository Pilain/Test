package com.androidhive.tabsswipe;


import java.util.HashMap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidhive.model.utilisateur.SessionManager;
import com.androidhive.sessions.AlertDialogManager;
import com.androidhive.sessions.R;

public class OutilsFragment extends Fragment {

	AlertDialogManager alert = new AlertDialogManager();

	// Session Manager Class
	SessionManager session;

	// Button Logout
	Button btnLogout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_outils, container, false);


		return rootView;
	}
}
