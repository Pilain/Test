package com.androidhive.model.transactionBancaire;

import java.util.Date;

public abstract class ITransaction  {
	
	public String getEmeteur() {
		return emeteur;
	}
	public void setEmeteur(String emeteur) {
		this.emeteur = emeteur;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public double getLeMontant() {
		return leMontant;
	}
	public void setLeMontant(double leMontant) {
		this.leMontant = leMontant;
	}
	public String getLeMotif() {
		return leMotif;
	}
	public void setLeMotif(String leMotif) {
		this.leMotif = leMotif;
	}
	public String getLaDate() {
		return laDate;
	}
	public void setLaDate(String laDate) {
		this.laDate = laDate;
	}
	
	private String emeteur;
	private String destinataire;
	private double leMontant;
	private String leMotif;
	private String laDate;
	
	public String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}

	private String type;


}
