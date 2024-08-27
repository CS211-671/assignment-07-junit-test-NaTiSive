package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("Nat","12345");
        userList.addUser("Jay","11111");
        userList.addUser("Kon","22222");



        // TODO: find one of them
        User user = userList.findUserByUsername("Nat");
        // TODO: assert that UserList found User
        String expected = "Nat";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();

        userList.addUser("Nat","12345");
        userList.addUser("Jay","11111");
        userList.addUser("Kon","22222");

        // TODO: change password of one user
        boolean actual = userList.changePassword("nat","12345","00000")

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();

        userList.addUser("Nat","12345");
        userList.addUser("Jay","11111");
        userList.addUser("Kon","22222");

        // TODO: call login() with correct username and password
        User user = userList.login("Jay","11111");

        // TODO: assert that User object is found
        String expected = "Jay";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList userList = new UserList();

        userList.addUser("Nat","12345");
        userList.addUser("Jay","11111");
        userList.addUser("Kon","22222");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("I Show Speed","11111");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}