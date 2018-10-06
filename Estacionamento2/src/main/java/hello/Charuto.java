package hello;

public class Charuto {

	private String nome;
	private String fabricante;
	private String fortaleza;
	private String bitola;
	private String nacionalidade;
	private String comentario;
	
	

	public Charuto(String nome, String fabricante, String fortaleza, String bitola, String nacionalidade, String comentario){
		this.nome = nome;
		this.fabricante = fabricante;
		this.fortaleza = fortaleza;
		this.bitola = bitola;
		this.nacionalidade = nacionalidade;
		this.comentario = comentario;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getFabricante(){
		return fabricante;
	}
	
	public String getFortaleza(){
		return fortaleza;
	}
	public String getBitola(){
		return bitola;
	}
	public String getNacionalidade(){
		return nacionalidade;
	}
	public String getComentario(){
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public boolean comparar(Charuto charut){
		if(nome.equals(charut.nome) && fabricante.equals(charut.fabricante) && fortaleza.equals(charut.fortaleza) && bitola.equals(charut.bitola) && nacionalidade.equals(charut.nacionalidade)) {
			return true;
		} else {
			return false;
		}
	}
	
}
