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
        List<Account> accounts = new ArrayList<>();
        if (user != null) {
            for (Account acc : accounts) {
                if (!accounts.contains(acc)) {
                    accounts.add(acc);
                }
            }
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
        User user = findByPassport(passport);
        List<Account> accounts = new ArrayList<>();
        if (user != null) {
            for (Account acc : accounts) {
                if (accounts.contains(acc.getRequisite())) {
                    return acc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(
            String srcPassport, String srcRequisite,
            String destPassport, String destRequisite, double amount) {
        User user = findByPassport(srcPassport);
        User user2 = findByPassport(destPassport);
        boolean rsl = false;
        List<Account> accounts = new ArrayList<>();
        if (user != null && user2 != null) {
            for (Account acc : accounts) {
                if (acc.getBalance() >= amount) {
                    user.set(amount)--;
                    user2.get(amount)++;
                    rsl = true;
                }
            }
        }
        return rsl;
    }
}
