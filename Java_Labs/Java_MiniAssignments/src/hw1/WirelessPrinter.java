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
	
	private int currentPages1;
	
	private int currentPages2;
	
	private double inkLevel_1;
	
	private double inkLevel_2;
	
	private int pagesPrinted;
	
	private int totalPaperUsed;
	
	
	public WirelessPrinter() {
		connection = false;
		power = false;
		currentPages1 = currentPages2 = 0;
		inkLevel_1 = inkLevel_2 = 0.5;
		pagesPrinted = 0;
		totalPaperUsed = 0;
		
		
	}
	public WirelessPrinter(double ink, int paper) {
		connection = false;
		power = false;
		currentPages1 = currentPages2 = Math.min(Math.max(paper, 0),500);
		inkLevel_1 = inkLevel_2 = Math.max(Math.min(ink, 1.0),0);
		pagesPrinted = 0;
		totalPaperUsed = 0;
		
		
	}
	
	
	
	
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
		/*
		Double cP1 = new Double(currentPages1);
		Double TC = new Double(TRAY_CAPACITY);
		double prop = cP1/TC;
		prop = prop *100;
		return (int) prop;
		*/
		int cP1 = currentPages1*100;
		int TC = TRAY_CAPACITY;
		int prop = cP1/TC;
		return prop;
		
	}
	
	/**
	 * 
	 * @return currentPages
	 */
	
	public int getPaperLevelExact() {
		return currentPages1;
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
		currentPages1 += pages;
		currentPages1 = Math.min(500, currentPages1);
		currentPages1 = Math.max(0, currentPages1);
	}
	
	/**
	 * print(int pages)
	 * currentPages -= pages
	 * inkLevel -= pages * .001
	 * pagesPrinted += pages
	 * 
	 */
	public void print(int pages) {
		if (connection == false) {
			return;
		}
		else {
			currentPages2 = currentPages1 - pages;
			currentPages2 = Math.max(0,currentPages2);
			totalPaperUsed += currentPages1 - currentPages2;
			inkLevel_2 = Math.max(inkLevel_1-pages*.001,0);
			pagesPrinted += (inkLevel_1 - inkLevel_2)*1000;
			currentPages1 = currentPages2;
			inkLevel_1 = inkLevel_2;
		}
		
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
