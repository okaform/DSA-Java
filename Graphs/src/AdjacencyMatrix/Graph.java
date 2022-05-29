package AdjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    //print out the adjacency matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name+ ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    //Breadth First Search
    //getting neighbors
    public ArrayList<GraphNode> getNeighbors (GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {//meaning we have neighbors
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    //BFS Internal
    public void bfsVisit(GraphNode node ) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor: neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    //original method
//time and space complexity 0(V+E)
    public void bfs() {
        for (GraphNode node: nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }


     //depth first search internal
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    //dfs //time and space complexity 0(V+E)
    public void dfs() {
        for (GraphNode node: nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

        //add Directed Edge
    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;//going one direction
    }

    //Topological Sort
    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) { //time and space complexity 0(V+E)
        ArrayList<GraphNode> neighbors = getNeighbors(node);
        for (GraphNode neighbor: neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

      //main topological sort
    void topologicalSort() { //time and space complexity 0(V+E)
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }

    //print the shortest path
    public static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    //bfs for single source shortest path first - Time complexity - 0(E), space complexity - 0(V)
    public void bfsForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print("Printing Path for node " + currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }




}
