package br.com.unipar.hibernateteste;

import br.com.unipar.hibernateteste.model.Cliente;
import br.com.unipar.hibernateteste.model.dao.ClienteDAO;
import br.com.unipar.hibernateteste.model.util.EntityManagerUtil;
import br.com.unipar.hibernateteste.model.util.PetDoguiLog;

public class HibernateTeste {
    public static void main(String[] args) {
        EntityManagerUtil.getEntityManagerFactory();
//        
//        try{
//            new ClienteDAO().save(new Cliente());
//        }
//        catch(Exception ex){
//            PetDoguiLog.erroGeral(ex);
//        }
        Menu tela = new Menu();
        tela.setVisible(true);
    }
}