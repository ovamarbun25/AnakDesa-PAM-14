package stud11418038.develops.aplikasianakdesa.UI.Models;

import java.util.List;

public class UserResponse {
    private String error;
    private List<User> users;

    public UserResponse(String error, List<User> users) {
        this.error = error;
        this.users = users;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
