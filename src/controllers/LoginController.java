package controllers;

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
	
	private User[] users;
	
	public void setUsers()
	{
		users = new User[20];
		User admin = new User();
		User buyer = new User();
		
		admin.setLogin("admin");
		admin.setPassword("admin");
		admin.setRole("admin");
		
		buyer.setLogin("buyer");
		buyer.setPassword("buyer");
		buyer.setRole("buyer");
		
		users[0] = admin;
		users[1] = buyer;
	}
	
	public String doLogin()
	{
		String role;
		
		this.setUsers();
		for(User user:users)
		{
			if(this.user.getLogin().equals(user.getLogin()) && this.user.getPassword().equals(user.getPassword()))
			{
				role = user.getRole();
				return role;
			}
		}
		return "failure";
	}
}