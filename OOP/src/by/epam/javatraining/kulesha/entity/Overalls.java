package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Overalls extends Clothes {
    int length;
    String type;

    public Overalls(String name, int price, int weight, String color,
	    String size, int length, String type) {
	super(name, price, weight, color, size);
	this.length = length;
	this.type = type;
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

    public String getType() {
	return type;
    }

    public void setType(String type) throws LogicException {
	if (type != null && !type.isEmpty()) {
	    this.type = type;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + length;
	result = prime * result + ((type == null) ? 0 : type.hashCode());
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
	Overalls other = (Overalls) obj;
	if (length != other.length)
	    return false;
	if (type == null) {
	    if (other.type != null)
		return false;
	} else if (!type.equals(other.type))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Length:" + length + "\nType:" + type + "\n";
    }

}
