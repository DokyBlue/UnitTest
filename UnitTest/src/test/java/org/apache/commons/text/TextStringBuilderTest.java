package org.apache.commons.text;

import static org.junit.Assert.*;

public class TextStringBuilderTest {
    private TextStringBuilder test1;
    private TextStringBuilder test2;
    String str1;
    String str2;
    char ch1;
    char ch2;
    @org.junit.Before
    public void setUp() throws Exception {
        test1 = new TextStringBuilder("jUint Test");
        test2 = new TextStringBuilder("JUint Test");
        str1 = test1.toString();
        str2 = test2.toString();
        ch1 = 'j';
        ch2 = 'J';
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testEquals() {
        assertEquals(test1.equals(test2), false);
    }

    @org.junit.Test
    public void indexOf() {
        assertEquals(test1.indexOf(ch1), 0);
    }

    @org.junit.Test
    public void lastIndexOf() {
        assertEquals(test2.lastIndexOf(ch2),0);
    }
}