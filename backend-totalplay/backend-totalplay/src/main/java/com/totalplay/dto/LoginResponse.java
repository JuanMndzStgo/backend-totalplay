package dto;

public class LoginResponse {
    private String token;
    private String tipoToken = "Bearer";

    public LoginResponse() {}

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getTipoToken() {
        return tipoToken;
    }
    public void setTipoToken(String tipoToken) {
        this.tipoToken = tipoToken;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", tipoToken='" + tipoToken + '\'' +
                '}';
    }
}
