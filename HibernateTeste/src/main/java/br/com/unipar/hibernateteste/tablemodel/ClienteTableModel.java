package br.com.unipar.hibernateteste.tablemodel;

import br.com.unipar.hibernateteste.model.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteTableModel extends DefaultTableModel{

    public ClienteTableModel() {
        this.addColumn("Codigo");
        this.addColumn("Nome");
        this.addColumn("E-mail");
        this.addColumn("Status");
    }
    
    public ClienteTableModel(List<Cliente> listaClientes){
        this();
        for (Cliente c : listaClientes) {
            this.addRow(new String[]{
                String.valueOf(c.getId_cliente()),
                c.getNome(),
                c.getEmail(),
                String.valueOf(c.isAtivo())
            });
        }
    }
    
    public Cliente getSelectedCliente(JTable table, List<Cliente> clientes){
        int rowIndex = table.getSelectedRow();
        if (rowIndex < 0) {
            return null;
        }
        
        Object idObj = table.getValueAt(rowIndex, 0);
        Long id = Long.valueOf(idObj.toString());
        
        for(Cliente c : clientes) {
            if (c.getId_cliente() == id) {
                return c;
            }
        }
        
        return null;
    }    
    
}
