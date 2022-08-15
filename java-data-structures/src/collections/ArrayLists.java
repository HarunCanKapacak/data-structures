package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		int arr[] = new int[3]; // Arraylerde boyutu yaratırken verdigimiz icin cok kullanisli degildir
		arr[2] = 12;
		arr[0] = arr[2];
        //[12] [] [12] Array bu islemi yaparken big o notasyonuna gore o(1)lik bir islem yapar oldukca hızlıdır
		
		
		/*Arraylist bizim icin default olarak 10 boyutlu bir array olusturur ve bu array doldugunda
	     onceki array imizin boyutunun 2 kat uzunlugunda bir array olusturur ve 
		onceki arraydeki butun elemanları bu arraye tasır bu islem o(n) dir (n eleman sayısı)*/
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(5);
		arr1.add(3);
	    arr1.add(8);
	    
	    System.out.println(arr1.size());//3
	    System.out.println(arr1.contains(5));//true
	    System.out.println(arr1.get(2));//8
	    System.out.println(arr1.indexOf(3));//1 (3 elemanının kacinci indexte tutuldugunu soyler)
	    System.out.println(arr1.subList(0, 2));//[5, 3]
	
	
	}
}
