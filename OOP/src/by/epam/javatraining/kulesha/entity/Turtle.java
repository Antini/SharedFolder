package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Turtle extends Protection {
    int size;

    public Turtle(String name, int price, int weight, String classProtection,
	    int size) {
	super(name, price, weight, classProtection);
	this.size = size;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) throws LogicException {
	if (size > 0) {
	    this.size = size;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + size;
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
	Turtle other = (Turtle) obj;
	if (size != other.size)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Size:" + size + "\n";
    }

}
