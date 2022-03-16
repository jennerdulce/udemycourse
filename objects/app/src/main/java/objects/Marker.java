package objects;

public class Marker extends WritingObject{
    boolean isPermanent;

    public Marker(String color, boolean isNew, int cost, boolean isPermanent) {
        super(color, isNew, cost);
        this.isPermanent = isPermanent;
    }
}
