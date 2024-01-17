package com.ap.room.bedroom;

import com.ap.room.Room;
import com.ap.room.structure.Lamp;
import com.ap.room.structure.Wall;
import com.ap.room.bedroom.furniture.*;

public class Bedroom extends Room {
    private Ceiling ceiling;
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Ceiling ceiling, Bed bed, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, lamp);
        this.ceiling = ceiling;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

}
