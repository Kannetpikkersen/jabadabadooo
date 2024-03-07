package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import processing.core.PVector;

import java.util.Scanner;

import java.util.Random;

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

    @Test
    public void randomtest(){
        int gæt;
        int result;
        int max;
        int min;
        gæt = 1;
        max = 2;
        min = 1;

        int total1 = 0;


        for (int i = 0; i < 20000; i++){
            result = (int) (Math.random() * (max - min + 1) + min);
            
            if (result == 1){
                total1++;
            }
        }

        assertEquals(10000, total1, 500);
    }


    @Test
    public void guesstest(){
    int gæt;
    int result;
    gæt = 1;
    result =1;
    if (gæt == result){
        assertTrue(true);
    }
    else{
        assertTrue(false);
    }
}
}
