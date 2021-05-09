package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "test1", "1"});
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        Item item = tracker.findAll()
                .get(0);
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Create" + ln
                        + "1. Exit" + ln + "=== Create a new Item ====" + ln
                        + "Добавлена заявка: " + item + ln
                        + "Menu." + ln
                        + "0. Create" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenFindAllItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1"});
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("tes1"));
        List<UserAction> actions = Arrays.asList(
                new FindAllAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. ShowAll" + ln
                        + "1. Exit" + ln + "===Show all items===" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. ShowAll" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("newTest"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), replacedName, "1"});
        List<UserAction> actions = Arrays.asList(
                new ReplaceAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Replace" + ln
                        + "1. Exit" + ln + "===Edit item===" + ln
                        + "Заявка изменена успешно" + ln
                        + "Menu." + ln
                        + "0. Replace" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item());
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        List<UserAction> actions = Arrays.asList(
                new DeleteAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Delete" + ln
                        + "1. Exit" + ln + "===Delete item===" + ln
                        + "Заявка успешно удалена" + ln
                        + "Menu." + ln
                        + "0. Delete" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find by id item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        List<UserAction> actions = Arrays.asList(
                new FindByIdAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. FindById" + ln
                        + "1. Exit" + ln + "===Find item by Id===" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. FindById" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find item by name"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getName()), "1"});
        List<UserAction> actions = Arrays.asList(
                new FindByNameAction(out),
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. FindByName" + ln
                        + "1. Exit" + ln + "===Find item by name===" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. FindByName" + ln
                        + "1. Exit" + ln
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"9", "0"});
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0..0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}


