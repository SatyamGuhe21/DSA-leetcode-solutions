class Solution {
    public int maximumPopulation(int[][] logs) {

        int maxPopulation = 0;
        int answerYear = 1950;

        for (int year = 1950; year <= 2050; year++) {

            int population = 0;

            for (int[] person : logs) {

                int birth = person[0];
                int death = person[1];

                if (birth <= year && year < death) {
                    population++;
                }
            }

            if (population > maxPopulation) {
                maxPopulation = population;
                answerYear = year;
            }
        }

        return answerYear;
    }
}