package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(new User(user.getPassport()), new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = null;
        BankService bank = new BankService();
        bank.findByPassport(passport);
        if (!users.containsKey(account)) {
            users.put(new User(user.getPassport()), (List<Account>) account);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            user = (User) users.get(key);
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        BankService bank = new BankService();
        bank.findByPassport(passport);
        for (User use :
                users.keySet()) {
            String value = String.valueOf(users.get(use));
        }
        Account value = null;
        return value;
    }

    public boolean transferMoney(
            String srcPassport, String srcRequisite,
            String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        double balance = 0;
        if (users.containsKey(srcRequisite) || balance < amount) {
            rsl = true;
        }
        return rsl;
    }
}
