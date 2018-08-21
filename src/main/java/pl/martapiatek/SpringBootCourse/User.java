package pl.martapiatek.SpringBootCourse;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;


}
