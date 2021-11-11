package pojos;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String role;
    private String department;

    public User(String id, String firstName, String lastName, String role, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("id: %s | firstname: %s | lastname: %s | role: %s | department: %s",
                id, firstName, lastName, role, department);

    }
}
