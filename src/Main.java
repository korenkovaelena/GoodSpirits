import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Layer[] layers = readFromFile();
        System.out.println(layers[0].planets[1].tonnels);
        ArrayList<Way> ways = calcCosts(layers);
        for(int i = 0; i<ways.size() ; i++)
            System.out.println(ways.get(i).cost);

    }


    public static ArrayList<Way> step23(Layer[] layers, int i, int p, int cost, ArrayList<Tonnel> wayTonnels, ArrayList<Way> ways){

            int qt = layers[i].planets[p].tonnels.size();
            for (int j = 0; j < qt; ) {
                wayTonnels.add(layers[i].planets[p].tonnels.get(j));
                cost += layers[i].planets[p].tonnels.get(j).cost;
                i--;
                if (i >= 0) {
                    step23(layers, i, layers[i].planets[p].tonnels.get(j).from-1, cost, wayTonnels, ways); //рекурсия
                } else {
                    Way way = new Way(wayTonnels, cost);
                    ways.add(way);
                    j++;
                    break;
                }
            }
            return ways;
    }


    public static ArrayList<Way> calcCosts(Layer[] layers){
        ArrayList<Tonnel> wayTonnels = new ArrayList<>();
        ArrayList<Way> ways = new ArrayList<>();
        int i= layers.length-1;
        int p = layers[layers.length-1].planets.length-1;
        int cost = 0;
        step23(layers, i, p, cost, wayTonnels,ways);
        return ways;


}



    private static Layer[] readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Input.txt"));
        int n = sc.nextInt(); //кол-во уровней планет, разделены *
        Layer[] layers = new Layer[n];
//         ArrayList<Tonnel> t = new ArrayList<Tonnel>();
//        layers[-1] = new Layer(new Planet[new Planet(t)]);
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            Planet[] planets = new Planet[k];
            for (int s = 0; s < k; s++) {
                ArrayList<Tonnel> tonnels = new ArrayList<>();
                for (int v = 0; ; v++) {
                    Tonnel tonnel = new Tonnel();
                    tonnel.from = sc.nextInt();
                    if (tonnel.from != 0) {
                        tonnel.cost = sc.nextInt();
                        tonnel.to =s+1;
                        tonnels.add(tonnel);
                    } else
                        break;
                }
                Planet planet = new Planet(tonnels);
                planets[s] = planet;
            }
            layers[i] = new Layer(planets);
            try {
                sc.nextLine();
                sc.nextLine();
            }
            catch (java.util.NoSuchElementException ex){
                break;
            }
        }
        return layers;
    }

}



