package i18n;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class MessageBundleProvider implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResourceBundle bundle;
	 
	@Produces
	@MessageBundleImpl
	public ResourceBundle getBundle() {
		if (this.bundle == null) {
			FacesContext context = FacesContext.getCurrentInstance();
			Locale locale = context.getViewRoot().getLocale();
			//bundle = ResourceBundle.getBundle("i18n.messages", locale);
			bundle = ResourceBundle.getBundle("ValidationMessages", locale);
		}
		return this.bundle;
	}

}
