package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.supplies = new ArrayList<>();
        this.occupants = new ArrayList<>();
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
    public ArrayList<Supply> getSupplies() {
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

    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}
