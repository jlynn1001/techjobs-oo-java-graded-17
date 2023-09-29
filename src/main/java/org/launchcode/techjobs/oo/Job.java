package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
public Job() {
    id = nextId;
    nextId++;
}
public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
    this();
    this.name = name;
    this.employer = employer;
        if (employer.getValue() == null || employer.getValue().isEmpty()) {
        this.employer = new Employer("Data not available");
        }
        this.location = location;
        if (location.getValue() == null || location.getValue().isEmpty()) {
            this.location = new Location("Data not available");
        }
        this.positionType = positionType;
        if (positionType.getValue() == null || positionType.getValue().isEmpty()) {
            this.positionType = new PositionType("Data not available");
        }
        this.coreCompetency = coreCompetency;
        if (coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty()) {
            this.coreCompetency = new CoreCompetency("Data not available");
        }
    }

    @Override
    public String toString() {
            return "\n" +
                    "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency +
                    "\n";
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
