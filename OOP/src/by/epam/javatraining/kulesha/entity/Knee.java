package by.epam.javatraining.kulesha.entity;

import by.epam.javatraining.kulesha.exception.LogicException;

public class Knee extends Protection {
    String material;

    public Knee(String name, int price, int weight, String classProtection,
	    String material) {
	super(name, price, weight, classProtection);
	this.material = material;
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

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
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
	Knee other = (Knee) obj;
	if (material == null) {
	    if (other.material != null)
		return false;
	} else if (!material.equals(other.material))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return super.toString() + "Material:" + material + "\n";
    }

}
