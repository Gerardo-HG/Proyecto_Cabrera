package Clases;

public class Usuario {
    private String perfil;
    private String password;

    public Usuario(String perfil, String password) {
        this.perfil = perfil;
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getPassword() {
        return password;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
