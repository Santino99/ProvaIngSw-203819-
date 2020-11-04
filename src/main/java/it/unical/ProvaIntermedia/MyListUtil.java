package it.unical.ProvaIntermedia;

import java.util.Collections;
import java.util.List;

public class MyListUtil {
	
	public List<Integer> ordineCrescente(List<Integer> array){
		Collections.sort(array);
		return array;
	}
	
	public List<Integer> ordineDecrescente(List<Integer> array){
		Collections.sort(array);
		Collections.reverse(array);
		return array;
	}
}
