import java.util.ArrayList;

public class Way {

   int cost;

   public Way(ArrayList<Tonnel> tonnels, int cost) {
      this.cost = cost;
      this.tonnels = tonnels;
   }

   ArrayList<Tonnel> tonnels;
   public Way( ArrayList<Tonnel> tonnels) {
      this.tonnels = tonnels;
   }

   public Way() {
   }
}
