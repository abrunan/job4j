package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllThenFound() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test0");
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> all = tracker.findAll();
        assertThat(all.get(0).getName(), is(item0.getName()));
        assertThat(all.get(1).getName(), is(item1.getName()));
        assertThat(all.get(2).getName(), is(item2.getName()));
    }

    @Test
    public void whenFindByNameThenFound() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test0");
        Item item1 = new Item("test1");
        Item item2 = new Item("test0");
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> result = tracker.findByName("test0");
        for (Item item : result) {
            assertThat(item.getName(), is("test0"));
        }
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}
