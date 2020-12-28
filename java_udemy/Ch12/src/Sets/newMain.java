package Sets;

import java.util.HashSet;
import java.util.Set;

public class newMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);

        union.addAll(cubes);

        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> symmetricIntersection = new HashSet<>(squares);
        Set<Integer> asymmetricIntersection = new HashSet<>(squares);

        //symmetric intersection gives you the intersection itself
        symmetricIntersection.retainAll(cubes);

        asymmetricIntersection.removeAll(cubes);

        System.out.println("symmetric Intersection contains " + symmetricIntersection.size() + "elements.");
        System.out.println("asymmetric Intersection contains " + asymmetricIntersection.size() + "elements.");


            System.out.println("This is the symmetric intersection set " + symmetricIntersection);
        System.out.println("This is the asymmetric intersection set " + asymmetricIntersection);


    }
}
