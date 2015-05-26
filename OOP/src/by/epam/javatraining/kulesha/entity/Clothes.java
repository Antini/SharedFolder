package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public abstract class Clothes extends Ammunition {
    String color;
    String size;

    public Clothes(String name, int price, int weight, String color, String size) {
	super(name, price, weight);
	this.color = color;
	this.size = size;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) throws LogicException {
	if (color != null && !color.isEmpty()) {
	    this.color = color;
	} else {
	    throw new LogicException();
	}

    }

    public String getSize() {
	return size;
    }

    public void setSize(String size) throws LogicException {
	if (size != null && !size.isEmpty()) {
	    this.size = size;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((size == null) ? 0 : size.hashCode());
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
	Clothes other = (Clothes) obj;
	if (color == null) {
	    if (other.color != null)
		return false;
	} else if (!color.equals(other.color))
	    return false;
	if (size == null) {
	    if (other.size != null)
		return false;
	} else if (!size.equals(other.size))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Color:" + color + "\nSize:" + size + "\n";
    }

}
