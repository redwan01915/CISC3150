//REDWAN AHMED
//CISC3150 HW10

//Reference

//https://docs.oracle.com/javase/tutorial/essential/concurrency/
//https://stackoverflow.com/questions/45733756/java-threads-how-to-print-alphabets-and-numbers-using-two-threads-one-at-a-time
//https://www.programiz.com/java-programming/examples/display-alphabets
//https://www.programmingsimplified.com/java/source-code/java-program-print-alphabets
// https://www.java-forums.org/threads-synchronization/63898-print-alternate-char-using-two-threads.html
// https://coderanch.com/t/435285/java/printing-letters-loop
// http://www.techcrashcourse.com/2017/02/java-program-to-print-ascii-value-of-characters.html
// https://www.quora.com/How-do-you-write-a-multithreaded-program-where-the-first-thread-prints-are-an-odd-no-and-the-second-thread-prints-are-an-even-no-alternatively



import java.util.*;

public class CISC3150HW10 {

	public static void main(String[] args) {
		int number_of_Threads = 4;
		Thread[] threads = new Thread[number_of_Threads];
		Task[]  tasks  = new Task[number_of_Threads];
		This_is_Counter m = new This_is_Counter('A');

		tasks[0] = new Task("AEIMQUY".toCharArray(), m);
		tasks[1] = new Task("BFJNRVZ".toCharArray(), m);
		tasks[2] = new Task("CGKOSW".toCharArray(), m);
		tasks[3] = new Task("DHLPTX".toCharArray(), m);

		for (int n = 0; n < number_of_Threads; n++) {
			threads[n] = new Thread(tasks[n]);
			threads[n].start();
		}
		for (int n = 0; n < number_of_Threads; n++) {
			try {
				threads[n].join();
			} catch (InterruptedException e) {
				System.out.println("The threads are Interrupted.");
				System.exit(1);
			}
		}
		System.out.println();
	}
}

class Task implements Runnable {
	char[] values;
	int This_is_position;
	This_is_Counter counter;

	Task(char[] values, This_is_Counter m) {
		this.counter = m;
		this.values = values;
		this.This_is_position = 0;
	}

	@Override
	public void run() {
		while (this.This_is_position< this.values.length) {
			if (this.counter.getNext() >= this.values[this.This_is_position]) {
				this.counter.printIncremented(this.values[this.This_is_position++]);
			}
		}
	}
}

class This_is_Counter {
	char next_value;
	This_is_Counter(char start) {
		this.next_value = start;
	}

	char getNext() {
		return this.next_value;
	}

	synchronized void printIncremented(char value) {
		System.out.print(value);
		while (value >= this.next_value)
			this.next_value++;
	}
}
