package by.epam.javatraining.kulesha.utility.builder;

import by.epam.javatraining.kulesha.entity.container.Motorcyclist;

public class BuildDirector {

    public BuildDirector() {
    }

    public Motorcyclist create(BuilderType type) {
	switch (type) {
	case HARDCODE:
	    HardCodeBuilder builder = new HardCodeBuilder();
	    return builder.build();
	}
	return null;
    }
}
