package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Shoes extends Ammunition {
    String purpose;

    public Shoes(String name, int price, int weight, String purpose) {
	super(name, price, weight);
	this.purpose = purpose;
    }

    public String getPurpose() {
	return purpose;
    }

    public void setPurpose(String purpose) throws LogicException {
	if (purpose != null && !purpose.isEmpty()) {
	    this.purpose = purpose;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
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
	Shoes other = (Shoes) obj;
	if (purpose == null) {
	    if (other.purpose != null)
		return false;
	} else if (!purpose.equals(other.purpose))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Purpose:" + purpose + "\n";
    }

}
