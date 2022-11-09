package com.company.java_examples;

import java.util.*;

public class BreathFirstSearch {

    // Leetcode 1971

    public static void main(String[] args) {
        // todo test on leetcode
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, Set<Integer>> map = getMap(edges);
        return breathFirstSearch(map, source, destination);
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

    private boolean breathFirstSearch(Map<Integer, Set<Integer>> map, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination) {
                return true;
            }
            if (visited.contains(current)) {
                continue;
            }
            visited.add(current);
            queue.addAll(map.get(current));
        }
        return false;
    }

    private boolean breathFirstSearch1(Map<Integer, Set<Integer>> map, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int current = queue.poll();
                if (current == destination) {
                    return true;
                }
                if (visited.contains(current)) {
                    continue;
                }
                visited.add(current);
                queue.addAll(map.get(current));
            }
        }
        return false;
    }
}
