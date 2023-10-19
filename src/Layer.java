import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Layer {
    Planet[] planets;

    public Layer(int i) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
//        for (int j = 0;(j<i+1); j++)
//            sc.nextLine();
        int k = sc.nextInt();
        Planet[] planets = new Planet[k];
        for (int p = 0; p<k; p++)
            planets[p] = new Planet();
    }



}
