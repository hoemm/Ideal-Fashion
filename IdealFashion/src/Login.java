/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josiel
 */
public class Login {
            
    private String Usuario;
        private String Senha;
       
     public Login(String Usuario, String Senha){
            this.Usuario = Usuario;
            this.Senha = Senha;
        }

    /**
     * @return the Email
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Email to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
