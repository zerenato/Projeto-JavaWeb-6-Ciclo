package interceptors;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import model.User;

@Interceptor
public class AuthorizationInterceptor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	User user;
	
	@AroundInvoke
	public Object interceptor(InvocationContext context) throws Exception
	{
		if(this.user.getRole().equals("admin"))
		{
			return context.proceed();
		}
		else if(this.user.getRole().equals("buyer"))
		{
			return context.proceed();
		}
		throw new RuntimeException("Acesso Negado.");
	}
}
