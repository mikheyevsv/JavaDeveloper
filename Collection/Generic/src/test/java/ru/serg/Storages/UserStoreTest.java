package ru.serg.Storages;

import org.junit.Test;
import ru.serg.Employe.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 07.09.2016.
 */
public class UserStoreTest {

    private UserStore userStore = new UserStore(10);

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


    @Test
    public void updateOneShouldFalse() {
        User user = new User();
        user.setId("one");

        userStore.add(user);

        User user1 = new User();
        user.setId("two");

        boolean res = userStore.update(user1);

        assertThat(res, is(false));
    }

    @Test
    public void getFirstReturnNull(){

        User res = this.userStore.get("one");

        assertNull(res);
    }
}