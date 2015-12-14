package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.extensions.appengine.auth.oauth2.AbstractAppEngineAuthorizationCodeServlet;
import com.google.appengine.repackaged.com.google.api.client.http.GenericUrl;


/**
 * taken from https://developers.google.com/api-client-library/java/google-oauth-java-client/oauth2
 * @author ca.sohier
 *
 */
public class AuthorizationServlet extends
		AbstractAppEngineAuthorizationCodeServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String getRedirectUri(HttpServletRequest req)
			throws ServletException, IOException {
		GenericUrl url = new GenericUrl(req.getRequestURL().toString());
		url.setRawPath("/oauth2callback");
		return url.build();
	}

	@Override
	protected AuthorizationCodeFlow initializeFlow() throws ServletException,
			IOException {

		// TODO
		return null;
	}

}
