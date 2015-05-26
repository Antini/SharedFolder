package by.epam.javatraining.kulesha.utility.builder;

import by.epam.javatraining.kulesha.entity.*;
import by.epam.javatraining.kulesha.entity.container.Motorcyclist;

public class HardCodeBuilder implements Builder {

    public HardCodeBuilder() {
    }

    public Motorcyclist build() {
	Motorcyclist motorcyclist = new Motorcyclist("Elar");
	motorcyclist.addAmmunition(new Gloves("Gloves HERO", -1, 500,
		"Leather", true));
	motorcyclist.addAmmunition(new Gloves("Gloves BIKE", 45, 700,
		"Leather", false));
	motorcyclist.addAmmunition(new Helmet("Helmet NENKI NK-315", 30, 1500,
		"close", "black"));
	motorcyclist.addAmmunition(new Helmet("Helmet Airoh CR900", 55, 1100,
		"open", "red"));
	motorcyclist.addAmmunition(new Jacket(
		"Jacket Fieldsheer Aqua Sport 2.0", 89, 700, "red", "L", 96));
	motorcyclist.addAmmunition(new Knee("Knee Street Fighter", 30, 150,
		"A", "plastic"));
	motorcyclist.addAmmunition(new Pants("Pants Acerbis MOTOCORP", 65, 450,
		"black", "L", 176));
	motorcyclist.addAmmunition(new Shoes("Shoes GAS", 100, 800, "short"));
	motorcyclist.addAmmunition(new Turtle(
		"Turtle MICHIRU Protection Jacket", 150, 300, "A", 96));
	return motorcyclist;
    }

}
