public class Person {
    int phoneNumber;
    String firstName;
    String secondName;

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    String getFirstName(){
        return firstName;
    }

    void setSecondName(String secondName){
        this.secondName = secondName;
    }

    String getSecondName(){
        return secondName;
    }

    int getPhoneNumber(){ return phoneNumber;
    }

    void setPhoneNumber(int phoneNumber){this.phoneNumber = phoneNumber;}
}
