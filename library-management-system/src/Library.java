public class Library {

    public static void main(String[] args) {

        LibraryItem item1 = new LibraryItem();
        item1.setAuthor("Author1");
        System.out.println( item1.getAuthor());

        Book implTest = new Book();
        implTest.setAuthor("Me");
        System.out.println(implTest.getAuthor());
        implTest.isLoanable(true);
        System.out.println(implTest.isLoanable());
    }
}
