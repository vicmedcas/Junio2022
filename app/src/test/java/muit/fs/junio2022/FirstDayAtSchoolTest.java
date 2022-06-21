package muit.fs.junio22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();

	@BeforeEach
	public void cleanBag() {
		school.cleanMyBag();
	}

	@Test
	public void testConstructor() {
		FirstDayAtSchool newschool = new FirstDayAtSchool();
		assertNotNull(newschool, "Object not created");
		int pens = newschool.getNumberOf("Pens");
		assertEquals(1, pens, "The number of pens is not the expected");
		int notebooks = newschool.getNumberOf("Notebooks");
		assertEquals(1, notebooks, "The number of Notebooks is not the expected");
		Set<String> keys = newschool.getThings();
		assertEquals(2, keys.size(), "The number of things is not the expected");

	}

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		school.prepareMyBag();
		assertEquals(1, school.getNumberOf("Pens"), "The number of pens is not the expected");
		assertEquals(1, school.getNumberOf("Notebooks"), "The number of Notebooks is not the expected");
	}

	@Test
	public void testAddElements() {
		System.out.println("Inside testAddElements()");
		school.addThings("Pens", 3);
		assertEquals(3, school.getNumberOf("Pens"), "The number of pens is not the expected");
		school.addThings("Pens", 3);
		assertEquals(6, school.getNumberOf("Pens"), "The number of pens is not the expected");
	}

	@Test
	public void testCleanBag() {
		System.out.println("Inside testCleanBag()");
		school.addThings("Pens", 3);
		school.cleanMyBag();
		assertEquals(0, school.getNumberOf("Pens"), "The number of pens is not the expected");
	}

}