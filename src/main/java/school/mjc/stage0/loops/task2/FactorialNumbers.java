package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1, i =1;
        System.out.println(1);

        if(printToInclusive == 0) return;
        while(i <= printToInclusive) {
            fact *= i;
            System.out.println(fact);
            i++;
        }
    }
}
