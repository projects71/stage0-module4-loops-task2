package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while(i <= printToInclusive) {
            boolean is = true;
            int j = 2;
            while(j < i) {
                if( i % j == 0) {
                    is = false;
                    break;
                }
                j++;
            }

            if(is)
                System.out.println(i);
            i++;
        }
    }
}
