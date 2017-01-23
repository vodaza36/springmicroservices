package at.hochbichler.springmicroservices.userservice.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by xhocht on 23.01.17.
 */
public class UserNotActivatedException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public UserNotActivatedException(String message) {
        super(message);
    }

    public UserNotActivatedException(String message, Throwable t) {
        super(message, t);
    }
}
