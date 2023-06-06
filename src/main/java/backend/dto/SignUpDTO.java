package backend.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SignUpDTO {
    private Long id;
    @NotEmpty
    @Size(min = 1, max = 30)
    private String name;
    @NotEmpty
    @Size(min = 1, max = 10)
    private String userName;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 8, max = 20)
    private String password;

    public SignUpDTO() {
    }

    public SignUpDTO(Long id, String name, String userName, String email, String password) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
