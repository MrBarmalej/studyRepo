package Lesson33;

import java.util.Objects;

public class ObjectHW implements Cloneable {
    private String name;
    private int age;
    private String email;

    public ObjectHW(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectHW user = (ObjectHW) obj;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectHW originalUser = new ObjectHW("John", 25, "john@example.com");
            ObjectHW clonedUser = (ObjectHW) originalUser.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
