package hillel.constants.entity;

import java.sql.Date;

public class Actor extends Entity {

    private String name;
    private String surname;
    private java.util.Date birthday;

    public Actor(int id, String name, String surname, Date birthday) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return (Date) birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + birthday + " ";
    }
}
