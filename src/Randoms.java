import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int min;
    int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        System.out.println("this.min = min" + min);
        System.out.println("this.min = max" + max);

        return new Iterator() {
            @Override
            public boolean hasNext() {

                return true;
            }

            @Override
            public Object next() {
                int r = new Random().nextInt((max + 1) - min) + min;
                return r;
            }
        };
    }
}

