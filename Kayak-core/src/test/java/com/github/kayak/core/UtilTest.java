/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.kayak.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jan-Niklas Meier <dschanoeh@googlemail.com>
 */
public class UtilTest {

    public UtilTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of byteToHexString method, of class Util.
     */
    @Test
    public void testByteToHexString() {
        System.out.println("byteToHexString");
        byte b = 0x4F;
        String expResult = "4F";
        String result = Util.byteToHexString(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of hexStringToByteArray method, of class Util.
     */
    @Test
    public void testHexStringToByteArray() {
        System.out.println("hexStringToByteArray");
        String s = "FF124A";
        byte[] expResult = new byte[] {(byte)0xFF, (byte)0x12, (byte)0x4A};
        byte[] result = Util.hexStringToByteArray(s);
        assertEquals(expResult.length, 3);
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);
        assertEquals(expResult[2], result[2]);
    }

    /**
     * Test of byteArrayToHexString method, of class Util.
     */
    @Test
    public void testByteArrayToHexString() {
        System.out.println("byteArrayToHexString");
        byte[] raw = new byte[] {(byte)0xFF, (byte)0x12, (byte)0x4A};
        String expResult = "FF124A";
        String result = Util.byteArrayToHexString(raw);
        assertEquals(expResult, result);
    }

    /**
     * Test of hexStringToBinaryString method, of class Util.
     */
    @Test
    public void testHexStringToBinaryString() {
        System.out.println("hexStringToBinaryString");
        String s = "FF124A";
        String expResult = "111111110001001001001010";
        String result = Util.hexStringToBinaryString(s);
        assertEquals(expResult, result);
    }
}
