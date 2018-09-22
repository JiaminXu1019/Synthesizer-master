package com.example.synthesizer;

public class Note {
    private int noteid;
    private int delay;
    public static final int WHOLE_NOTE = 1000;

    public Note(int noteid, int delay) {
        this.noteid = noteid;
        this.delay = delay;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteid=" + noteid +
                ", delay=" + delay +
                '}';
    }
}
