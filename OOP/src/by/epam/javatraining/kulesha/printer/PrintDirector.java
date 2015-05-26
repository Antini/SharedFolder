package by.epam.javatraining.kulesha.printer;

public class PrintDirector {

    public PrintDirector() {

    }

    public void print(String msg, PrinterType type) {
	switch (type) {
	case CONSOLE:
	    ConsolePrinter printer = new ConsolePrinter();
	    printer.print(msg);
	}
    }
}
