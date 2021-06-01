package ro.ase.csie.cts.g1088.tema3.prototype;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestServerPrototype {

	Server server1 = new Server("100.0.0.1", "PC", "centralizeaza email-urile");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrototype() throws CloneNotSupportedException {
		Server server2 = (Server) server1.clone();
		Server server3 = (Server) server1.clone();
	}
}
