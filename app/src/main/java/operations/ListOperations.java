package operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {

        List<String> branches = new ArrayList<>();
        branches.add("Motor");
        branches.add("Public Liability");
        branches.add("Life");
        branches.add("Property");
        branches.add("Group");
        branches.add("Health");

        System.out.println("Last branch in the list: " + branches.get(branches.size() - 1));

        System.out.println("List of branches:");
        for (int i = 0; i < branches.size(); i++)
            System.out.println((i + 1) + "\t" + branches.get(i));

        System.out.println("Sorted branches:");
        String[] items = new String[branches.size()];
        branches.toArray(items);
        Arrays.sort(items);

        for (String item : items)
            System.out.println(item);

        System.out.println("The branches are: ");
        System.out.println(branches.get(0));
        for (int i = 1; i < branches.size(); i++)
            System.out.println(", " + branches.get(i));
    }
}
