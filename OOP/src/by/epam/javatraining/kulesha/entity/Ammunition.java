package by.epam.javatraining.kulesha.entity;

import java.util.Comparator;

import by.epam.javatraining.kulesha.exception.LogicException;

public abstract class Ammunition {
    private String name;
    private int price;
    private int weight;

    public Ammunition(String name, int price, int weight) {
	this.name = name;
	this.price = price;
	this.weight = weight;
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

    public int getPrice() {
	return price;
    }

    public void setPrice(int price) throws LogicException {
	if (price > 0) {
	    this.price = price;
	} else {
	    throw new LogicException();
	}

    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) throws LogicException {
	if (weight > 0) {
	    this.weight = weight;
	} else {
	    throw new LogicException();
	}

    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + price;
	result = prime * result + weight;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Ammunition other = (Ammunition) obj;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (price != other.price)
	    return false;
	if (weight != other.weight)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	StringBuilder toStr = new StringBuilder();
	return toStr.append(
		"\nAmmunition: \nName:" + name + "\nPrice:" + price
			+ "$\nWeight:" + weight + "g\n").toString();
    }

    public static ComparatorByWeight compareByWeight() {
	return new ComparatorByWeight();

    }

    private static class ComparatorByWeight implements Comparator<Ammunition> {

	@Override
	public int compare(Ammunition one, Ammunition two) {

	    return one.getWeight() - two.getWeight();

	}
    }

}
