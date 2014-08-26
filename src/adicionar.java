import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;


public class adicionar {
	ArrayList lista = new ArrayList();	
	
	public ArrayList Adiciona(String nome){		
		lista.add(nome);		
		return lista;
	}

}