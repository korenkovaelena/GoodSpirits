import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Layer {
    static Planet[] planets;

    public Layer(int i) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
        sc.nextLine();
        int k = sc.nextInt();
        for (int s = 1;s<i+1; s++) {
            for (int j = 0; (j < i * k + 1); j++)
                sc.nextLine();
            sc.nextLine();
            k = sc.nextInt();
        }
        Planet[] planets = new Planet[k];
        for (int p = 0; p<k; p++) {
            planets[p] = new Planet(k, p, previousK, i);

        }
    }



}
