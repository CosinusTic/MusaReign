package Test;

import Exceptions.*;
import GameLogic.*;

public class GameLogicTest {
    
    public static void main(String[] args) throws NoSuchCoordinateKeyException, MaximumLevelReachedException{
        Tower tower = new Tower(new Coordinates(2, 2));
        Barbarian barbarian = new Barbarian(new Coordinates(0, 4));
        Barbarian secondBarbarian = new Barbarian(new Coordinates(1000, 1500));
        Tanker tanker = new Tanker(new Coordinates(1, 21));
        Castle castle = new Castle();

        tower.computeUnitsInRange();

        System.out.println("Unit count: " + GlobalUnits.getGlobalUnits().size());


        for(Unit unit : tower.getUnitsInRange()){
            System.out.println("Unit in range: " + unit.getClass().getSimpleName());
        }
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();
        // tower.attackUnitsInRange();

        System.out.println("Unit count: " + GlobalUnits.getGlobalUnits().size());



           

        // System.out.println(GlobalUnitsCoordinates.getGlobalUnitsCoordinates().get(tower.getId()));

        // for(int i = 0; i < 10; i++){
        //     barbarian.move();   
        // }
    }
}
