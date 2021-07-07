package com.incluctab.tddClasses.turtleGraphics;

import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static com.incluctab.tddClasses.turtleGraphics.Direction.*;
import static com.incluctab.tddClasses.turtleGraphics.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    void thatTurtleExists(){
        Turtle newTurtle = new Turtle();
        assertNotNull(newTurtle);
    }

    @Test
    void thatTurtleHasAPen(){
        Turtle newTurtle = new Turtle();
        Pen biro = new Pen();
        newTurtle.setPen(biro);
        assertEquals(biro, newTurtle.getPen());
    }

    @Test
    void thatTurtleHasPenOnCreation(){
        Turtle newTurtle = new Turtle();
        assertNotNull(newTurtle.getPen());
    }

    @Test
    void testThatPenHasPosition(){
        Pen biro = new Pen();
        assertNotNull(biro.getPosition());
    }

    @Test
    void thatPenDefaultPositionIsUp(){
        Pen newPen = new Pen();
        assertSame(UP, newPen.getPosition());
    }

    @Test
    void thatTurtleCanTurnPenDown(){
        //given
        Turtle newTurtle = new Turtle();
        assertSame(UP, newTurtle.getPenPosition());
        //when
        newTurtle.turnPenDown();
        //assert
        assertSame(DOWN, newTurtle.getPenPosition());
    }

    @Test
    void thatTurtleCanTurnPenUp(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnPenDown();
        assertSame(DOWN, newTurtle.getPenPosition());
        //when
        newTurtle.turnPenUp();
        //assert
        assertSame(UP, newTurtle.getPenPosition());
    }

    @Test
    void thatTurtleCanTurnRightWhenFacingEast(){
        //given
        Turtle newTurtle = new Turtle();
        assertSame(EAST, newTurtle.getDirection());
        //when
        newTurtle.turnRight();
        //assert
        assertSame(Direction.SOUTH, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanTurnRightWhenFacingSouth(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        assertSame(Direction.SOUTH, newTurtle.getDirection());
        //when
        newTurtle.turnRight();
        //assert
        assertSame(Direction.WEST, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanTurnRightWhenFacingWest(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        newTurtle.turnRight();
        assertSame(Direction.WEST, newTurtle.getDirection());
        //when
        newTurtle.turnRight();
        //assert
        assertSame(Direction.NORTH, newTurtle.getDirection());
    }



    //todo facing north

    @Test
    void thatTurtleCanTurnRightWhenFacingNorth(){
        //given
        Turtle newTurtle1 = new Turtle();
        newTurtle1.turnRight();
        newTurtle1.turnRight();
        newTurtle1.turnRight();
        assertSame(NORTH, newTurtle1.getDirection());
        //when
        newTurtle1.turnRight();
        //assert
        assertSame(EAST, newTurtle1.getDirection());
    }

    @Test
    void turtleCanTurnLeftWhenFacingEast(){
        //given
        Turtle newTurtle = new Turtle();
        assertSame(EAST, newTurtle.getDirection());
        //when
        newTurtle.turnLeft();
        //assert
        assertSame(NORTH, newTurtle.getDirection());
    }

    @Test
    void turtleCanTurnLeftWhenFacingNorth(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnLeft();
        assertSame(NORTH, newTurtle.getDirection());
        //when
        newTurtle.turnLeft();
        //assert
        assertSame(WEST, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanTurnLeftWhenFacingWest(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnLeft();
        newTurtle.turnLeft();
        assertSame(WEST, newTurtle.getDirection());
        //when
        newTurtle.turnLeft();
        //assert
        assertSame(SOUTH, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanTurnLeftWhenFacingSouth(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnLeft();
        newTurtle.turnLeft();
        newTurtle.turnLeft();
        assertSame(SOUTH, newTurtle.getDirection());
        //when
        newTurtle.turnLeft();
        //assert
        assertSame(EAST, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingEast(){
        Turtle newTurtle = new Turtle();
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        //when
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(5, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingSouth(){
        Turtle newTurtle = new Turtle();
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        newTurtle.turnRight();
        //when
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(5, newPosition.getRowPosition());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingWest(){
        Turtle newTurtle = new Turtle();
        newTurtle.moveForward(5);
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(5, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        //when
        newTurtle.turnRight();
        newTurtle.turnRight();
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingNorth(){
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        newTurtle.moveForward(5);
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(5, position.getRowPosition());
        //when
        newTurtle.turnRight();
        newTurtle.turnRight();
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }


}
