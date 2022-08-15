package map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {

	Map<Integer, Citys> map = new HashMap<>();
	map.put(34, new Citys("istanbul"));
	map.put(01, new Citys("adana"));
	map.put(06, new Citys("ankara"));
	map.put(05, new Citys("antalya"));
	map.replace(07, new Citys("antalya"));//replace methodu ile var olan bir veriyi  degistirebiliriz.
	//put ilede ayný islem yapilabilir ama aradaki fark put bu veri yok ise ekler.
	
	System.out.println(map);//{1=[plakali sehir:adana], 34=[plakali sehir:istanbul], 5=[plakali sehir:antalya], 6=[plakali sehir:ankara]}
	System.out.println(map.get(34));//[plakali sehir:istanbul]
	System.out.println(map.containsKey(06));//true
	System.out.println(map.keySet());//[1, 34, 5, 6]
	System.out.println(map.entrySet());//[1=[plakali sehir:adana], 34=[plakali sehir:istanbul], 5=[plakali sehir:antalya], 6=[plakali sehir:ankara]]
	System.out.println(map.values());//[[plakalý sehir:adana], [plakalý sehir:istanbul], [plakalý sehir:antalya], [plakalý sehir:ankara]]

	map.entrySet().forEach(e -> System.out.println(e));
}

}
