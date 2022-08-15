package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		// FIFO: Firs in firs out seklinde calýsýr.
		// add ---- offer : ekleme isi yapar ama add methodu exception fýrlatabilir
		// offer fýrlatmaz.
		// remove ----- poll: silme isi yapar ama remove methodu exception fýrlatabilir
		// poll null döner.
		// element ----- peek:ilk elemaný getirir ama element methodu exception
		// fýrlatabilir peek null döner.

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