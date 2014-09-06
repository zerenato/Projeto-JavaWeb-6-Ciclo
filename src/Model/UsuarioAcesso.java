package Model;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Named
@RequestScoped	
@ManagedBean
public class UsuarioAcesso {
	
static List<Usuario> listaDeUsuarios;	
	
	private static UsuarioAcesso instanciaUsuario;
	
	
	private static void CriarAdministrador() {
		listaDeUsuarios = new ArrayList<Usuario>();
		
		Usuario admin = new Usuario();
		admin.setNome("Cesar");
		admin.setLogin("admin");
		admin.setSenha("admin");
		admin.setPapel("admin");
					
		listaDeUsuarios.add(admin);


	}
	
	
	
	
	public UsuarioAcesso()
	{
		CriarAdministrador();
	}
	
	
	

	
	public static UsuarioAcesso CriarInstancia()
	{
		if(instanciaUsuario == null)
		{			
			instanciaUsuario= new UsuarioAcesso();
		}
		
		return instanciaUsuario;
	}
	


	
	
	public void adicionarComprador(Usuario compradorNovo) throws Exception{
		
		for (Usuario comprador : listaDeUsuarios) {
			if(comprador.getLogin().equals(compradorNovo.getLogin()))
				throw new RuntimeException("Erro");
		}
		
		listaDeUsuarios.add(compradorNovo);		
	}
	
	
	public void excluirComprador(Usuario comprador) throws Exception{
		
		listaDeUsuarios.remove(comprador);		
		
	}


	
	public List<Usuario> listarCompradores() throws Exception{
		
		List<Usuario> listaDeCompradores = new ArrayList<Usuario>();
		
		for (Usuario comprador : listaDeUsuarios ) 
			if(comprador.getPapel().equals("comprador"))
				 listaDeCompradores.add(comprador);
		
		return  listaDeCompradores;
	}
	
	public Usuario verificarNovoLogin(String login) {
		for (Usuario usuario : listaDeUsuarios) {
			if(usuario.getLogin().equals(login))
				return usuario;
		}
		
		return null;
	}	
	
	
	

}
