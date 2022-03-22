package objects;

public class Pencil extends WritingObject{
    boolean isSharpened;

    public Pencil(String color, boolean isNew, int cost, boolean isSharpened) {
        super(color, isNew, cost);
        this.isSharpened = isSharpened;
    }

    @Override
    public String toString(){
        String information = "";
        information += "This is the information for a pencil";
        information += "\nColor: " + color;
        information += "\nisNew: " + isNew;
        information += "\ncost: " + cost;
        information += "\nisSharpened: " + isSharpened;
        return information;
    }
}
