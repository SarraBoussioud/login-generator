package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Dell Inspiron on 30/11/2016.
 */
public class LoginServiceTest {

    String [] logins = {"sarra1", "sarra2"};
    LoginService loginService;
    ArrayList<String> login;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(logins);
        login = new ArrayList<String>();
        System.out.println("je suis execute avant chaque test");
    }

    @Test
    public void loginExists() throws Exception {
        Assert.assertEquals(true, loginService.loginExists("sarra1"));
    }

    @Test
    public void addLogin() throws Exception {
        loginService.addLogin("sarra3");
        Assert.assertEquals(true, loginService.loginExists("sarra3"));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        ArrayList<String> vide = new ArrayList<String>();
        login.add("sarra1");
        login.add("sarra2");
        Assert.assertEquals(login, loginService.findAllLoginsStartingWith("sarra"));
        Assert.assertEquals(vide, loginService.findAllLoginsStartingWith("b"));
    }

    @Test
    public void findAllLogins() throws Exception {
        login.add("sarra1");
        login.add("sarra2");
        Assert.assertEquals(login, loginService.findAllLogins());
    }

}