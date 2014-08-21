package controle;


import java.io.Serializable;
import java.util.Date;
import java.util.ResourceBundle;

import i18n.*;

import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;

import modelo.Usuario;

public class ControleUsuario implements Serializable{
	
	//@ManagedProperty(value = "#{controleUsuario}")
	private static final long serialVersionUID = 1L;

	private String login;
	
	private Date dataNasc;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	@MessageBundleImpl
	private ResourceBundle messages;
	
//	@PostConstruct
//	public void init() {
//		
//		FacesContext context = FacesContext.getCurrentInstance();
//		Locale locale = context.getViewRoot().getLocale();
//		this.messages = ResourceBundle.getBundle("i18n.messages", locale);
//	}
	
	public String realizarCadastro()
	{	
		return "falha";
	}
}
