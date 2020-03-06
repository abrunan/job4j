package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        String[] answers = {"Bruh, my PC is broken..."};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Bruh, my PC is broken...");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bruh!");
        tracker.add(item);
        String[] answers = {
                item.getId(),
                "Bruh, you've been replaced!"
        };
        Input input = new StubInput(answers);
        StartUI.replaceItem(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Bruh, you've been replaced!"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bruh!");
        tracker.add(item);
        String[] answer = { item.getId() };
        Input input = new StubInput(answer);
        StartUI.deleteItem(input, tracker);
        String expected = null;
        assertThat(tracker.findById(item.getId()), is(expected));
    }
}
