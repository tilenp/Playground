package com.company.kotlin_examples

import java.util.*

object BreathFirstSearch {

    // Leetcode 1971
    @JvmStatic
    fun main(args: Array<String>) {
        // todo test on leetcode
    }

    fun validPath(n: Int, edges: Array<Array<Int>>, source: Int, destination: Int): Boolean {
        val map = getMap(edges)
        return breathFirstSearch(map, source, destination)
    }

    private fun getMap(edges: Array<Array<Int>>): Map<Int, MutableSet<Int>> {
        val map: MutableMap<Int, MutableSet<Int>> = HashMap()
        for (edge in edges) {
            val source = edge[0]
            val destination = edge[1]
            val sourceAdjacent = map.getOrDefault(source, HashSet())
            val destinationAdjacent = map.getOrDefault(destination, HashSet())
            sourceAdjacent.add(destination)
            destinationAdjacent.add(source)
            map[source] = sourceAdjacent
            map[destination] = destinationAdjacent
        }
        return map
    }

    private fun breathFirstSearch(map: Map<Int, MutableSet<Int>>, source: Int, destination: Int): Boolean {
        val queue: Queue<Int> = LinkedList()
        val visited: MutableSet<Int> = HashSet()
        queue.add(source)
        while (!queue.isEmpty()) {
            val current = queue.poll()
            if (current == destination) {
                return true
            }
            if (visited.contains(current)) {
                continue
            }
            visited.add(current)
            queue.addAll(map[current]!!)
        }
        return false
    }

    private fun breathFirstSearch1(map: Map<Int, Set<Int>>, source: Int, destination: Int): Boolean {
        val queue: Queue<Int> = LinkedList()
        val visited: MutableSet<Int> = HashSet()
        queue.add(source)
        while (!queue.isEmpty()) {
            val queueSize = queue.size
            for (i in 0 until queueSize) {
                val current = queue.poll()
                if (current == destination) {
                    return true
                }
                if (visited.contains(current)) {
                    continue
                }
                visited.add(current)
                queue.addAll(map[current]!!)
            }
        }
        return false
    }
}