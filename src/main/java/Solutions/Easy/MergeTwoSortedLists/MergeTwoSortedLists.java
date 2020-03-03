package Solutions.Easy.MergeTwoSortedLists;

import java.util.LinkedList;

import static java.util.Collections.sort;

public class MergeTwoSortedLists {
    /**
     * merge to unsorted linked list into one sorted linked list.
     * @param list1 an unsorted linked list with integer
     * @param list2 another unsorted linked list with integer
     * @return a merged + sorted linked listed
     */
    public LinkedList<Integer> mergeUnsorted(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> out = new LinkedList<Integer>();
//        out = new LinkedList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 4)); // tester

        if (list1 == null) {
            if (list2 == null) {
                return out; // both lists are null: return an empty linked list;
            } else { // only the first list is null: return the second
                return list2;
            }
        } else if (list2 == null) return list1; // only the second list is null: return the first
        // none of them are null: merge

        // Super naive version: dump all contents into a list first, then sort later
        out.addAll(list1);
        out.addAll(list2);
        sort(out); // built in sort!

        System.out.println(out);
        return out;
    }
}
