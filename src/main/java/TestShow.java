import static org.junit.Assert.assertThat;
import static org.hamcrest.Matcher.*; 
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;


public class TestShow {

	@Test
	public void test3() {
		String z = new Hello().show(3);         
        assertThat(z, is("Fizz"));  
	}
	
	@Test
	public void test5() {
		String z = new Hello().show(5);         
        assertThat(z, is("Buzz"));  
	}
	
	@Test
	public void test13() {
		String z = new Hello().show(13);         
        assertThat(z, is("Fizz"));  
	}
	@Test
	public void test15() {
		String z = new Hello().show(15);         
        assertThat(z, is("FizzBuzz"));  
	}
	@Test
	public void test35() {
		String z = new Hello().show(35);         
        assertThat(z, is("FizzBuzz"));  
	}
}
