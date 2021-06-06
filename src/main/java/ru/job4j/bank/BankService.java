package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу системы учёта банковских счетов клиентов
 *
 * @author ALEXEY VEDENISTOV
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение информации о клиенте осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента в базу, если он не зарегистрирован
     *
     * @param user новый клиент, который добавляется в базу
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый аккаунт (данные клиента), если он не
     * зарегистрирован в базе
     *
     * @param passport добавляются данные паспорта, если их нет в базе
     * @param account  добавляется аккаунт, если его нет в базе
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод производит поиск клиента, по паспортным данным
     *
     * @param passport паспортные данные клиента, по которым производится
     *                 поиск его в базе
     * @return возвращает найденного клиента или null, если клиент не найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(usr -> usr.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод производит поиск аккаунта клиента по паспортным данным и реквизитам
     *
     * @param passport  паспортные данные клиента, по которым производится
     *                  поиск его в базе
     * @param requisite реквизыты счёта клиента, по которым производится
     *                  поиск его в базе
     * @return возвращает найденный в базе аккаунт клиента или null, если
     * аккаунт не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(usr -> usr.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод производит перевод средств с одного счёта на другой, осуществляя
     * проверку
     * баланса на счёте отправителя для определения возможности перевода
     *
     * @param srcPassport   паспортные данные клиента со счёта которого будет
     *                      осуществляться
     *                      транзакция
     * @param srcRequisite  реквизиты счёта клиента с которого будет
     *                      осуществляться
     *                      транзакция
     * @param destPassport  паспортные данные клиента на счёт которого будет
     *                      осуществляться
     *                      транзакция
     * @param destRequisite реквизиты счёта клиента на который будет
     *                      осуществляться
     *                      транзакция
     * @param amount        сумма перевода
     * @return возвращает результат транзакции true - осуществлена, false -
     * не осуществлена
     */
    public boolean transferMoney(
            String srcPassport, String srcRequisite,
            String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (source != null && dest != null && source.getBalance() >= amount) {
            source.setBalance(source.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
