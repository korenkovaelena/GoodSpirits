import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
        int n = sc.nextInt(); //кол-во уровней планет, разделены *
        Layer[] layers  = new Layer[n];
        for (int i = 0;i<n; i++)
            layers[i] = new Layer(i);

        System.out.println(layers[0]);





//        int k = sc.nextInt(); //кол-во планет на i-м уровне
//        int[] costs = new int[10];
//        String s = sc.nextLine();
//        String g = sc.nextLine();
//        System.out.println(g);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add()
//        for (int i = 0; ;i++){
//            costs[i] = sc.nextInt();
//            if (costs[i] == 0)
//                break;
    }
       // System.out.println(Arrays.toString(costs));
//    public static void readFromFile(String fileName) throws FileNotFoundException {
//
//        }


  }
//}