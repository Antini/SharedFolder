package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Jacket extends Clothes {
    int chest;

    public Jacket(String name, int price, int weight, String color,
	    String size, int chest) {
	super(name, price, weight, color, size);
	this.chest = chest;
    }

    public int getChest() {
	return chest;
    }

    public void setChest(int chest) throws LogicException {
	if (chest < 200 && chest > 50) {
	    this.chest = chest;
	} else {
	    throw new LogicException();
	}

    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + chest;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Jacket other = (Jacket) obj;
	if (chest != other.chest)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Chest:" + chest + "\n";
    }

}
