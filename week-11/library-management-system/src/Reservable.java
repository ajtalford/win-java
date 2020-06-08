//Some items may be reservable, and some may be loanable. Create an interface for each of these
//and implement them in classes which fit the appropriate type

import java.util.ArrayList;

// In interfaces, methods are by default public and abstract so those keywords aren't needed
interface Reservable {

      // properties for book reserves Personal, Class (Subject for school)MaxReservable is the same
       int getPersonHold();
       int getClassHold();
      // regardless of entity reserving the item
    public abstract int getMaxReservableItems();
    ArrayList<LibraryItem> loanedItems = null;
    ArrayList<LibraryItem> reservedItems = null;


}

//interface Discountable {
//    // In interfaces, methods are by default public and abstract
//    // so those keywords aren't needed
//    public abstract float getMaximumDiscountPct();
//
//    float getPersonDiscount();
//
//    float getCorporateDiscount();
//}