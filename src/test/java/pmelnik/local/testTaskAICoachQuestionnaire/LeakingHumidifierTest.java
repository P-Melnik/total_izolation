package pmelnik.local.testTaskAICoachQuestionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeakingHumidifierTest {

    LeakingHumidifier sut = new LeakingHumidifier();

    @Test
    void calculateAmountOfWaterAfterAddingWater_Data1() {
        String input = """
            4
            1 3
            3 1
            4 4
            7 1
            """;

        String res = sut.calculateAmountOfWaterAfterAddingWater(input);

        Assertions.assertEquals("3", res);
    }

    @Test
    void calculateAmountOfWaterAfterAddingWater_Data2() {
        String input = """
            3
            1 8
            10 11
            21 5
            """;

        String res = sut.calculateAmountOfWaterAfterAddingWater(input);

        Assertions.assertEquals("5", res);
    }

    @Test
    void calculateAmountOfWaterAfterAddingWater_Data3() {
        String input = """
            10
            2 1
            22 10
            26 17
            29 2
            45 20
            47 32
            72 12
            75 1
            81 31
            97 7
            """;

        String res = sut.calculateAmountOfWaterAfterAddingWater(input);

        Assertions.assertEquals("57", res);
    }
}