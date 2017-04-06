package Koleksiyonlar;

import java.util.Comparator;

public class ismeGoreSirala implements Comparator<Ogrenci> {

	@Override
	public int compare(Ogrenci o1, Ogrenci o2) {
		return  new String(o1.getIsim()).compareTo(o2.getIsim());
	}
	
}
