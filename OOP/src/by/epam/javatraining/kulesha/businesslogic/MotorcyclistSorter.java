package by.epam.javatraining.kulesha.businesslogic;

import java.util.Collections;

import by.epam.javatraining.kulesha.entity.Ammunition;
import by.epam.javatraining.kulesha.entity.container.Motorcyclist;

public class MotorcyclistSorter {
    public void sortAmmunitionByWeight(Motorcyclist motorcyclist) {
	Collections.sort(motorcyclist.getMotocyclist(),
		Ammunition.compareByWeight());
    }
}
