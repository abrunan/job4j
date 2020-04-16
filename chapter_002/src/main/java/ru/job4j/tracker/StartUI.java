package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartUI {
    public static void main(String[] args) {
        Input input = new ValidateInput(new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(Arrays.asList(
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindIdAction(),
                new FindNameAction(),
                new ExitAction()
        ));
        new StartUI().init(input, tracker, actions);
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select action: ", actions.size() - 1);
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu:");
        for (int i = 0; i < actions.size(); i++) {
            System.out.printf("%s. %s", i, actions.get(i).name());
            System.out.println();
        }
    }
}
