package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Gloves extends Ammunition {
    String material;
    boolean freeFingers;

    public Gloves(String name, int price, int weight, String material,
	    boolean freeFingers) {
	super(name, price, weight);
	this.material = material;
	this.freeFingers = freeFingers;
    }

    public String getMaterial() {
	return material;
    }

    public void setMaterial(String material) throws LogicException {
	if (material != null && !material.isEmpty()) {
	    this.material = material;
	} else {
	    throw new LogicException();
	}
    }

    public boolean isFreeFingers() {
	return freeFingers;
    }

    public void setFreeFingers(boolean freeFingers) {
	this.freeFingers = freeFingers;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + (freeFingers ? 1231 : 1237);
	result = prime * result
		+ ((material == null) ? 0 : material.hashCode());
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
	Gloves other = (Gloves) obj;
	if (freeFingers != other.freeFingers)
	    return false;
	if (material == null) {
	    if (other.material != null)
		return false;
	} else if (!material.equals(other.material))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Material:" + material + "\nFreeFingers:"
		+ freeFingers + "\n";
	/*
	 * return super.toString() + "\nMaterial:" + material +
	 * "\nFreeFingers: " + (freeFingers)?"Yes\n":"No\n";
	 */

    }

}
