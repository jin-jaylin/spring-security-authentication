package nextstep.app.support;

public class EmailPasswordAuthenticationToken implements Authentication {

    private Object principal;

    private Object credentials;

    private boolean authenticated = false;

    public EmailPasswordAuthenticationToken(Object principal, Object credentials) {
        this.principal = principal;
        this.credentials = credentials;
        this.authenticated = true;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }

    @Override
    public Object getCredentials() {
        return this.credentials;
    }
    @Override
    public boolean isAuthenticated() {
        return this.authenticated;
    }
}
