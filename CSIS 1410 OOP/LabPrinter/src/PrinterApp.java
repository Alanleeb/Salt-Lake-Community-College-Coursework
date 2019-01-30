
public class PrinterApp {

	public static void main(String[] args) {
		InkJetPrinter iPrinter = new InkJetPrinter(484689);
		LaserPrinter lPrinter = new LaserPrinter(123457);

		System.out.println(iPrinter);
		System.out.println("Remaining Cartridge: " + iPrinter.getRemainingCartridge() + "%");

		System.out.println(lPrinter);
		System.out.println("Remaining Toner: " + lPrinter.getRemainingToner() + "%");

		System.out.println();
		System.out.println("Array of Printers");
		Printer printers[] = { iPrinter, lPrinter };
		for (Printer p : printers) {
			System.out.println(p);
			p.print();
			p.print();
			System.out.println();
		}
	}

}
