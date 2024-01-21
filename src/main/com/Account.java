package main.com;

import java.util.Objects;

public class Account {
    private static long nextID = 0;

    private String name;
    private long id;

    /**
     * Builds an account with a given name.
     * @param name the name associated with the account
     */
    public Account(String name) {
        this.name = name;
        this.id = getNextID();
    }

    private long getNextID() {
        return nextID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return id == account.id && Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

