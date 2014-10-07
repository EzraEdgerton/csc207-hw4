package com.farevee.groceries;

public class ManyPackages {
	Package type;
	int count;

	public ManyPackages(Package type, int count) {
		this.type = type;
		this.count = count;
	}

	public Weight getWeight() {
		return new Weight(type.weight.unit,type.weight.amount*count);
	}

	public int getPrice() {
		return count*type.price;
	}
	
	public int getCount() {
	        return count;
	}
	
	public Package getPackage() {
	  return type;
	}
	
	public String toString() {
		return count + " x " + type.weight.amount + " " + type.weight.unit.abbrev() + " package of "
				+ type.name;
	}
	
	//equals method NEEDED

}
