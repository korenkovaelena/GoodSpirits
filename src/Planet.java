import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Planet {


    public Planet() {
        ArrayList<int[]> planet;
    }

    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<int[]> planet = new ArrayList<>();
        Scanner sc = new Scanner(new File("Input.txt"));
        int[] connectionCost = new int[2];
            for (int j = 0; j < 2; j++){
                int tmp = sc.nextInt();
                if (tmp !=0)
                    connectionCost[j] = tmp;
                else
                    break;
            }
    planet.add(connectionCost);
    }





//    public Planet() throws FileNotFoundException {
//
//        int k = sc.nextInt();
//        int[][] planet = new int[k][2];
//
//            planet[i] = connectionCost;
//        }
    }
    //planets[i] = new Planet() throws FileNotFoundException;



