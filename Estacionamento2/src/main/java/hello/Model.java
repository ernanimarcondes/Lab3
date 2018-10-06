package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Charuto> charutos = new LinkedList<Charuto>();

	
	public void addCharuto(Charuto charuto){
		charutos.add(charuto);
	}
	

	//1
	
	public List<Charuto> buscarNome(String nome){
		List<Charuto> charutosEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getNome().equals(nome)) charutosEncontrados.add(charuto);
		}
		return charutosEncontrados;
	}
	
	public List<Charuto> buscarFabricante(String fabricante){
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getFabricante().equals(fabricante)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
	public List<Charuto> buscarFortaleza(String fortaleza){
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getFortaleza().equals(fortaleza)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
	public List<Charuto> buscarNacionalidade(String nacionalidade){
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getNacionalidade().equals(nacionalidade)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
	public List<Charuto> buscarBitola(String bitola){
		List<Charuto> charutoEncontrados = new LinkedList<Charuto>();
		for(Charuto charuto:charutos) {
			if(charuto.getBitola().equals(bitola)) charutoEncontrados.add(charuto);
		}
		return charutoEncontrados;
	}
	
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
