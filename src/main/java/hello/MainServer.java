package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        port(port);

		staticFileLocation("/static");

		inicializarCharutos();

		Controller controller = new Controller(model);
		
		controller.buscarCharuto();
		
    }
    
    public static void inicializarCharutos(){
     	model.addCharuto(new Charuto("Corona", "Dona Flor", "Fraco-Medio", "150mm x 24mm","Brasileiro", "Bom.", "https://cdn.awsli.com.br/600x700/510/510946/produto/25295195/0fc5a549b8.jpg"));
     	
     	model.addCharuto(new Charuto("Toro", "Dannemann", "Medio-Forte", "140mm x 22mm","Brasileiro", "Um dos melhores.", "https://www.charutosonline.com/media/catalog/product/cache/1/small_image/275x250/9df78eab33525d08d6e5fb8d27136e95/i/m/img_9781.jpg"));
    	
    	model.addCharuto(new Charuto("Gran Corona", "Dona Flor", "Medio", "184mm x 21,2mm","Brasileiro", "Daquele jeitão.", "https://v0.static.betalabs.com.br/uploads/gestao_ja/produto/produto_foto/thumb/400x4009124898a8a6d3e5ea0f1dfa6395c3c84.jpg"));
    	
    	model.addCharuto(new Charuto("Churchill", "Romeo y Julieta", "Medio-Forte", "178mm x 18,7mm","Cubano", "Pra comemorar.", "https://cdn.shopify.com/s/files/1/0409/6017/products/romeo-y-julieta-short-churchill_30b630c6-038f-4c81-8731-9ae0674f02a3.jpg?v=1479928986"));
    	
    	model.addCharuto(new Charuto("Criollo Lunch Break", "Gran Honduras", "Medio-Fraco", "105mm x 16mm","Hondurenho", "O melhor pra depois do almoco.", "data:image/jpeg;base64,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"));
    }
}
