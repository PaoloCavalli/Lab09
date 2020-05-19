package it.polito.tdp.borders.model;

import java.util.List;

import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {

	private SimpleGraph<String,DefaultEdge> grafo;
	private BordersDAO dao;
	
	public Model() {
	
		
		dao = new BordersDAO();
	}
	
	public void createGraph(int anno) {
		grafo = new SimpleGraph<String,DefaultEdge>(DefaultEdge.class);
		List <Border> confinanti = this.dao.getCountryPairs(anno);
		
		for(Border b : confinanti) {
			if(!this.grafo.containsVertex(b.getStato1()))
				this.grafo.addVertex(b.getStato1());
			if(!this.grafo.containsVertex(b.getStato2()))
				this.grafo.addVertex(b.getStato2());
			/*
			if(this.grafo.getEdge(b.getStato1(), b.getStato2()) == null ) {
				Graphs.addEdgeWithVertices(this.grafo, b.getStato1(), b.getStato2());
			}*/
			if(this.grafo.containsVertex(b.getStato1()) && this.grafo.containsVertex(b.getStato2())){
				DefaultEdge e = this.grafo.getEdge(b.getStato1(),b.getStato2() );
				if(e== null) {
					Graphs.addEdgeWithVertices(this.grafo, b.getStato1(), b.getStato2());
				}
		}
		
		
	}
		System.out.println(String.format("Grafo creato con %d vertici e %d archi", this.grafo.vertexSet().size(), this.grafo.edgeSet().size()));

}
	
	
}