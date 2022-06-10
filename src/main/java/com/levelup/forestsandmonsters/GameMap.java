package com.levelup.forestsandmonsters;

public class GameMap {

    Position[][] positions;

    public GameMap() {
        positions = new Position[10][10];

        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++)
            {
                Position p = new Position(i, j);
                positions[i][j] = p;
            }
        }
    }

    public Position[][] getPositions() {
        return positions;
    }

}
