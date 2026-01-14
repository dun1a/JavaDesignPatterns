package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Map {

    int size;
    public abstract Tile createTile();


    public void getSize(){
        System.out.println("Give map size: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

    }


    public void display() {

        getSize();
        char[][] mapMatrix = new char[size][size];

        for (int i = 0; i < mapMatrix.length; i++) {
            for (int j = 0; j < mapMatrix[i].length; j++) {
                Tile tile = createTile();
                char character = tile.getCharacter();
                mapMatrix[i][j] = character;
            }
        }

        System.out.println("Game Map:");
        for (char[] row : mapMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }}
