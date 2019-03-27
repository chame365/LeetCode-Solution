package problem;

import java.util.ArrayList;
import java.util.List;

public class P706 {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);
        hashMap.get(3);
        hashMap.put(2, 1);
        hashMap.get(2);
        hashMap.remove(2);
        hashMap.get(2);
    }
}

class MyHashMap {

    List<int[]> list;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        list = new ArrayList<int[]>();
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        for (int[] l : list) {
            if (l[0] == key) {
                l[1] = value;
                return;
            }
        }
        list.add(new int[]{key, value});

    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        for (int[] l : list) {
            if (l[0] == key) {
                return l[1];
            }
        }

        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] == key) {
                list.remove(i);
                return;
            }
        }
    }
}

