package arrayexercise;

import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        int[] array1 = new int[]{
                1,3,2,4,8,9,0
        };
        int[] array2 = new int[]{
                1,3,7,5,4,0,7,5
        };


        HashSet<Integer> hs1 = new HashSet();
        HashSet<Integer> hs2 = new HashSet();
        for(int i=0;i<array1.length;i++)
            hs1.add(array1[i]);
        for(int i=0;i<array2.length;i++)
            hs2.add(array2[i]);
        System.out.println("Set 1 = " + hs1);
        System.out.println("Set 2 = " + hs2);


        HashSet<Integer> union = new HashSet();
        union.addAll(hs1);
        union.addAll(hs2);
        System.out.println("Union = " + union);


        HashSet<Integer> inter = new HashSet();
        inter.addAll(hs1);
        inter.retainAll(hs2);
        System.out.println("Intersection = " + inter);


        HashSet<Integer> symm = new HashSet();
        symm.addAll(union);
        symm.removeAll(inter);
        System.out.println("Symm Difference = " + symm);
    }
}
