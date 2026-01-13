package pmelnik.local.testTaskAICoachQuestionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeNumberTest {

    MaximizeNumber sut = new MaximizeNumber();


    @Test
    void maximizeA_basic() {

        String a = "1234";
        String b = "5987";

        String res = sut.maximizeA(a, b);

        Assertions.assertEquals("9875", res);
    }

    @Test
    void maximizeA_basic2() {

        String a = "1234";
        String b = "9999";

        String res = sut.maximizeA(a, b);

        Assertions.assertEquals("9999", res);
    }

    @Test
    void maximizeA_noSubstitutions() {

        String a = "4321";
        String b = "123";

        String res = sut.maximizeA(a, b);

        Assertions.assertEquals("4332", res);
    }

    @Test
    void maximizeA_simpleReplacement() {

        String a = "1000";
        String b = "9";

        String res = sut.maximizeA(a, b);

        Assertions.assertEquals("9000", res);
    }

    @Test
    void maximizeA_emptyB() {

        String a = "1234";
        String b = "";

        String res = sut.maximizeA(a, b);

        Assertions.assertEquals("1234", res);
    }
}