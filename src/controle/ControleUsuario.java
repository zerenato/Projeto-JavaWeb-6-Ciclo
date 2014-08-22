package controle;


import java.io.Serializable;
import java.util.Date;
import java.util.ResourceBundle;

import i18n.*;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

import modelo.Usuario;

@Getter
@Setter
@Named
@RequestScoped
public class ControleUsuario implements Serializable{
	
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
		javax.swing.JOptionPane.showMessageDialog(null, "CHEGOU NO MÉTODOOOOOOOOOOOOOOOOOOOOO");
		return "falha";
	}
}
