package Java.ControlFLowProject;

public class AsciiChars {
    //    public static void main(String[] args) {
    
        public static void printNumbers() {
            // TODO: print valid numeric input 48-57 = 1-9
            char [] nums = {48,49,50,51,52,53,54,55,56,57};
            // char nums = 57;
            // for (int i = 48; i <= nums; i++) {
                for (char n: nums) {
                System.out.println(n);
                // System.out.print((char) i);
            }
        }
    
        //
        public static void printLowerCase() {
            // TODO: print valid lowercase alphabetic input 97-122 = a-z
            // char [] lowCase = {48,49,50,51,52,53,54,55,56,57};
            char lowCase = 122;
            for (int i = 97; i <= lowCase; i++) {
    //        for (char l: lowCase) {
                System.out.println((char) i);
            }
        }
    
        //
    //
        public static void printUpperCase() {
            // TODO: print valid uppercase alphabetic input 65-90 = A-Z
            char upCase = 90;
            for (int i = 65; i <= upCase; i++) {
    
                System.out.println((char) i);
            }
        }
    
}