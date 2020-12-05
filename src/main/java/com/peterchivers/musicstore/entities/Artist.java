package com.peterchivers.musicstore.entities;

import java.util.Date;
import java.util.Set;

public class Artist extends Person {

    private Set<Band> bands;

    public Artist(Long id, String firstName, String lastName, Date dob, Set<Band> bands) {
        super(id, firstName, lastName, dob);
        this.bands = bands;
    }

    public Set<Band> getBands() {
        return bands;
    }

    public void setBands(Set<Band> bands) {
        this.bands = bands;
    }
}
