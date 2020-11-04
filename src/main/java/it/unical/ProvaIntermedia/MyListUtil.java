package it.unical.ProvaIntermedia;

import java.util.ArrayList;
import java.util.Collections;

public class MyListUtil {
	
	public ArrayList<Integer> ordineCrescente(ArrayList<Integer> array){
		Collections.sort(array);
		return array;
	}
	
	public ArrayList<Integer> ordineDecrescente(ArrayList<Integer> array){
		Collections.sort(array);
		Collections.reverse(array);
		return array;
	}
}
