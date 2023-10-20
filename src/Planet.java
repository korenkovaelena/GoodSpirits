import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Planet {


    public Planet(int k, int i, ArrayList<Integer>  previousK,int layerNum) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
        ArrayList<Tonnel> tonnels = new ArrayList<>();
        int flag = 999999;
        int p=0;

//        sc.findInLine("*");
//
//        for (int s = 0;s< layerNum ; s++) {
//            for (int f = 0;f< previousK.get(s-1) ; f++)
//                sc.nextLine();
        }

        for (int s = 0;s<k+i; s++) {
            sc.nextLine();}
        for (int v= 0;;v++) {
            if(flag != 0) {
                for (int c = 0; c < v ; c++) {
                    p=sc.nextInt();
//                   // sc.nextInt();
                }
                 flag = sc.nextInt();
                if (flag != 0)
                    tonnels.add(new Tonnel(k, i, v));
                else
                    break;
            }
            else
                break;
        }

//        Scanner sc = new Scanner(new File("Input.txt"));
//        int[] connectionCost = new int[2];
//        int fin = 0;
////        for (int s = 0;s<k+i; s++) {
////            //sc.nextLine();
////            sc.nextLine();}
//        for (;;) {
//
//            for (int j = 0; j < 2; j++) {
//                int tmp = sc.nextInt();
//                if (tmp != 0)
//                    connectionCost[j] = tmp;
//                else {
//                    fin = -1;
//                    break;
//                }
//            }
//            if (fin != -1) {
//                tonnels.add(connectionCost) ;
//            }
//            else
//                break;
//
//        }
      }


}



////public static void main(String[] args) throws FileNotFoundException {
//    ArrayList<int[]> planet = new ArrayList<>();
//        Scanner sc = new Scanner(new File("Input.txt"));
//        int[] connectionCost = new int[2];
//        int fin = 0;
//        for (int s = 0;s<k+i; s++) {
//            //sc.nextLine();
//            sc.nextLine();}
//        for (;;) {
//
//                for (int j = 0; j < 2; j++) {
//                    int tmp = sc.nextInt();
//                    if (tmp != 0)
//                        connectionCost[j] = tmp;
//                    else {
//                        fin = -1;
//                        break;
//                    }
//                }
//                if (fin != -1) {
//                    planet.add(connectionCost) ;
//                }
//                else
//                    break;
//
//        }}
//
//
//    }





//    public Planet() throws FileNotFoundException {
//
//        int k = sc.nextInt();
//        int[][] planet = new int[k][2];
//
//            planet[i] = connectionCost;
//        }

    //planets[i] = new Planet() throws FileNotFoundException;



