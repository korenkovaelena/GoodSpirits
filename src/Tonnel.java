import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tonnel {

    int from;
    int to;
    int  cost;

    public Tonnel() {
    }

    public Tonnel(int to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Tonnel{" +
                "from=" + from +
                ", to=" + to +
                ", cost=" + cost +
                '}';
    }
}
