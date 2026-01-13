package pmelnik.local.testTaskAICoachQuestionnaire;

public class LeakingHumidifier {

    /**
     * Анализ сложности
     * Временная O(n)
     * Пространственная O(L) где L - длина входной строки
     * Работа алгоритма:
     * 1. Инициализация:
     *    water = 0    (начальный уровень воды)
     *    prevTime = 0 (время последнего долива)
     * 2. Для каждого долива i от 1 до N:
     *    а) Получаем время T_i и объем V_i
     *    б) Вычисляем прошедшее время:
     *       elapsed = T_i - prevTime
     *    в) Учитываем утечку за это время:
     *       water = max(0, water - elapsed)
     *       // Вода не может стать отрицательной
     *    г) Добавляем новый объем:
     *       water += V_i
     *    д) Обновляем время последнего долива:
     *       prevTime = T_i
     * 3. Возвращаем water (уровень после последнего долива)
     */

    public String calculateAmountOfWaterAfterAddingWater(String input) {

        if (input == null || input.isEmpty()) {
            return "0";
        }

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
