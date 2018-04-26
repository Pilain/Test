package com.androidhive.tabsswipe;


import java.util.Date;
import java.util.HashMap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidhive.model.transactionBancaire.Credit;
import com.androidhive.model.transactionBancaire.TransactionList;
import com.androidhive.model.utilisateur.SessionManager;
import com.androidhive.sessions.AlertDialogManager;
import com.androidhive.sessions.R;

public class ActiviteFragment extends Fragment {

	AlertDialogManager alert = new AlertDialogManager();

	// Session Manager Class
	SessionManager session;

	// Button Logout
	Button btnLogout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_activite, container, false);



		session = new SessionManager(rootView.getContext());

		TextView lblName = (TextView) rootView.findViewById(R.id.lblName);
		TextView lblEmail = (TextView) rootView.findViewById(R.id.lblEmail);

		// Button logout
		btnLogout = (Button) rootView.findViewById(R.id.btnLogout);

		Toast.makeText(rootView.getContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();


		/**
		 * Call this function whenever you want to check user login
		 * This will redirect user to LoginActivity is he is not
		 * logged in
		 * */
		session.checkLogin();

		// get user data from session
		HashMap<String, String> user = session.getUserDetails();

		// name
		String name = user.get(SessionManager.KEY_NAME);

		// email
		String email = user.get(SessionManager.KEY_EMAIL);


		
		
		
		// displaying user data
		lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
		lblEmail.setText(Html.fromHtml("Email: <b>" + email + "</b>"));


		/**
		 * Logout button click event
		 * */
		btnLogout.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Clear the session data
				// This will clear all session data and 
				// redirect user to LoginActivity
				session.logoutUser();
			}
		});


		return rootView;
	}
}
