package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		// FIFO: Firs in firs out seklinde cal�s�r.
		// add ---- offer : ekleme isi yapar ama add methodu exception f�rlatabilir
		// offer f�rlatmaz.
		// remove ----- poll: silme isi yapar ama remove methodu exception f�rlatabilir
		// poll null d�ner.
		// element ----- peek:ilk eleman� getirir ama element methodu exception
		// f�rlatabilir peek null d�ner.

		Queue<String> kuyruk = new LinkedList<>();

		kuyruk.offer("harun");
		kuyruk.offer("erol");
		kuyruk.offer("yusuf");

		System.out.println(kuyruk.peek());// harun
		System.out.println(kuyruk.poll());// harun (silindi)
		System.out.println(kuyruk.size());// 2
		System.out.println(kuyruk.peek());// erol peek oldu
	}
}