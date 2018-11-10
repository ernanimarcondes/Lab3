package hello;


import java.util.List;
import java.util.LinkedList;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Model {
	
	ObjectContainer charutos = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Charuto.db4o");
	
	
	public void addCharuto(Charuto charuto) {
		charutos.store(charuto);
		charutos.commit();
	}
	
	public List<Charuto> buscarCharuto(String nome, String fabricante, String nacionalidade){
		Query query = charutos.query();
		query.constrain(Charuto.class);
		ObjectSet<Charuto> todosCharutos = query.execute();
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:todosCharutos) {
			if(charuto.getNome().equals(nome) && charuto.getFabricante().equals(fabricante) && charuto.getNacionalidade().equals(nacionalidade)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
	public List<Charuto> getCharutos(){
		Query query = charutos.query();
		query.constrain(Charuto.class);
		List<Charuto> todosCharutos = query.execute();
		
		return todosCharutos;
	}
	
}
