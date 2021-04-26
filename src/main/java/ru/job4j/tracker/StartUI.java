package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter items name");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавлена заявка: " + item);
    }

    public static void findAllItems(Tracker tracker) {
        System.out.println("===Show all items===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("===Edit item===");
        int id = Integer.valueOf(input.askStr("Enter items id:"));
        String name = input.askStr("Enter items name");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("===Delete item===");
        int id = Integer.valueOf(input.askStr("Enter items id:"));
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Ошибка удаления заявки");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("===Find item by Id===");
        int id = Integer.valueOf(input.askStr("Enter items id:"));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("===Find item by name===");
        String name = input.askStr("Enter items name");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findByIdItem(input, tracker);
            } else if (select == 5) {
                findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}