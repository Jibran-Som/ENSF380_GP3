package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<DisasterVictim> getOccupants() {
        return occupants;
    }

    public List<Supply> getSuppliers() {
        return supplies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOccupants(List<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    public void setSuppliers(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }

    public void addSupplier(Supply supplier) {
        this.supplies.add(supplier);
    }

    public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
    }

    public void removeSupplier(Supply supplier) {
        this.supplies.remove(supplier);
    }
}
