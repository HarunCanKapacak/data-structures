package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// Sette bir eleman sadece bir kere bulunabilir ve cýktýyý sýrayla vermez
		//HashSet in arka planýnda bir hashing algoritmasý calýsýr ve hash tablosuna yerlestirir

		Set<String> set = new HashSet<String>();
		set.add("bir");
		set.add("iki");
		set.add("bir");
		set.add("4");
		

		set.forEach(e -> System.out.println(e));// 4, iki, bir
		System.out.println(set.size()); // size 3 olarak veriyor tekrarlanan deger sayýlmýyor
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String e = itr.next();
			System.out.println("itr geziyor" + e);
			if (e.equals("4"))// iteratorla listeyi gezerken silme islemi gibi islemler yapabiliriz.
				itr.remove();
		}

	}
}
