package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0) {
            System.out.println("too much power");
            return;
        }
        System.out.println(1);
        int pow = 1;
        int i = 1;

        while(i <= power) {
            pow *= 2;
            System.out.println(pow);
            i++;
        }
    }
}
