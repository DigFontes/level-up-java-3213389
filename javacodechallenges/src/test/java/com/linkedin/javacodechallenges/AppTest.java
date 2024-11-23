package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isEven_true(){
        assertTrue( App.isEven(0) );
        assertTrue( App.isEven(2) );
        assertTrue( App.isEven(4) );
        assertTrue( App.isEven(6) );
        assertTrue( App.isEven(8) );
        assertTrue( App.isEven(-20) );
        assertTrue( App.isEven(100) );
        assertTrue(App.isEven(-46));

    }

    @Test
    public void isEven_false() {
        assertFalse(App.isEven(1));
        assertFalse(App.isEven(3));
        assertFalse(App.isEven(5));
        assertFalse(App.isEven(7));
        assertFalse(App.isEven(9));
        assertFalse(App.isEven(-21));
        assertFalse(App.isEven(101));
        assertFalse(App.isEven(-47));
    }

   @Test
   public  void isPasswordComplex_true() {
    assertTrue(App.isPasswordComplex("Happy12"));
    assertTrue(App.isPasswordComplex("1SarahL ength"));
    assertTrue(App.isPasswordComplex("Password12"));
    assertTrue(App.isPasswordComplex("2PassW@ord1"));
    assertTrue(App.isPasswordComplex("01Sall#y9"));
   }
}
