package codewarsChallenges;


import java.util.List;

public class SumMixedArray {

    public static void main(String[] args) {


    }

    public class MixedSum {

        public int sum(List<?> mixed) {
            int sum = 0;
            for(Object s : mixed){
                sum += Integer.valueOf(s.toString());
            }

            return sum;
        }
    }
}
