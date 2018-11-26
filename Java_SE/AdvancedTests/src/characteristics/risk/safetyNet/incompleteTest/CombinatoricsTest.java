package characteristics.risk.safetyNet.incompleteTest;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CombinatoricsTest {

	@Test
	public void testFactorial() {
		assertThat(Combinatorics.factorial(0), is(1L));
		assertThat(Combinatorics.factorial(1), is(1L));
		assertThat(Combinatorics.factorial(2), is(2L));
		assertThat(Combinatorics.factorial(3), is(6L));
		assertThat(Combinatorics.factorial(4), is(24L));
		assertThat(Combinatorics.factorial(5), is(120L));
	}

}


