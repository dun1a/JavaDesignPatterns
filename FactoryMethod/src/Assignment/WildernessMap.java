package Assignment;

import java.util.Random;

public class WildernessMap extends Map{

    Random rand = new Random();
    // should contain a randomly selected tile of:
    // swamp, water, forest

    @Override
    public Tile createTile() {
        int create_tile = rand.nextInt(3) + 1;
        return switch (create_tile) {
            case 1 -> new SwampTile();
            case 2 -> new WaterTile();
            case 3 -> new ForestTile();
            default -> null;
        };

    }

}
