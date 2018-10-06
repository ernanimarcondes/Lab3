package hello;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TesteCatalogo {

	@Test
	public void test() {
		Model model = new Model();
		model.addCharuto(new Charuto("Corona", "Dona Flor", "Fraco-Medio", "150mm x 24mm","Brasileiro", "Bom."));
		model.addCharuto(new Charuto("Gran Corona", "Dona Flor", "Medio", "184mm x 21,2mm","Brasileiro", "Daquele jeitão."));
		model.addCharuto(new Charuto("Criollo Lunch Break", "Gran Honduras ", "Medio-Fraco", "105mm x 16mm","Hondurenho", "O melhor pra depois do almoco."));
		
		assertEquals(model.getCharutos().size(),3);
		
		//List<Charuto> charuto1 = model.buscarNome("Dona Flor");
		
		//assertEquals(charuto1.charutosEncontrados().size(),1);

	}

}
