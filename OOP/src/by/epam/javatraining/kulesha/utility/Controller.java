package by.epam.javatraining.kulesha.utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.epam.javatraining.kulesha.entity.container.Motorcyclist;
import by.epam.javatraining.kulesha.utility.builder.BuildDirector;
import by.epam.javatraining.kulesha.utility.builder.BuilderType;

public class Controller {
    final static Logger LOG = Logger.getLogger(Controller.class);
    static {
	new DOMConfigurator().doConfigure("config/log4j.xml",
		LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
	LOG.info("HELLO, WORLD!");
	BuildDirector buildDirector = new BuildDirector();
	Motorcyclist motorcyclist = buildDirector.create(BuilderType.HARDCODE);

    }
}
