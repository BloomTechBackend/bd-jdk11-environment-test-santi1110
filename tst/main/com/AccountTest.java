package main.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountIDUniqueWithSameNameAccounts() {
        String name = "Sam";
        Account a1 = new Account(name);
        Account a2 = new Account(name);

        assertNotEquals(a1.getId(), a2.getId());
    }

    @Test
    void testAccountNameStoredFromConstructor() {
        String name1 = "Sam";
        String name2 = "3.14";
        Account a1 = new Account(name1);
        Account a2 = new Account(name2);

        assertEquals(name1, a1.getName());
        assertEquals(name2, a2.getName());
    }

    @Test
    void testAccountSetNameCorrectlyUpdates() {
        String originalName = "Sam";
        String changedName = "3.14";

        Account a1 = new Account(originalName);
        a1.setName(changedName);
        assertEquals(changedName, a1.getName());
    }
}