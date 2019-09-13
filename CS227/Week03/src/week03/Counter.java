package week03;

public class Counter {
private int currentCount;

public Counter() {
	currentCount = 0;
}
public void count() {
	currentCount ++;
	
}
public int getCount() {
	return currentCount;
}
public void resetCount() {
	currentCount = 0;
}
public void undoCount() {
	currentCount --;
}
}
