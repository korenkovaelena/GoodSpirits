import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Layer[] layers = readFromFile();
        System.out.println(layers[0].planets[1].tonnels);
        chooseCheapWayh3( layers);
    }

    private static int chooseCheapWay1(Layer[] layers){
        ArrayList<Integer> costs = new ArrayList<Integer>();
        int c;
        for(int i = 0; i < layers.length; i++) {
            for (int s = 0; s < layers[i].planets.length; s++){
                for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++){
                    c = layers[i].planets[s].tonnels.get(j).cost;
                    costs.add(c);
                }
            }
        }

return 2;
}





    private static int chooseCheapWay(Layer[] layers){
        ArrayList<Integer> costs = new ArrayList<Integer>();
        int c=0;
int i = 0; int s=0;
        for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++){
            for ( s = 0; s < layers[i].planets.length; s++){
                c=0;
                for( i = 0; i < layers.length; i++) {
                    c += layers[i].planets[s].tonnels.get(j).cost;
                }
                costs.add(c);
                i=0;
            }
            s =0;
        }
        System.out.println(costs.get(1));
        return 2;
    }





    private static int chooseCheapWay3(Layer[] layers){
        ArrayList<Integer> costs = new ArrayList<Integer>();
        int c=0;
        int i = 0; int s=0;
        for (int j = layers[i].planets[s].tonnels.size()-1; j >0; j--){
            for ( s = layers[i].planets.length; s >0; s--){
                c=0;
                for( i = layers.length; i > 0; i++) {
                    c += layers[i].planets[s].tonnels.get(j).cost;
                }
                costs.add(c);
                i=0;
            }
            s =0;
        }
        System.out.println(costs.get(1));
        return 2;
    }


    private static int chooseCheapWayh3(Layer[] layers){
        Way way = new Way();
        ArrayList<Tonnel>  wayTonnels  =new ArrayList<Tonnel>();
        ArrayList<Way> ways= new ArrayList<Way>();
        tonnels.add(new Tonnel(1));
        ways.add(new Way(tonnels.add(new Tonnel())))


    for (;;){
            for(int i = 1; i < layers.length; i++) {
                for (int s = 0; s < layers[i].planets.length; s++) {
                    for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++){
                        if (layers[i-1].planets[s].tonnels.get(j).to ==layers[i].planets[s].tonnels.get(j).from) {
                            ways.add(new)
                            layers[i].planets[s].tonnels.get(j).cost;
                        }


                }
            }
            }

        }



        for( int i = layers.length-1; i > 0; i--) {
            for (int s = layers[i].planets.length-1; s > 0; s--) {
                for (int j = layers[i].planets[s].tonnels.size() - 1; j > 0; j--) {
                    if (i == 2) {
                        wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                        ways.add(new Way(wayTonnels));
                    }
                    if (layers[i].planets[s].tonnels.get(j).to == s + 1) ;

                }

            }}




               ArrayList<Integer> costs = new ArrayList<>();
        costs.add(0);
                for(int i = 0; i < layers.length; i++)
                    for ( int s = 0; s < layers[i].planets.length; s++)
                        for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++)
                            if (layers[i].planets[s].tonnels.get(j).to == s + 1) {
                                costs.get() +=layers[i].planets[s].tonnels.get(j).cost
                                costs
                            }
                            wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                for(int f=0;f<tonnelQuantity;f++) {
                    int a = layers[2].planets[1].tonnels.get(1).cost;

                    System.out.println(a);

                }





