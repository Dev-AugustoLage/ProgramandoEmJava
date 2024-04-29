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
    
    private int codigo;
    private String nome, descricao;
    
    Conexao conConexao = new Conexao();

    public Produto() {
    }

    public Produto(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
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
        sql = "INSERT INTO consultaProduto(codigo, nome, descricao) VALUES ("+getCodigo()+", '"+getNome()+"', '"+getDescricao()+"')";
        conConexao.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
    
     public ResultSet listarProduto() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select codigo, nome, descricao from consultaProduto;";
        tabela= conConexao.RetornarResultset(sql);
        return tabela;
    }
    
}
