package at.ac.fhcampuswien.generics;

import java.util.Objects;

public class Account {

    // unique id
    private final long ID;
    private static long nextID = 1;

    private double balance;
    private String owner;

    public Account(double balance, String owner) {
        this.ID = nextID++;
        this.balance = balance;
        this.owner = owner;
    }

    public long getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return this.ID + " " + getOwner() + " hash: " + super.toString();
    }

    public String getOwner() {
        return owner;
    }


    @Override
    public boolean equals(Object obj) {
        // two accounts are equal if they have the same owner
        if (obj instanceof Account) {
            Account account = (Account) obj;
            return this.owner.equals(account.owner);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.owner);
    }
}
