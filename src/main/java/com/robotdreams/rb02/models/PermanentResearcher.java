package com.robotdreams.rb02.models;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class PermanentResearcher extends Instructors {

    private double fixedSalary;

    public PermanentResearcher() {

    }

    public PermanentResearcher(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentResearcher(String name, String address, String phoneNumber, double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentResearcher that = (PermanentResearcher) o;
        return Double.compare(that.fixedSalary, fixedSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fixedSalary);
    }

    @Override
    public String toString() {
        return "PermanentResearcher{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }
}
