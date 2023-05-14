package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int mul) {
        int i = 0;
        boolean is = false;
        if(mul == 0) return;
        if(mul < 0){
            mul *= -1;
            is = true;
        }
        while(i <= mul) {
            System.out.println(!is ?mul*i:mul*i*-1);
            i++;
        }
    }
}
