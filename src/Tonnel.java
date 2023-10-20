import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tonnel {
    int from;
    Planet to;
    int  cost;

    public Tonnel(int k, int i, int v) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
        for (int s = 0;s<k+i; s++) {
            sc.nextLine();}
        for (int c=1; c<= v*2; c++)
            sc.nextInt();
        from = sc.nextInt();
        cost= sc.nextInt();
        //to =  ;

//
//        for (int j = 0; j < 2; j++) {
//            int tmp = sc.nextInt();
//            if (tmp != 0)
//                connectionCost[j] = tmp;
//            else {
//                fin = -1;
//                break;
//            }
//        }

    }
}
