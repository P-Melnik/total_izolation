package pmelnik.local.testTaskAICoachQuestionnaire;

public class LeakingHumidifier {

    public String calculateAmountOfWaterAfterAddingWater(String input) {

        String[] lines = input.trim().split("\n");
        int n = Integer.parseInt(lines[0].trim());

        long water = 0;
        long prevTime = 0;

        for (int i = 1; i <= n; i++) {
            String[] parts = lines[i].trim().split("\\s+");
            long time = Long.parseLong(parts[0]);
            long volume = Long.parseLong(parts[1]);

            // Учитываем утечку с момента предыдущего долива
            long elapsed = time - prevTime;
            water = Math.max(0, water - elapsed);

            // Добавляем новый объем воды
            water += volume;
            prevTime = time;
        }

        return Long.toString(water);
    }

}
