package lecture19;

import lecture12.QueueEmptyException;

public class GraphUse {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addCity("A");
		g.addCity("B");
		g.addCity("C");
		g.addCity("D");
		g.addCity("E");
		g.addCity("F");
		
		try {
//			g.addEdge("A", "B");
//			g.addEdge("C", "B");
//			g.addEdge("A", "C");
//			g.addEdge("C", "D");
//			g.addEdge("D", "E");


			g.addEdge("A", "B");
			g.addEdge("B", "C");
			g.addEdge("C", "A");
			//g.print();
			g.addEdge("D", "E");
			g.addEdge("E", "F");
			g.print();
			//System.out.println(g.hasPath("A", "E"));
//			System.out.println(g.numCities());
//			System.out.println(g.numRoads());
//			System.out.println(g.areAdjacent("Delhi", "Noida"));
//			g.addEdge("Delhi", "Noida");
//			System.out.println(g.areAdjacent("Delhi", "Noida"));
//			g.print();
//			System.out.println(g.hasPath("Noida", "Gurgaon"));
//			g.removeCity("Delhi");
//			g.print();
			
			System.out.println("The Graph is Connected or Not = "+ g.isConnected());
			g.print();
			
			System.out.println("Connected Components = "+ g.getConnectedComponents());
			g.print();
			
			
		} catch (InvalidCityException e) {
			System.out.println("Invalid city");
		} 
		
		catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Queue");
		}
	}

}
