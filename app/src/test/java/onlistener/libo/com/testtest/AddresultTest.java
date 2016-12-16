package onlistener.libo.com.testtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/12/16.
 */
public class AddresultTest {
    Addresult addresult;

    @Before
    public void setUp() throws Exception {
        addresult = new Addresult();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(4.0,addresult.sum(2.0,2.0),0);
    }

    @Test
    public void substract() throws Exception {

    }

    @Test
    public void divide() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

    }

}