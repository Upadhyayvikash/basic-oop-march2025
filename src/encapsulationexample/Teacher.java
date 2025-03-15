package encapsulationexample;

public class Teacher {
    private int id;
    private String name;
    private  String email;
    private String mobile;
    private String qualification;
    private String gender;

    public int getId() {
        return id;
    }
    //getter -  it gets the value
    // some lines added
    public void setId(int id) {
        this.id = id;
    }
    //setter - sets or assigns the values

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    // some lines added
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // toString - this will convert the object to the string

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", qualification='" + qualification + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
