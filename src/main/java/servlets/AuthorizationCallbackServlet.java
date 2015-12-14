package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.extensions.appengine.auth.oauth2.AbstractAppEngineAuthorizationCodeCallbackServlet;

public class AuthorizationCallbackServlet extends AbstractAppEngineAuthorizationCodeCallbackServlet {

	@Override
	protected String getRedirectUri(HttpServletRequest arg0)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthorizationCodeFlow initializeFlow() throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
