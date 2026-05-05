package Assignment.commands;

import Assignment.commands.Command;
import Assignment.receiver.Pixel;

public class GenerateCommand implements Command {
    private Pixel pixel;

    public GenerateCommand(Pixel model) {
        this.pixel = model;
    }

    @Override
    public void execute() {
        int[][] grid = pixel.getGrid();

        System.out.println("int[][] pixelArt = {");

        for (int i = 0; i < grid.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) System.out.print(", ");
            }
            System.out.println("}" + (i < grid.length - 1 ? "," : ""));
        }

        System.out.println("};");
    }
}