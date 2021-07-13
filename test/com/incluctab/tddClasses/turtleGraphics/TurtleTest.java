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
        assertEquals(4, newPosition.getColumnPosition());
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
        assertEquals(4, newPosition.getRowPosition());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingWest(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.moveForward(5);
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(4, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
        newTurtle.turnRight();
        newTurtle.turnRight();
        //when
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
        assertSame(WEST, newTurtle.getDirection());
    }

    @Test
    void thatTurtleCanMoveForwardWhileFacingNorth(){
        //given
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        newTurtle.moveForward(5);
        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(4, position.getRowPosition());
        newTurtle.turnRight();
        newTurtle.turnRight();
        //when
        newTurtle.moveForward(5);
        //assert
        TurtlePosition newPosition = newTurtle.getTurtlePosition();
        assertEquals(0, newPosition.getColumnPosition());
        assertEquals(0, newPosition.getRowPosition());
    }

    @Test
    void thatTurtleCanWriteEastwardWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle newTurtle = new Turtle();
        newTurtle.turnPenDown();
        //when
        newTurtle.moveForward(5, sketchpad);
        //assert
        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[0][1]);
        assertEquals(1,sketchpad.getFloor()[0][2]);
        assertEquals(1,sketchpad.getFloor()[0][3]);
        assertEquals(1,sketchpad.getFloor()[0][4]);
        assertEquals(0,sketchpad.getFloor()[0][5]);

        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(4, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());

    }

    @Test
    void thatTurtleCanWriteWestwardWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle newTurtle = new Turtle();
        newTurtle.moveForward(5);
        newTurtle.turnRight();
        newTurtle.turnRight();
        newTurtle.turnPenDown();
        assertSame(WEST, newTurtle.getDirection());
        //when
        newTurtle.moveForward(5, sketchpad);
        //assert
        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[0][1]);
        assertEquals(1,sketchpad.getFloor()[0][2]);
        assertEquals(1,sketchpad.getFloor()[0][3]);
        assertEquals(1,sketchpad.getFloor()[0][4]);

        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
    }

    @Test
    void thatTurtleCanWriteSouthwardWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        newTurtle.turnPenDown();
        assertSame(SOUTH, newTurtle.getDirection());
        //when
        newTurtle.moveForward(5, sketchpad);
        //assert
        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[1][0]);
        assertEquals(1,sketchpad.getFloor()[2][0]);
        assertEquals(1,sketchpad.getFloor()[3][0]);
        assertEquals(1,sketchpad.getFloor()[4][0]);
        assertEquals(0,sketchpad.getFloor()[5][0]);

        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(4, position.getRowPosition());
    }

    @Test
    void thatTurtleCanWriteNorthwardWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle newTurtle = new Turtle();
        newTurtle.turnRight();
        newTurtle.moveForward(5);
        newTurtle.turnRight();
        newTurtle.turnRight();
        newTurtle.turnPenDown();
        assertSame(NORTH, newTurtle.getDirection());
        //when
        newTurtle.moveForward(5, sketchpad);
        //assert
        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[1][0]);
        assertEquals(1,sketchpad.getFloor()[2][0]);
        assertEquals(1,sketchpad.getFloor()[3][0]);
        assertEquals(1,sketchpad.getFloor()[4][0]);

        TurtlePosition position = newTurtle.getTurtlePosition();
        assertEquals(0, position.getColumnPosition());
        assertEquals(0, position.getRowPosition());
    }

}
