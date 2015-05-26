package by.epam.javatraining.kulesha.entity.container;

import java.util.ArrayList;
import java.util.List;

import by.epam.javatraining.kulesha.entity.Ammunition;
import by.epam.javatraining.kulesha.exception.LogicException;

public class Motorcyclist {
    private String name;
    private List<Ammunition> motorcyclist = null;

    public Motorcyclist(String name) {
	motorcyclist = new ArrayList<Ammunition>();
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) throws LogicException {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    throw new LogicException();
	}
    }

    public void addAmmunition(Ammunition ammunition) {
	motorcyclist.add(ammunition);
    }

    public Ammunition getAmmunition(int index) {
	return motorcyclist.get(index);
    }

    public List<Ammunition> getMotocyclist() {
	return motorcyclist;
    }

    public String showAllAmmunition() {
	StringBuilder toStr = new StringBuilder();
	for (Ammunition i : motorcyclist) {
	    toStr.append(i);
	}
	return toStr.toString();
    }

    @Override
    public String toString() {
	StringBuilder toStr = new StringBuilder();
	return toStr.append(
		"Name of motocyclist:  " + name + "\n" + showAllAmmunition())
		.toString();
    }

}
