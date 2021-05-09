package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        for (User acc : users.keySet()) {
            users.get(acc);
        }
        if (!users.containsKey(account)) {
            users.put(user, (List<Account>) account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport()
                    .equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        for (User user : users.keySet()) {
            if (user.getPassport()
                    .equals(passport) && account.getRequisite()
                    .equals(requisite)) {
                return account;
            }
        }
        return null;
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
