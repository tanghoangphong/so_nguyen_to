package so_nguyen_to;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class so_nguyen_toTest {

	private check N;
	  private so_nguyen_to snt= new so_nguyen_to();
	  private int number=9;
	    @Before
	    public void setUp() {
	        N = new check();
	        snt.setResult(number);
	    }

	    @Test
	    public void unitTestCase_9() {
	  
	        assertEquals(0, N.kiemtrasonguyento(number));	      
	    }
	    @Test
	    public void unitTestCase_12() {
	  
	        assertEquals(0, N.kiemtrasonguyento(12));	      
	    }
	    @Test
	    public void unitTestCase_13() {
	  
	        assertEquals(1, N.kiemtrasonguyento(13));	      
	    }
	    @Test
	    public void unitTestCase_19() {
	  
	        assertEquals(1, N.kiemtrasonguyento(19));	      
	    }
	    @Test
	    public void unitTestCase_55() {
	  
	        assertEquals(0, N.kiemtrasonguyento(55));	      
	    }
	    @Test
	    public void unitTestCase_99() {
	  
	        assertEquals(0, N.kiemtrasonguyento(99));	      
	    }
	    @Test
	    public void unitTestCase_211() {
	  
	        assertEquals(1, N.kiemtrasonguyento(211));	      
	    }
	    @Test
	    public void IntegrationTest() {
	  
	        assertEquals("False", snt.getResult());	      
	    }

}
