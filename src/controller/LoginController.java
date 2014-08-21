package controller;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;
import model.User;

@Getter
@Setter
@Named
@RequestScoped
public class LoginController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private User user;
	
	public String doLogin()
	{	
		if(user.getLogin().equals("admin") 
				&& user.getPassword().equals("admin"))
		{	
			//user.setRole("jogador");
			/*
			final String mensagemLogin = messages.getString("login.obrigatorio");
			System.out.println(mensagemLogin);
			System.out.println("Data de aniversário: " + this.aniversario);
			*/
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}