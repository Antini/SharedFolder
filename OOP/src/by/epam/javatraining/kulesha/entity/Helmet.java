package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Helmet extends Ammunition {
    String type;
    String color;

    public Helmet(String name, int price, int weight, String type, String color) {
	super(name, price, weight);
	this.type = type;
	this.color = color;
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

    public String getColor() {
	return color;
    }

    public void setColor(String color) throws LogicException {
	if (type != null && !type.isEmpty()) {
	    this.color = color;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((color == null) ? 0 : color.hashCode());
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
	Helmet other = (Helmet) obj;
	if (color == null) {
	    if (other.color != null)
		return false;
	} else if (!color.equals(other.color))
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
	return super.toString() + "Type:" + type + "\nColor:" + color + "\n";
    }

}
