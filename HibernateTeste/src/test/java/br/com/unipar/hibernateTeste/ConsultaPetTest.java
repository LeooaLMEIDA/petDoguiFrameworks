
package br.com.unipar.hibernateTeste;

import br.com.unipar.hibernateteste.model.Cidade;
import br.com.unipar.hibernateteste.model.dao.CidadeDAO;
import br.com.unipar.hibernateteste.model.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/* @author leoal */
public class ConsultaPetTest {
    
   @Test
   public void testRetornoCidade(){
        EntityManagerUtil.getEntityManagerFactory();
       
        CidadeDAO daoCidade = new CidadeDAO();
        ArrayList<Cidade> listaCidade = (ArrayList<Cidade>) daoCidade.findAll();
        
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(listaCidade.size()-1);
        
        System.out.println(numeroAleatorio);
        
        Cidade testCidade = listaCidade.get(numeroAleatorio);
        
        Cidade cidadeRetorno = daoCidade.findByNome(testCidade.getNome());
        assertEquals(testCidade, cidadeRetorno);
   }

}
