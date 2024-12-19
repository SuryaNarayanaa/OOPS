package GenericsAndLambda;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
        List<String> strs = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        nums.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
        List<Integer> odd= nums.stream().filter(i->i%2==1).collect(Collectors.toList());



            System.out.println(odd);

    }
}
