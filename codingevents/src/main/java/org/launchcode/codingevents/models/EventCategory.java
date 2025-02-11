package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import org.launchcode.codingevents.models.AbstractEntity;

@Entity
public class EventCategory extends AbstractEntity {

    private String name;

    public EventCategory() {}

    public EventCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}