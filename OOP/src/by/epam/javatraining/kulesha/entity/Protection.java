package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public abstract class Protection extends Ammunition {
    String classProtection;

    public Protection(String name, int price, int weight, String classProtection) {
	super(name, price, weight);
	this.classProtection = classProtection;
    }

    public String getClassProtection() {
	return classProtection;
    }

    public void setClassProtection(String classProtection)
	    throws LogicException {
	if (classProtection != null && !classProtection.isEmpty()) {
	    this.classProtection = classProtection;
	} else {
	    throw new LogicException();
	}
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((classProtection == null) ? 0 : classProtection.hashCode());
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
	Protection other = (Protection) obj;
	if (classProtection == null) {
	    if (other.classProtection != null)
		return false;
	} else if (!classProtection.equals(other.classProtection))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "ClassProtection:" + classProtection + "\n";
    }

}
