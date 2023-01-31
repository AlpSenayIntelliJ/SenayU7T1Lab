import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees);
        System.out.println(trees.size());
        System.out.print(trees.get(1));
    }
}
