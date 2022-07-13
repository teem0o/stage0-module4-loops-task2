package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i =0;
        while (i<printToInclusive){
            if (isPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }
    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        int i=2;
        while(i<n){
            if(n%i++==0)return false;
        }
        return true;
    }
}
