package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test for LeapYear
 */
public class LeapYearTest{
	
	LeapYear LeapYear = new LeapYear();
	
  @Test
  public final void leapTest0(){
    boolean result = LeapYear.isLeapYear(2000);
    assertEquals(true, result);
  }
  
  @Test
  public final void leapTest1(){
    boolean result = LeapYear.isLeapYear(2004);
    assertEquals(true, result);
  }

  @Test
  public final void leapTest2(){

    boolean result = LeapYear.isLeapYear(2021);
    assertEquals(false, result);
  }

  @Test
  public final void leapTest3(){

    boolean result = LeapYear.isLeapYear(2030);
    assertEquals(false, result);
  }

}