package lecture19;

import java.util.ArrayList;

class Vertex {
	String name;
	ArrayList<Edge> adjacentEdges;
	
	Vertex(String name) {
		this.name = name;
		adjacentEdges = new ArrayList<>();
	}

	public int numRoads() {
		return adjacentEdges.size();
	}

	private Edge getEdgeWith(Vertex other) {
		for (Edge e: adjacentEdges) {
			if (e.first == other || e.second == other) {
				return e;
			}
		}
		return null;
	}
	
	public boolean isAdjacent(Vertex other) {
		if (getEdgeWith(other) == null) {
			return false;
		} else {
			return true;
		}
	}

	public void removeEdgeWith(Vertex other) {
		Edge edge = getEdgeWith(other);
		if (edge == null) {
			return;
		}
		adjacentEdges.remove(edge);
	}

	public void addEdge(Edge e) {
		adjacentEdges.add(e);
	}

	public ArrayList<Vertex> getAdjacentVertices() {
		ArrayList<Vertex> output = new ArrayList<>();
		for (Edge e: adjacentEdges) {
			if (e.first == this) {
				output.add(e.second);
			} else {
				output.add(e.first);
			}
		}
		return output;
	}

	public void print() {
		System.out.print(name + ":");
		ArrayList<Vertex> adjacent = getAdjacentVertices();
		for (Vertex v: adjacent) {
			System.out.print(v.name + ",");
		}
		System.out.println();
	}
}

