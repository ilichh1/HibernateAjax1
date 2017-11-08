/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

import org.generation.dao.UsuarioDAO;
import org.generation.pojo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ilich Arredondo
 */
public class NewEmptyJUnitTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        System.out.println(usuarioDAO.getTipoUsuario(1).getTipoUsuario());
    }
}
