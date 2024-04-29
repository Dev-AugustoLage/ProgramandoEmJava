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
    private int id;
    private String nome, email, login, senha;
    
    Conexao con = new Conexao();

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }

        
     public ResultSet ListarUsuario() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select id,nome,email,login,senha from usuarios;";
        tabela= con.RetornarResultset(sql);
        return tabela;
    }
     
     public void excluir(){
        String sql;
        sql= "Delete from usuarios where id="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="Update usuarios set nome='"+ getNome()+"',email='"+getEmail()+"',login='"+getLogin()+"', senha='"+getSenha()+"' where id = "+getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
        
    }
}
    

