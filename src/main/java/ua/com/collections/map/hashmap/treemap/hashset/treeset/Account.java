package ua.com.collections.map.hashmap.treemap.hashset.treeset;

import java.util.Objects;

public class Account {
    private Integer amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void income(Integer amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "" + amount + '$';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(amount, account.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
