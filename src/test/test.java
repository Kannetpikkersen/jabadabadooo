package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import processing.core.PVector;

public class test {
    
    public test(){
        //assertTrue(false);
    }

    @Test
    public void newTest(){
        assertTrue(true);
    }

    @Test 
    public void vectorTest(){
        //arrange
        PVector p = new PVector();

        //act
        p.add(1,1);

        //asserts
        assertTrue(p.x == 1);


    }

}
