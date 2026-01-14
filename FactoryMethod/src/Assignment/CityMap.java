package Assignment;

import java.util.Random;

public class CityMap extends Map{

    Random rand = new Random();
    // should contain a randomly selected tiles of:

    @Override
    public Tile createTile() {
        int create_tile = rand.nextInt(1,4);
        return switch (create_tile) {
            case 1 -> new RoadTile();
            case 2 -> new ForestTile();
            case 3 -> new BuildingTile();
            default -> null;
        };

    }
}