Way =
        int s = 0;int j = 0;
        for(int i = 0; i < layers.length; i++) {
            Way way = new Way();
            for (s ; s < layers[i].planets.length; ){
                for (j; j < layers[i].planets[s].tonnels.size(); ){
                    if (layers[i].planets[s].tonnels.get(j).to == s + 1)
                        wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                }
            }s++;j++;
        }















                    ArrayList<Integer> costs = new ArrayList<>();
                    costs.add(0);
                    for(int i = 0; i < layers.length; i++)
                        for ( int s = 0; s < layers[i].planets.length; s++)
                            for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++)
                                if (layers[i].planets[s].tonnels.get(j).to == s + 1) {
                                  ways.add(new Way())
                                }











        int tonnelQuantity = 0;
        for(int i = 0; i < layers.length; i++)
            for ( int s = 0; s < layers[i].planets.length; s++)
                for (int j = 0; j < layers[i].planets[s].tonnels.size(); j++)
                    tonnelQuantity++;
        for(int f=0;f<tonnelQuantity;f++){
            int a = layers[2].planets[1].tonnels.get(1).cost;

            System.out.println(a);
        }
    }
    private static int chooseCheapWayh34(Layer[] layers){
        int s = 0;int j = 0;

        for (;;) {
            for (int i = 0; i < layers.length; i++) {
                ArrayList<Tonnel>  wayTonnels  =new ArrayList<Tonnel>();
                Way way = new Way(wayTonnels);
                for (; s < layers[i].planets.length; ) {
                    for (; j < layers[i].planets[s].tonnels.size(); ) {
                        wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                        way.cost += layers[i].planets[s].tonnels.get(j).cost;
                    }
                }

            }
            s++;
            j++;
        }
    }


    private static int chooseCheapWayh354(Layer[] layers) {
        int i = 0;
        int s = 0;
        int j = 0;
        ArrayList<Tonnel> wayTonnels = new ArrayList<Tonnel>();
        for (; ; ) {
            Way way = new Way(wayTonnels);
            for (int i = 0; i < layers.length; i++) {
                for (; s < layers[i].planets.length; ) {
                    for (; j < layers[i].planets[s].tonnels.size(); ) {

                        wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                        way.cost += layers[i].planets[s].tonnels.get(j).cost;

                    }
                }
            }
        }
    }



        private static int chooseCheapWayh3545(Layer[] layers) {
            ArrayList<Tonnel> wayTonnels = new ArrayList<Tonnel>();
            Way way = new Way(wayTonnels);
            for (int i = layers.length - 1; i > 0; i--) {
                for (int s = layers[i].planets.length - 1; s > 0; ) {
                    for (int j = layers[i].planets[s].tonnels.size() - 1; j > 0; ) {
                        if (i == 2) {
                            wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                            way.cost += layers[i].planets[s].tonnels.get(j).cost;
                            ways.add(new Way(wayTonnels));
                        } else {
                            layers[i].planets[s].tonnels.get(j);
                            if (layers[i].planets[s].tonnels.size() > 1) {
                                ways.add(new Way(wayTonnels));
                            }
                        }

                    }
                    j-- s--

                }
            }


            private static int chooseCheapWayh35425 (Layer[]layers){
                ArrayList<Tonnel> wayTonnels = new ArrayList<Tonnel>();
                Way way = new Way(wayTonnels);
                for (int i = layers.length - 1; i > 0; i--) {
                    for (int s = layers[i].planets.length - 1; s > 0; ) {
                        for (int j = layers[i].planets[s].tonnels.size() - 1; j > 0; ) {
                            if (i == 2) {
                                wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                                way.cost += layers[i].planets[s].tonnels.get(j).cost;
                                ways.add(new Way(wayTonnels));
                            }
                            for (int i = layers.length - 1 - 1; i > 0; i--) {
                                for (int s = layers[i].planets.length - 1; s > 0; ) {
                                    for (int j = layers[i].planets[s].tonnels.size() - 1; j > 0; ) {
                                        way.cost += layers[i].planets[s].tonnels.get(j).cost;
                                        wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                                        wayTonnelstmp = wayTonnels;
                                        for (int i = layers.length - 1 - 1 - 1; i > 0; i--) {
                                            for (int s = layers[i].planets.length - 1; s > 0; ) {
                                                for (int j = layers[i].planets[s].tonnels.size() - 1; j > 0; ) {
                                                    way.cost += layers[i].planets[s].tonnels.get(j).cost;
                                                    wayTonnels.add(layers[i].planets[s].tonnels.get(j));
                                                }
                                            }
                                        }
                                        wayTonnels = wayTonnelstmp;


                                    }

                            else{
                                        layers[i].planets[s].tonnels.get(j);
                                        if (layers[i].planets[s].tonnels.size() > 1) {
                                            ways.add(new Way(wayTonnels));
                                        }
                                    }

                                } j-- s--

                            }
                        }
                    }
                }
            }
        }
        private static int chooseCheapWayh355425(Layer[] layers){
            for (int j = layers[i].planets[s].tonnels.size()-1; j >0; j++){

            }
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



