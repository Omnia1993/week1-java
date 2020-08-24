import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {




    int[] numbers = new int[5];
    numbers[0] = Utils.getNumber("Enter # ");
    numbers[1] = Utils.getNumber("Enter # ");
    numbers[2] = Utils.getNumber("Enter # ");
    numbers[3] = Utils.getNumber("Enter # ");
    numbers[4] = Utils.getNumber("Enter # ");

    List<String> names = new ArrayList<>();
        names.add(Utils.getInput("Name: "));
        names.add(Utils.getInput("Name: "));
        names.add(Utils.getInput("Name: "));
       // names.add(Utils.getInp);
}
}
