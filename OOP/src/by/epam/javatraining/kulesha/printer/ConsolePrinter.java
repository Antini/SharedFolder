package by.epam.javatraining.kulesha.printer;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class ConsolePrinter implements Printer {
    private static Logger logger = null;

    public ConsolePrinter() {
	DOMConfigurator.configure("log4j.xml");
	logger = Logger.getLogger("logger");
    }

    @Override
    public void print(String msg) {
	logger.info(msg);
	
    }
}
