package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
	
public static void main(String[] args) {
	//Arraylist gibi dolma durumu yok cunku memoryde yer ayrýlmýyor.
		//yeni eleman ekleme O(1).
		//LinkedList in bir elemaný 3 bilgi tutar element next and previous.
		//nekadar eleman eklenecegi bilinmediginde veya cok eleman eklenme durumlarýnda kullanýlabilir.
		//linked listte bir head bilgisi vardýr ve gitmek istediginiz elemana ordan next next yaparak ulasýr
		//bu yuzden N elemanlý bir listede bulma islemi yapmak O(N).
		
		LinkedList<String> ldList = new LinkedList<String>();
		// [prev  element next]--------->  <-----------[prev element next] --------->  <-----------[prev element next]
		
		ldList.addFirst("ayse");
		ldList.add("harun");
		ldList.add("erol");
		ldList.add("yusuf");
		ldList.addLast("xxx");
		
		System.out.println(ldList);
		//[ayse, harun, erol, yusuf, xxx]
		
		ListIterator<String> itr = ldList.listIterator();
		
		
			while(itr.hasNext()) {
				System.out.print(itr.next()+",");
				//ayse,harun,erol,yusuf,xxx
			}
		while (itr.hasPrevious()) {
			System.out.print(itr.previous()+",");
			//xxx,yusuf,erol,harun,ayse
		}
			
		
	}
}	























