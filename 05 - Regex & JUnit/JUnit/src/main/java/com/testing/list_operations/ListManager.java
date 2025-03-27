package com.testing.list_operations;

import java.util.List;

public class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                list.remove(i);
            }
        }
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }
}
