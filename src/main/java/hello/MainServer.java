package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCharutos();

		Controller controller = new Controller(model);
		
		controller.buscarCharuto();
		//controller.buscarCharutoNome();
		//controller.buscarCharutoFabricante();
		//controller.buscarCharutoFortaleza();
		//controller.buscarCharutoBitola();
		//controller.buscarCharutoNacionalidade();
		
    }
    
    public static void inicializarCharutos(){
     	model.addCharuto(new Charuto("Corona", "Dona Flor", "Fraco-Medio", "150mm x 24mm","Brasileiro", "Bom."));
    	
    	model.addCharuto(new Charuto("Gran Corona", "Dona Flor", "Medio", "184mm x 21,2mm","Brasileiro", "Daquele jeitão."));
    	
    	model.addCharuto(new Charuto("Churchill", "Romeo y Julieta", "Medio-Forte", "178mm x 18,7mm","Cubano", "Pra comemorar."));
    	
    	model.addCharuto(new Charuto("Criollo Lunch Break", "Gran Honduras ", "Medio-Fraco", "105mm x 16mm","Hondurenho", "O melhor pra depois do almoco."));
    }
}
