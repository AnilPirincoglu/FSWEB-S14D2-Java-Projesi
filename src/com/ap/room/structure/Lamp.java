package com.ap.room.structure;

public class Lamp {
    private LampType style;
    private boolean isBattery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.isBattery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", isBattery=" + isBattery +
                ", globRating=" + globRating +
                '}';
    }
}
