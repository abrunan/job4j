package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSinglesTest {

    @Test
    public void whenEnum() {
        TrackerSingleEnum tse = TrackerSingleEnum.INSTANCE;
        Tracker tracker0 = tse.getTracker();
        Tracker tracker1 = tse.getTracker();
        assertSame(tracker0, tracker1);
    }

    @Test
    public void whenInnerCl() {
        Tracker tracker0 = TrackerSingleInnerCl.getInstance();
        Tracker tracker1 = TrackerSingleInnerCl.getInstance();
        assertSame(tracker0, tracker1);
    }

    @Test
    public void whenInnerSF() {
        Tracker tracker0 = TrackerSingleSF.getInstance();
        Tracker tracker1 = TrackerSingleSF.getInstance();
        assertSame(tracker0, tracker1);
    }

    @Test
    public void whenInnerSFF() {
        Tracker tracker0 = TrackerSingleSFF.getInstance();
        Tracker tracker1 = TrackerSingleSFF.getInstance();
        assertSame(tracker0, tracker1);
    }

}
