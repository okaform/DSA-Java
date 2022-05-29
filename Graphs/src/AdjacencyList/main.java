package AdjacencyList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
/*        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));

        //create Graph
        Graph g = new Graph(nodeList);
        //A
        g.addUndirectedEdge(0,1); //link from A to B and vice versa
        g.addUndirectedEdge(0,2); //link from A to C and vice versa
        g.addUndirectedEdge(0,3); //link from A to D and vice versa
        //B
        g.addUndirectedEdge(1,4); //link from B to E and vice versa
        //C
        g.addUndirectedEdge(2,3); //link from C to D and vice versa
        //D
        g.addUndirectedEdge(3,4); //link from D to E and vice versa
        System.out.println(g.toString());

        //g.bfs();

        System.out.println("\nDepth First Search");

        g.dfs();*/

/*        ArrayList<GraphNode> nodeLists = new ArrayList<>();
        nodeLists.add(new GraphNode("A",0));
        nodeLists.add(new GraphNode("B",1));
        nodeLists.add(new GraphNode("C",2));
        nodeLists.add(new GraphNode("D",3));
        nodeLists.add(new GraphNode("E",4));
        nodeLists.add(new GraphNode("F",5));
        nodeLists.add(new GraphNode("G",6));
        nodeLists.add(new GraphNode("H",7));

        //create Graph
        Graph gh = new Graph(nodeLists);

        gh.addDirectedEdge(0,2); //A -> C
        gh.addDirectedEdge(2,4); //C -> E
        gh.addDirectedEdge(4,7); //E -> H
        gh.addDirectedEdge(4,5); //E -> F
        gh.addDirectedEdge(5,6); //F -> G
        gh.addDirectedEdge(1,2); //B -> C
        gh.addDirectedEdge(1,3); //B -> D
        gh.addDirectedEdge(3,5); //D -> F

        System.out.println(gh.toString());

        gh.topologicalSort();*/
        ArrayList<GraphNode> nodeLists = new ArrayList<>();
        nodeLists.add(new GraphNode("A",0));
        nodeLists.add(new GraphNode("B",1));
        nodeLists.add(new GraphNode("C",2));
        nodeLists.add(new GraphNode("D",3));
        nodeLists.add(new GraphNode("E",4));
        nodeLists.add(new GraphNode("F",5));
        nodeLists.add(new GraphNode("G",6));

        Graph gi = new Graph(nodeLists);
        gi.addUndirectedEdge(0,1); //A -> B
        gi.addUndirectedEdge(0,2); //A -> C
        gi.addUndirectedEdge(1,3); //B -> D
        gi.addUndirectedEdge(1,6); //B -> G
        gi.addUndirectedEdge(2,3); //C -> D
        gi.addUndirectedEdge(2,4); //C -> E
        gi.addUndirectedEdge(3,5); //D -> F
        gi.addUndirectedEdge(4,5); //E -> F
        gi.addUndirectedEdge(5,6); //F -> G

        System.out.println(gi.toString());

        gi.bfsForSSSPP(nodeLists.get(0));

    }
}
