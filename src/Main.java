import com.ap.room.structure.Lamp;
import com.ap.room.structure.LampType;
import com.ap.room.bedroom.Bedroom;
import com.ap.room.structure.PaintColor;
import com.ap.room.bedroom.furniture.*;
import com.ap.room.structure.Wall;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("first",
                new Wall("left"),
                new Wall("right"),
                new Wall("back"),
                new Wall("front"),
                new Lamp(LampType.LED,false,2),
                new Ceiling(3, PaintColor.GREY),
                new Bed("comfort",2,3,1,1),
                new Wardrobe(3,5,250),
                new Carpet(2,3,PaintColor.PINK));

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getCarpet());
        System.out.println(bedroom.getCeiling());
        System.out.println(bedroom.getLamp());
        System.out.println(bedroom.getName());
        System.out.println(bedroom.getWall1());
        System.out.println(bedroom.getWall2());
        System.out.println(bedroom.getWall3());
        System.out.println(bedroom.getWall4());
        System.out.println(bedroom.getWardrobe());


    }
}