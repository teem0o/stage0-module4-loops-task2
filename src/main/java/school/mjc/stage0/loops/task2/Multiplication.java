package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive!=0){
            int i=0;
            int n=multiplyByAndToInclusive>0?multiplyByAndToInclusive:multiplyByAndToInclusive*-1;
            while (i!=n){
                System.out.println(i++*multiplyByAndToInclusive);
            }
            System.out.println(i*multiplyByAndToInclusive);
        }

    }
}
