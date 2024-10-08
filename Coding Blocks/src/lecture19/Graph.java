package lecture19;

import java.util.ArrayList;
import java.util.HashMap;

import lecture12.*;
import lecture14.Helper;

public class Graph {
	private ArrayList<Vertex> vertices;

	public Graph() {
		vertices = new ArrayList<>();
	}

	public int numRoads() {
		int count = 0;
		for (Vertex v: vertices) {
			count = count + v.numRoads();
		}
		return count/2;
	}

	public int numCities() {
		return vertices.size();
	}

	public void removeEdge(String firstCity, String secondCity) throws InvalidCityException {
		Vertex first = getVertex(firstCity);
		Vertex second = getVertex(secondCity);
		if (first == null || second == null) {
			InvalidCityException e = new InvalidCityException();
			throw e;
		}

		if (!first.isAdjacent(second)) {
			return;
		}
		first.removeEdgeWith(second);
		second.removeEdgeWith(first);

	}

	public boolean areAdjacent(String firstCity, String secondCity) throws InvalidCityException {
		Vertex first = getVertex(firstCity);
		Vertex second = getVertex(secondCity);
		if (first == null || second == null) {
			InvalidCityException e = new InvalidCityException();
			throw e;
		}
		if (first.isAdjacent(second)) {
			return true;
		} else {
			return false;
		}
	}

	private Vertex getVertex(String cityName) {
		Vertex city = null;
		for (Vertex v: vertices) {
			if (v.name.equals(cityName)) {
				city = v;
				break;
			}
		}
		return city;
	}

	public void addEdge(String firstCity, String secondCity) throws InvalidCityException {
		Vertex first = getVertex(firstCity);
		Vertex second = getVertex(secondCity);
		if (first == null || second == null) {
			InvalidCityException e = new InvalidCityException();
			throw e;
		}

		if (first.isAdjacent(second)) {
			return;
		}

		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}

	public void changeCityName(String oldCityName, String newCityName) throws InvalidCityException {
		Vertex city = getVertex(oldCityName);
		if (city == null) {
			InvalidCityException e = new InvalidCityException();
			throw e;
		}
		city.name = newCityName;
	}

	public void removeCity(String cityName) {
		Vertex city = getVertex(cityName);
		if (city == null) {
			return;
		}

		vertices.remove(city);

		ArrayList<Vertex> adjacentVertices = city.getAdjacentVertices();
		for (Vertex v: adjacentVertices) {
			v.removeEdgeWith(city);
		}
	}

	public boolean hasCity(String cityName) {
		Vertex city = getVertex(cityName);
		if (city == null) {
			return false;
		} else {
			return true;
		}
	}

	public void addCity(String cityName) {
		if (hasCity(cityName)) {
			return;
		}

		Vertex v = new Vertex(cityName);
		vertices.add(v);
	}

	public void print() {
		for (Vertex v: vertices) {
			v.print();
		}
	}

	private boolean hasPath(Vertex src, Vertex dest, HashMap<Vertex, Boolean> visited) {
		if (src.isAdjacent(dest)) {
			return true;
		}
		visited.put(src, true);
		ArrayList<Vertex> adjacentVertices = src.getAdjacentVertices();
		for (Vertex v: adjacentVertices) {
			if (!visited.containsKey(v)) {
				if (hasPath(v, dest, visited)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasPath(String src, String dest) throws InvalidCityException {
		Vertex first = getVertex(src);
		Vertex second = getVertex(dest);
		if (first == null || second == null) {
			InvalidCityException e = new InvalidCityException();
			throw e;
		}
		return hasPath(first, second, new HashMap<Vertex, Boolean>());
	}



	public boolean isConnected() throws QueueEmptyException {

		QueueUsing_Linked_List <Vertex> myQueue  =new QueueUsing_Linked_List<>();

		myQueue.enqueue(vertices.get(0));
		HashMap<Vertex,Boolean> visited=new HashMap<>();
		while(!myQueue.IsEmpty()) {
			Vertex temp= myQueue.dequeue();
			visited.put(temp, true);
			for( Vertex vertex: temp.getAdjacentVertices()) {
				if(!visited.containsKey(vertex)) {
					myQueue.enqueue(vertex);
					visited.put(vertex, true);
				}
			}

		} 
		if(visited.size()==vertices.size()) {
			return true;
		}
		return false;
	}


//	private static void returnConnectedHelper(Vertex src,ArrayList <Vertex> myList, HashMap<Vertex,Boolean> Map) {
//		myList.add(src);
//
//	}


	public ArrayList<ArrayList <Vertex>> getConnectedComponents() throws QueueEmptyException {
		ArrayList<ArrayList <Vertex>> myList=new ArrayList<>();
		HashMap<Vertex,Boolean> myMap=new HashMap<>();
		QueueUsing_Linked_List <Vertex> myQueue  =new QueueUsing_Linked_List<>();

		myQueue.enqueue(vertices.get(0));   
		while(!myQueue.IsEmpty()) {
			Vertex temp= myQueue.dequeue();
			HashMap<Vertex,Boolean> visited=new HashMap<>();
			visited.put(temp, true);
			for( Vertex vertex: temp.getAdjacentVertices()) {
				if(!visited.containsKey(vertex)) {
					myQueue.enqueue(vertex);
					visited.put(vertex, true);
				}
				
				
				
		
//		for(int i=0;i<vertices.size();i++) {
//			if(!myMap.containsKey(vertices.get(i))) {
//				ArrayList <Vertex> tempList=new ArrayList<>();
//				returnConnectedHelper(vertices.get(i),tempList,myMap);
//			}
//		}
//		return myList;

	
	
	}


		}
		 return myList;
	}



		public boolean is_bipart() {
			HashMap<Vertex,Boolean> visited=new HashMap<>();
			HashMap<Vertex,Boolean> visited1=new HashMap<>();
			HashMap<Vertex,Boolean> visited2=new HashMap<>();
		
			for(Vertex v:vertices ) {
				visited.put(v, true);
				visited1.put(v, true);
				ArrayList <Vertex> adjacents = v.getAdjacentVertices();
				
				
			}
			return false;
		}


	//	public ArrayList<String> getPath(String src, String dest) {
	//		
	//	}

		}
