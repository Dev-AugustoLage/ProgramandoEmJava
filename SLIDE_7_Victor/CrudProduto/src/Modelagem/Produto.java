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
public class Produto {
    private int codigo, id;
    private String nome, descricao;
    
    Conexao con = new Conexao();

    public Produto() {
    }

    public Produto(int id, int codigo, String nome, String descricao) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto() {
        String sql;
        sql = "INSERT INTO consultaProduto(codigo, nome, descricao) VALUES ("+getCodigo()+", '"+getNome()+"', '"+getDescricao()+"');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
        
     public ResultSet ListarProduto() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from consultaProduto;";
        tabela= con.RetornarResultset(sql);
        return tabela;
    }
     
     public void excluir(){
        String sql;
        sql= "Delete from consultaProduto where id="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="Update consultaProduto set codigo="+getCodigo()+", nome='"+getNome()+"', descricao='"+getDescricao()+"' where id="+getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
    
}
