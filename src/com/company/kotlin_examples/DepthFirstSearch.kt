package com.company.kotlin_examples

object DepthFirstSearch {

    // Leetcode 1971
    @JvmStatic
    fun main(args: Array<String>) {
        // todo test on leetcode
    }

    fun validPath(n: Int, edges: Array<Array<Int>>, source: Int, destination: Int): Boolean {
        val map = getMap(edges)
        return depthFirstSearch(map, source, destination, java.util.HashSet())
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

    private fun depthFirstSearch(
        map: Map<Int, MutableSet<Int>>,
        current: Int,
        destination: Int,
        visited: MutableSet<Int>
    ): Boolean {
        if (current == destination) {
            return true
        }
        if (visited.contains(current)) {
            return false
        }
        visited.add(current)
        for (child in map[current]!!) {
            if (depthFirstSearch(map, child, destination, visited)) {
                return true
            }
        }
        return false
    }
}