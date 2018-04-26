package com.androidhive.tabsswipe;


import java.util.Date;
import java.util.Random;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.androidhive.model.transactionBancaire.Credit;
import com.androidhive.model.transactionBancaire.TransactionList;
import com.androidhive.sessions.R;

public class PaiementFragment extends Fragment { 

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_paiement, container, false);



			TransactionList maListDeTransaction = new TransactionList();
			/***
			 * DEMANDE AU SERVEUR LA LISTE DES CREDIT ...?????
			 */
			for(int i=0;i<3;i++){
			Credit monCredit = new Credit();
			monCredit.setDestinataire("Alexandre "+Integer.valueOf(new Random().nextInt()));
			monCredit.setEmeteur("Raphael");
			monCredit.setLaDate(new Date().toLocaleString());
			monCredit.setLeMontant(100.555);
			monCredit.setLeMotif("un example");
			
			maListDeTransaction.getListDesTransaction().add(monCredit);
			}
		
			
			
			 String[] listeStrings = new String[maListDeTransaction.getListDesTransaction().size()] ;
			for(int i=0; i<maListDeTransaction.getListDesTransaction().size();i++){
				String resultDestinataire =  maListDeTransaction.getListDesTransaction().get(i).getDestinataire();
				
				//Log.d("test",resultDestinataire );
				
				listeStrings[i] = resultDestinataire;
			}


			
			 ListView list=(ListView)rootView.findViewById(R.id.list);
			  
			

			 list.setAdapter(new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1,listeStrings));

		
		return rootView;
	}

}
