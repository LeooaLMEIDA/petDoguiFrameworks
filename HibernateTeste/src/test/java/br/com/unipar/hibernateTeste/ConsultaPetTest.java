
package br.com.unipar.hibernateTeste;

import br.com.unipar.hibernateteste.model.Agendamento;
import org.junit.Test;
import static org.junit.Assert.*;

/* @author leoal */
public class ConsultaPetTest {
    
   @Test
   public void testSoma(){
       int a = 2 ;
       int b = 3;
       
       int resultado = Agendamento.soma(a,b);
       
       assertEquals(5, resultado);
   }

}
