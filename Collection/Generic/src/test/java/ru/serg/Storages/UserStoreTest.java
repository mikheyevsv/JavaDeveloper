package ru.serg.Storages;

import org.junit.Test;
import ru.serg.Employe.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 07.09.2016.
 */
public class UserStoreTest {

    private UserStore userStore = new UserStore(5);

    @Test
    public void addOneShouldTrue(){
        User user = new User();
        user.setId("one");

        boolean res = userStore.add(user);

        assertThat(res, is(true));
    }

    @Test
    public void deleteOneShouldFalse() {
        User user = new User();
        user.setId("one");

        userStore.add(user);

        boolean res = userStore.delete("one");

        assertThat(res, is(false));
    }

}