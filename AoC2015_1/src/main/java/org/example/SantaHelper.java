package org.example;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SantaHelper {

    public void helpSantaFindTheRightFloor(InputStream in, PrintStream out) {
        Scanner scanner = new Scanner(in);
        out.println("Give Santa a map to your apartment:");
        String santasMap = scanner.nextLine();
        out.println("Santa ended up at the floor number " + findTheRightFloor(santasMap));

    }

    private int findTheRightFloor(String santasMap) {

        if (santasMap == null)
            throw new IllegalArgumentException("Santa has no map :(");

        int currentFloor = 0;
        int basementEnterCounter = 0;
        for (int i = 0; i < santasMap.length(); i++) {
            if (santasMap.charAt(i) == '(') currentFloor = goUp(currentFloor);
            if (santasMap.charAt(i) == ')') currentFloor = goDown(currentFloor);
            if (currentFloor == -1) basementEnterCounter += 1;
            if (basementEnterCounter == 1 && currentFloor == -1) alertBasementEnter(i);
        }

        return currentFloor;
    }

    private int goUp(int currentFloor) {
        return currentFloor + 1;
    }

    private int goDown(int currentFloor) {
        return currentFloor - 1;
    }

    private int alertBasementEnter(int i) {
        int mapPosition = i + 1;
        System.out.println("Santa just entered the basement! (map position: " + mapPosition + ")");
        return mapPosition;
    }
}
