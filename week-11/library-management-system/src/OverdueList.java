import java.util.ArrayList;

public class OverdueList <E extends CardHolder> {

    ArrayList <E >overdueItems;

    public OverdueList(ArrayList<E> overdueItems) {
        this.overdueItems = overdueItems;
    }

    public ArrayList<E> getOverdueItems() {
        return overdueItems;
    }

    public void setOverdueItems(ArrayList<E> overdueItems) {
        this.overdueItems = overdueItems;
    }

    CardHolder itemHolder = new CardHolder();


//    public void addOverdueBooks(Book overdue) {
//        itemHolder.getOverdueBooks(overdue);
//
//    }
//
//    public void printOverdueBooks(Book overdue) {
//        itemHolder.getOverdueBooks(overdue);
//
//    }
//
//
//    public void addOverduePeriodicals(Periodical overdue) {
//        itemHolder.getOverduePeriodicals(overdue);
//
//    }
//
//
//    public void printOverduePeriodicals(Periodical overdue) {
//        itemHolder.getOverduePeriodicals(overdue);
//
//    }




    @Override
    public String toString() {
        return "OverdueList{" +
                "overdueItems=" + overdueItems +
                '}';
    }
}




// Limit our generic class to only be used by Vehicle or those derived from it
// This kind of restriction is called "bounded type"
//public class PendingSale<E extends Vehicle> {
//    private E someVehicle;
//
//    public PendingSale(E someVehicle) {
//        this.someVehicle = someVehicle;
//    }
//
//    public E getSomeVehicle() {
//        return this.someVehicle;
//    }
//
//    public void doSomePaperwork() {
//        // Do something here
//    }
//}