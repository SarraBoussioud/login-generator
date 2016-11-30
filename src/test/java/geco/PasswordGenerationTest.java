package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dell Inspiron on 30/11/2016.
 */
public class PasswordGenerationTest {
    PasswordGeneration passwordGeneration;

    @Before
    public void setUp() throws Exception {
        passwordGeneration = new PasswordGeneration();
        System.out.println("je suis exécuté avant chaque test");
    }

    @Test
    public void getRandomPassword() throws Exception {
        String mdp = passwordGeneration.getRandomPassword();
        Assert.assertEquals(8, mdp.length());
    }

}