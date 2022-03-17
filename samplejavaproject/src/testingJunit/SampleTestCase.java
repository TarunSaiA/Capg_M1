package testingJunit;

import org.junit.Test;


	

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Assert;

	public class SampleTestCase {
		Arithmetic am = new Arithmetic();
		
		@Test
		public void testAdd() {
			Assert.assertEquals(8, am.add(2, 6));
		}
		
		@Test
		public void testSubtract() {
			Assert.assertEquals(-4, am.subtract(2, 6));
		}
		
		@Before
		public void testBefore() {
			System.out.println("Before the test");
		}
		
		@After
		public void testAfter() {
			System.out.println("After the test");
		}
		
		@BeforeClass
		public static void testBeforeClass() {
			System.out.println("Before the class");
		}
		
		@AfterClass
		public static void testAfterClass() {
			System.out.println("After the class");
		}

	}


