package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dell Inspiron on 30/11/2016.
 */
public class LoginGeneratorTest {

    LoginGenerator loginGenerator;
    LoginService loginService;

    @Before
    public void setUp() throws Exception {
        System.out.println("je suis execute avant chaque test");
        loginService = new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String pdur = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        Assert.assertEquals("PDUR", pdur);
        Assert.assertEquals(true, loginService.loginExists("PDUR"));
    }

}