/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Usuario {
    private String nome, login, email, senha;
    
    Conexao conConexao = new Conexao();

    public Usuario() {
    }

    public Usuario(String nome, String login, String email, String senha) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrarUsuario() {
        String sql;
        sql = "INSERT INTO usuarios(nome, email, login, senha) VALUES ('" + getNome() + "', '" + getEmail() + "', '" + getLogin() + "', '" + getSenha() + "')";
        conConexao.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
    
     public ResultSet ListarUsuario() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select nome,email,login,senha from usuarios;";
        tabela= conConexao.RetornarResultset(sql);
        return tabela;
    }
    
    
    
    
}
