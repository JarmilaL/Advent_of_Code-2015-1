package org.example;

import org.junit.jupiter.api.*;


public class TestApp {
    private SantaHelper santaHelper;

    @BeforeEach
    public void beforeEach() {
        santaHelper = new SantaHelper();
    }

    //Tested methods are private. Make them public temporarily!

//    @Test
//    public void testMissingMap() {
//        Assertions.assertEquals(0, santaHelper.findTheRightFloor(""));
//    }
//
//    @Test
//    public void testGoingUp() {
//        Assertions.assertEquals(1, santaHelper.findTheRightFloor("("));
//    }
//
//    @Test
//    public void testGoingDown() {
//        Assertions.assertEquals(-1, santaHelper.findTheRightFloor(")"));
//    }
//
//    @DisplayName("Testing 1x up, 1x down")
//    @Test
//    public void testMoreInstructions1() {
//        Assertions.assertEquals(0, santaHelper.findTheRightFloor("()"));
//    }
//
//    @DisplayName("Testing 2x up, 1x down")
//    @Test
//    public void testMoreInstructions2() {
//        Assertions.assertEquals(1, santaHelper.findTheRightFloor("()("));
//    }
//
//    @DisplayName("MapPosition is correct")
//    @Test
//    public void testMapPosition() {
//        Assertions.assertEquals(2, santaHelper.alertBasementEnter(1));
//    }
}
