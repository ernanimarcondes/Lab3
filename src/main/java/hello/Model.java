package hello;


import java.util.List;
import java.util.LinkedList;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Model {
	
	//private List<Charuto> charutos = new LinkedList<Charuto>();
	ObjectContainer Charuto = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Charuto.db4o");
	
	public List<Charuto> buscarCharuto(String nome, String fabricante, String nacionalidade){
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getNome().equals(nome) && charuto.getFabricante().equals(fabricante) && charuto.getNacionalidade().equals(nacionalidade)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
	
	public List<Charuto> getCharutos(){
		return charutos;
	}

}
