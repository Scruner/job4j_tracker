package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
       out.println("===Edit item===");
        int id = input.askInt("Enter items id:");
        String name = input.askStr("Enter items name");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
           out.println("Заявка изменена успешно");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
