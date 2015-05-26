package by.epam.javatraining.kulesha.businesslogic;

import java.util.ArrayList;
import java.util.List;

import by.epam.javatraining.kulesha.entity.Ammunition;
import by.epam.javatraining.kulesha.entity.container.Motorcyclist;

public class MotorcyclistOperations {

    public int getTotalPrice(Motorcyclist motorcyclist) {
	int totalPrice = 0;
	for (Ammunition i : motorcyclist.getMotocyclist()) {
	    totalPrice += i.getPrice();
	}
	return totalPrice;
    }

    public int getTotalWeigth(Motorcyclist motorcyclist) {
	int totalWeigth = 0;
	for (Ammunition i : motorcyclist.getMotocyclist()) {
	    totalWeigth += i.getWeight();
	}
	return totalWeigth;
    }

    public List<Ammunition> findAmmunitionByPrice(Motorcyclist motorcyclist,
	    int minPrice, int maxPrice) {
	List<Ammunition> finder = new ArrayList<Ammunition>();
	for (Ammunition i : motorcyclist.getMotocyclist()) {
	    if (i.getPrice() >= minPrice && i.getPrice() <= maxPrice) {
		finder.add(i);
	    }
	}
	return finder;
    }

}
