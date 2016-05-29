package cz.iba.level5;


import java.util.Date;
import java.util.Objects;


/**
 *
 * @author Miroslava Voglova
 */
public class Student {
    private String name;
    private String nickname;
    private Date birthDate;
    private Gender gender;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.nickname);
        hash = 13 * hash + Objects.hashCode(this.birthDate);
        hash = 13 * hash + Objects.hashCode(this.gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", nickname=" + nickname + ", birthDate=" + birthDate + ", gender=" + gender + '}';
    }
    
    
}
