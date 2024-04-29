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
public class Venda {
    private int codigo, id;
    private String nomeVendedor, nomeProduto;
    
    Conexao con = new Conexao();

    public Venda() {
    }

    public Venda(int codigo, int id, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.id = id;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
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

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public void cadastrarVenda() {
        String sql;
        sql = "INSERT INTO consultaVenda(codigo, nomeVendedor, nomeproduto) VALUES ("+getCodigo()+", '"+getNomeVendedor()+"', '"+getNomeProduto()+"');";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
        
     public ResultSet ListarVenda() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from consultaVenda;";
        tabela= con.RetornarResultset(sql);
        return tabela;
    }
     
     public void excluir(){
        String sql;
        sql= "Delete from consultaVenda where id="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar(){
        String sql;
        sql="Update consultaVenda set codigo="+getCodigo()+", nomeVendedor='"+getNomeVendedor()+"', nomeproduto='"+getNomeProduto()+"' where id="+getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
    
}
