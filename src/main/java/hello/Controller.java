package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
		
	public Controller(Model model){
		this.model = model;
	}
	
	//2
	
	
	public void buscarCharutoNome(){
		get("/charuto/nome/:nome", (req, res) -> {
					
			List<Charuto> charutosEncontrado = model.buscarNome(req.params(":nome"));	
			return new Gson().toJson(charutosEncontrado);
			
		});
	}
	
	public void buscarCharutoFabricante(){
		get("/charuto/fabricante/:fabricante", (req, res) -> {
					
			List<Charuto> charutosEncontrado = model.buscarFabricante(req.params(":fabricante"));	
			return new Gson().toJson(charutosEncontrado);
			
		});
	}
	
	public void buscarCharutoFortaleza(){
		get("/charuto/foraleza/:fortaleza", (req, res) -> {
					
			List<Charuto> charutosEncontrado = model.buscarFortaleza(req.params(":fortaleza"));	
			return new Gson().toJson(charutosEncontrado);
			
		});
	}
	
	public void buscarCharutoBitola(){
		get("/charuto/bitola/:bitola", (req, res) -> {
					
			List<Charuto> charutosEncontrado = model.buscarBitola(req.params(":bitola"));	
			return new Gson().toJson(charutosEncontrado);
			
		});
	}
	
	public void buscarCharutoNacionalidade(){
		get("/charuto/nacionalidade/:nacionalidade", (req, res) -> {
		
			
			List<Charuto> charutosEncontrado = model.buscarNacionalidade(req.params(":nacionalidade"));	
			return new Gson().toJson(charutosEncontrado);
			
		});
	}
	
	public void buscarCharuto(){
		get("/charuto/:nome/:fabricante/:nacionalidade", (req, res) -> {
		
			//Charuto charuto = new Charuto(req.params(":nome"), req.params(":fabricante"), req.params(":nacionalidade"));	
			List<Charuto> charutosEncontrados = model.buscarCharuto(req.params(":nome"), req.params(":fabricante"), req.params(":nacionalidade"));	
			return new Gson().toJson(charutosEncontrados);
			
		});
	}

}
