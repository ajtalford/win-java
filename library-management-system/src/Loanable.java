//Some items may be reservable, and some may be loanable. Create an interface for each of these
//and implement them in classes which fit the appropriate type


// Interfaces follow a naming convention similar to classes but end in '-ible' or '-able'
// Usually adjective b/c interfaces are used to provide additional capabilities

interface Loanable {

        boolean isLoanable();
        int getLoanTerm();
        int getMaxLoanPeriod();
        void isLoanable(boolean b);
        default float getLoanablePenalty() {
                return 5.0f;
        }
}


//interface Leaseable {
//    boolean isLeaseable();
//
//    int getLeaseTerm();
//
//    int getMaxMilesPerYear();
//
//    default float getMileablePenalty() {
//        return 500.0f;
//    }
//}