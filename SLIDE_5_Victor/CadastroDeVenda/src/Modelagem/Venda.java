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
    private int codigo;
    private String nomeVendedor, nomeProduto;
    
    Conexao conConexao = new Conexao();

    public Venda() {
    }

    public Venda(int codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
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
        sql = "INSERT INTO consultaVenda(codigo, nomeVendedor, nomeproduto) VALUES ("+getCodigo()+", '"+getNomeVendedor()+"', '"+getNomeProduto()+"')";
        conConexao.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
        
    }
    
     public ResultSet listarVenda() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select codigo, nomeVendedor, nomeproduto from consultaVenda;";
        tabela= conConexao.RetornarResultset(sql);
        return tabela;
    }
}
