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

        userList.addUser("nat","12345");
        userList.addUser("jay","11111");
        userList.addUser("kon","22222");



        // TODO: find one of them
        userList.findUserByUsername("nat");

        // TODO: assert that UserList found User
        UserList UserList = new UserList();
        String expected = "nat";
        String actual = User.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();

        userList.addUser("nat","12345");
        userList.addUser("jay","11111");
        userList.addUser("kon","22222");

        // TODO: change password of one user
        boolean actual = userList.changePassword("nat",""12345,"00000")

        // TODO: assert that user can change password
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList userList = new UserList();

        userList.addUser("nat","12345");
        userList.addUser("jay","11111");
        userList.addUser("kon","22222");

        // TODO: call login() with correct username and password
        User

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList userList = new UserList();

        userList.addUser("nat","12345");
        userList.addUser("jay","11111");
        userList.addUser("kon","22222");

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}