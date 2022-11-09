package com.company.java_examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DepthFirstSearch {

    // Leetcode 1971

    public static void main(String[] args) {
        // todo test on leetcode
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, Set<Integer>> map = getMap(edges);
        return depthFirstSearch(map, source, destination, new HashSet<>());
    }

    private static Map<Integer, Set<Integer>> getMap(int[][] edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            Set<Integer> sourceAdjacent = map.getOrDefault(source, new HashSet<>());
            Set<Integer> destinationAdjacent = map.getOrDefault(destination, new HashSet<>());
            sourceAdjacent.add(destination);
            destinationAdjacent.add(source);
            map.put(source, sourceAdjacent);
            map.put(destination, destinationAdjacent);
        }
        return map;
    }

    private static boolean depthFirstSearch(Map<Integer, Set<Integer>> map, int current, int destination, Set<Integer> visited) {
        if (current == destination) {
            return true;
        }
        if (visited.contains(current)) {
            return false;
        }
        visited.add(current);
        for (Integer child : map.get(current)) {
            if (depthFirstSearch(map, child, destination, visited)) {
                return true;
            }
        }
        return false;
    }
}
