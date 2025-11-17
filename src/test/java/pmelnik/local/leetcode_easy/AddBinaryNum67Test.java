package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import javax.xml.transform.sax.SAXResult;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryNum67Test {

    AddBinaryNum67 sut = new AddBinaryNum67();

    @Test
    void addBinary() {
        String a = "11";
        String b = "1";

        String res = sut.addBinary(a, b);

        assertEquals("100", res);
    }

    @Test
    void addBinary2() {
        String a = "1010";
        String b = "1011";

        String res = sut.addBinary(a, b);

        assertEquals("10101", res);
    }
}