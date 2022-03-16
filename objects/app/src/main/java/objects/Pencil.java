package objects;

public class Pencil extends WritingObject{
    boolean isSharpened;

    public Pencil(String color, boolean isNew, int cost, boolean isSharpened) {
        super(color, isNew, cost);
        this.isSharpened = isSharpened;
    }
}
