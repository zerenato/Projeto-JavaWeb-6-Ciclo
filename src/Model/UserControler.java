package Model;



import java.io.Serializable;
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
	public class UserControler implements Serializable {	
		
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private Usuario usuario = new Usuario();	
		
		private List<Usuario> listaDeCompradores = null;
		
		private UsuarioAcesso usuarioAcesso;
		
		public UserControler() throws Exception {
			 usuarioAcesso = UsuarioAcesso.CriarInstancia();
			 listarUsuariosCompradores();
		}
		
		


		public List<Usuario> listarUsuariosCompradores() throws Exception {
			
			listaDeCompradores = usuarioAcesso.listarCompradores();		
			return listaDeCompradores;
		}
		
		public String excluirComprador() throws Exception {
			usuarioAcesso.excluirComprador(usuario);
			listarUsuariosCompradores();
			return "listar";
		}
		
			
		public void criarComprador() throws Exception{
			usuario.setPapel("comprador");
			usuarioAcesso.adicionarComprador(usuario);
			listarUsuariosCompradores();
		
		}
		

	       public String irParaPaginaDeCadastro() throws Exception {
			usuario = new Usuario();
			return "cadastrar";

		}
	       
	       public String irParaPaginaDeListar() throws Exception {
	    	   listarUsuariosCompradores();
			
			return "listar";


		}
		
		
		public void setListarCompradores(List<Usuario> listarCompradores){
			this.listaDeCompradores = listarCompradores; 
		}
		
		public Usuario getUsuarioSelecionado(){
			return usuario;
		}
		
		public void setUsuarioSelecionado(Usuario usuario){
			this.usuario = usuario;
		}


		
	}


