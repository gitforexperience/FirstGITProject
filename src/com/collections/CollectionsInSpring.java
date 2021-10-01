package com.collections;
import java.util.*;

public class CollectionsInSpring {

	private  ArrayList fruits;
	private  Set cricketers;
	private  Map CountriesCaptials;

	public CollectionsInSpring(){}
	
 

	public CollectionsInSpring(ArrayList fruits, Set cricketers, Map countriesCaptials) {
		super();
		this.fruits = fruits;
		this.cricketers = cricketers;
		CountriesCaptials = countriesCaptials;
	}



	public Set getCricketers() {
		return cricketers;
	}



	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}



	public Map getCountriesCaptials() {
		return CountriesCaptials;
	}



	public void setCountriesCaptials(Map countriesCaptials) {
		CountriesCaptials = countriesCaptials;
	}



	public ArrayList getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList fruits) {
		this.fruits = fruits;
	}
	
	
 
	
	
}
