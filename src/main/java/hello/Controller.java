package hello;

import static spark.Spark.get;
import static spark.Spark.post;


import java.io.UnsupportedEncodingException;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import spark.Request;
import spark.Response;
import spark.Route;

public class Controller {
	
	private Model model;
		
	public Controller(Model store){
		this.model = store;
	}
	
	
	public void buscarCharuto(){
		get("/charuto/:nome/:fabricante/:nacionalidade", (req, res) -> {	
			List<Charuto> charutosEncontrados = model.buscarCharuto(req.params(":nome"), req.params(":fabricante"), req.params(":nacionalidade"));	
			return new Gson().toJson(charutosEncontrados);
			
		});
	}

}
