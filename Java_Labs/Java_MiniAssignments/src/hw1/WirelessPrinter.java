package hw1;
import java.lang.Math; 
public class WirelessPrinter {
	/*
	 * Variables needed:
	 * boolean connection
	 * integer currentPages <=500
	 * double inkLevel 0.0 <= iL <= 1.0
	 * integer pagesPrinted (increment every time we print when IL != 0)
	 * integer totalPagesPrinted (increment every time we print)
	 * boolean power (if on power == true)
	 * 
	 * 
	 */
	public static final int PAGES_PER_CARTRIDGE = 1000;
	
	public static final int TRAY_CAPACITY = 500;
	
	public static final double NEW_CARTRIDGE_INK_LEVEL = 1.0;
	
	
	private boolean connection;
	
	private boolean power;
	
	private int currentPages;
	
	private double inkLevel_1;
	
	private double inkLevel_2;
	
	private int pagesPrinted;
	
	private int totalPaperUsed;
	
	
	
	/**
	 * Sets connection variable to true
	 */
	public void connect() {
		connection = true;
		
	}
	/**
	 * Sets connection variable to false
	 */
	public void disconnect() {
		connection = false;
	}
	
	/**
	 * return ink level variable
	 */
	
	public double getInkLevel() {
		return inkLevel_1;
	}
	
	/**
	 * return rounded paper percentage
	 * out of max paper
	 * @return currentPages/TRAY_Capacity
	 */
	
	public int getPaperLevel() {
		return (int) Math.floor((currentPages/TRAY_CAPACITY)*100);
	}
	
	/**
	 * 
	 * @return currentPages
	 */
	
	public int getPaperLevelExact() {
		return currentPages;
	}
	
	/**
	 * need to create pages printed
	 */
	
	
	public int getTotalPagesPrinted() {
		return pagesPrinted;
		
	}
	
	
	public int getTotalPaperUsed() {
		return totalPaperUsed;
	}
	
	/**
	 * return boolean connection value
	 */
	
	public boolean isConnected() {
		return connection;
	}
	
	/**
	 * return boolean power status
	 */
	public boolean isOn() {
		return power;
	}
	
	/**
	 * load Paper(int)
	 * currentPages += int
	 * 
	 * 0 <= currentPages <= 500
	 */
	public void loadPaper(int pages) {
		currentPages = currentPages += pages;
		currentPages = Math.min(500, currentPages);
		currentPages = Math.max(0, currentPages);
	}
	
	/**
	 * print(int pages)
	 * currentPages -= pages
	 * inkLevel -= pages * .001
	 * pagesPrinted += pages
	 * 
	 */
	public void print(int pages) {
		
		
		
		
	}
	
	public void replaceCartridge() {
		inkLevel_1 = inkLevel_2 = NEW_CARTRIDGE_INK_LEVEL;
	}
	
	public void turnOff() {
		power = false;
		connection = false;
	}
	
	public void turnOn() {
		power = true;
		connection = true;
	}
}
