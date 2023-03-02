package ITschool.practice.session27feb.kataTogheter;

public class Kata {
    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        System.out.println(Solution.stray(array));
    }

    class Solution {
        static int stray(int[] numbers) {
            int numbersToReturn = 0;
            int index1 = 0;
            for (int index = 1; index1 < numbers.length; index1 += index) {
                if (numbers[index1] != numbers[index]) {
                    numbersToReturn = numbers[index1];
                    if (numbers[index1] != numbers[index + 1]) {
                        numbersToReturn = numbers[index1];
                    }
                }
            }
            return numbersToReturn;
        }
    }
}
