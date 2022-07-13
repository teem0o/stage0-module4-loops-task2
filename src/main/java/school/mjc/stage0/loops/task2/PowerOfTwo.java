package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0){
            System.out.println("too much power");
        }else {
            int i =1;
            int k=0;
            while (k<=power) {
                System.out.println(i);
                i*=2;
                k++;
            }
        }
    }
}
