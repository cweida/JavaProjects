package hw1;

public class WirelessPrinterTest {

	public static void main(String[] args) {
		/*
		WirelessPrinter printer1 = new WirelessPrinter();
		System.out.println("Is connected? " + printer1.isConnected());
		System.out.println("Is on? " + printer1.isOn());
		printer1.turnOn();
		System.out.println("Is connected? " + printer1.isConnected());
		System.out.println("Is on? " + printer1.isOn());
		System.out.println("How much ink? "+ printer1.getInkLevel());
		System.out.println("How many pages in tray? "+ printer1.getPaperLevelExact());
		printer1.loadPaper(600);
		System.out.println("How many pages in tray? "+ printer1.getPaperLevelExact());
		printer1.print(250);
		System.out.println("How much ink? "+ printer1.getInkLevel());
		System.out.println("How many pages in tray? "+ printer1.getPaperLevelExact());
		printer1.print(260);
		System.out.println("How much ink? "+ printer1.getInkLevel());
		System.out.println("How many pages in tray? "+ printer1.getPaperLevelExact());
		System.out.println("Total pages used with ink?" + printer1.getTotalPagesPrinted());
		System.out.println("Total paper used?" + printer1.getTotalPaperUsed());
		printer1.loadPaper(500);
		printer1.print(220);
		System.out.println("How much ink? "+ printer1.getInkLevel());
		System.out.println("How many pages in tray? "+ printer1.getPaperLevelExact());
		System.out.println("Total pages used with ink?" + printer1.getTotalPagesPrinted());
		System.out.println("Total paper used?" + printer1.getTotalPaperUsed());
	*/
		WirelessPrinter printer2 = new WirelessPrinter();
		printer2.turnOn();
		printer2.connect();
		System.out.println(printer2.isOn());
		System.out.println(printer2.isConnected());
		System.out.println(printer2.getPaperLevel());
		printer2.loadPaper(1000);
		System.out.println(printer2.getPaperLevel());
		System.out.println(printer2.getInkLevel());
		printer2.print(500);
		printer2.loadPaper(500);
		printer2.print(500);
		System.out.println(printer2.getTotalPagesPrinted()+" "+ printer2.getTotalPaperUsed());
		printer2.replaceCartridge();
		printer2.loadPaper(500);
		printer2.print(500);
		System.out.println(printer2.getTotalPagesPrinted()+" "+ printer2.getTotalPaperUsed());
	}

}
