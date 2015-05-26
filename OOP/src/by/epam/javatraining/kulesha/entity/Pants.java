package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Pants extends Clothes {
    int length;

    public Pants(String name, int price, int weight, String color, String size,
	    int length) {
	super(name, price, weight, color, size);
	this.length = length;
    }

    public int getLength() {
	return length;
    }

    public void setLength(int length) throws LogicException {
	if (length > 0) {
	    this.length = length;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + length;
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
	Pants other = (Pants) obj;
	if (length != other.length)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Length:" + length + "\n";
    }

}
