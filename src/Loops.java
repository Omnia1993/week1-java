import java.util.concurrent.atomic.AtomicReference;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 4, 432, 6, 63, 4, 56, 8, 8, 8, 8, 6, 76, 576, 8576, 4, 5678, 58, 5, 45, 456, 4, 1, 28, 28, 839, 326, 215, 278, 3};
        String str = "Bob,Carroll,Bill,Ted,Alice,Hal,Dave,Billy,Jake,Sam,Joseph,Phil,Garth,Mark,Craig,Cathy,Barb,Adele,Julie";
        String strStates = "Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida,Georgia,Hawaii,Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland,Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire,New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania,Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington,West Virginia,Wisconsin,Wyoming";

        String[] names = str.split(",");
        String[] states = strStates.split(",");

        //  how many 4s
        int count4s = 0;

        //  how many numbers evenly divisible by 7
        int divisibleBy7 = 0;
        //  add up all numbers that are greater than 300
        int sumOfBigNum = 0;
        //  count numbers less than 100
        int countOfNumLessThan100;
        // total number between  30 and 99
        int totalBetween30And99;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                count4s++;
            }
            if (numbers[i] % 7 == 0) {
                divisibleBy7++;
            }

            if (numbers[i] > 300) {
                sumOfBigNum += numbers[i];

            }

        }
        System.out.printf("There are %d 4s%n", count4s);
        System.out.println("Sum of number  Greater than 300 =" + sumOfBigNum);
        //  how many names are longer than 4
        int nameLongerThan4 = 0;
        //  how many names have 'a' as their second letter (Carroll, Hal,, Dave.......)
        int charAt1 = 0;
        //  have many names end with 'e'
        int endWithE = 0;
        //  how many names contain an 'h'
        int containH = 0;
        for (var name : names) {                          //get the next name in the array
            if (name.startsWith("B")) {                    // does that name start with B
            }
            if (name.length() > 4) {
                nameLongerThan4++;

            }

            if (name.charAt(1) == 'a') {
                charAt1++;
            }
            if (name.endsWith("e")) {
                endWithE++;
            }
            System.out.println("name with a 'B' = " + name);
            System.out.println(" names longer than 4=" + name);
            System.out.println(" names have e as second letter=" + name);
            System.out.println(" names ends with e=" + name);
        }
        //  how many states start with 'New'
        int countState = 0;
        //  how many states are longer than 8 characters
        int stateLongerThan8 = 0;
        //  what is the shortest name for a state
        int shortestState;
        //  what states contain 'ss'
        int stateContainSs = 0;
        for (String state : states) {
            if (state.startsWith("New")) {
                countState++;
            }
            if (state.length() > 8) {

                stateLongerThan8++;

            }
            System.out.println("there are" + countState +"start with \"New\"");
            System.out.println("there are  " + stateLongerThan8+ "state longer than");
        }
    }
}



