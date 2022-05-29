package AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }



    //print out the adjacency list
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    s.append((nodeList.get(i).neighbors.get(j).name));
                }
                else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    //BFS Internal

    void bfsVisit(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor: currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }

        }
    }

    //time and space complexity 0(V+E)
    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }

        }
    }

    //depth first search internal //time and space complexity 0(V+E)
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    //dfs
    public void dfs() {
        for (GraphNode node: nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

    //add Directed Edge
    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);//going one direction
    }

    //Topological sort //time and space complexity 0(V+E)
    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbor: node.neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    //main topological sort //time and space complexity 0(V+E)
    void topologicalSort() {
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

    //bfs for single source shortest path first --Time complexity - 0(E), space complexity - 0(V)
    public void bfsForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print("Printing Path for node " + currentNode.name+ ": ");
            pathPrint(currentNode);
            System.out.println();
            for (GraphNode neighbor: currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }


    }




}
