package ru.job4j.collections;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
	@Test
	public void whenCompareByNameAndPriority() {
		Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
		int res = cmpNamePriority.compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(res, lessThan(0));
	}

	@Test
	public void whenSameNameComparePriority() {
		Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
		int res = cmpNamePriority.compare(
				new Job("Impl task", 1),
				new Job("Impl task", 0)
		);
		assertThat(res, lessThan(0));
	}

	@Test
	public void whenCompareByPriorityAndName() {
		Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
		int res = cmpNamePriority.compare(
				new Job("Impl task", 0),
				new Job("Fix bug", 1)
		);
		assertThat(res, greaterThan(0));
	}
}
