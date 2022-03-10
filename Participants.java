import java.util.Date;

class CParticipant {
    static int counter = 0;
    String name;
    long contactNumber;
    String branch;
    String registrationId;

    CParticipant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        this.registrationId = String.format("vit_%d_%s", ++counter,
                new Date().toString().replace(" ", "_").replace(":", "_"));
    }

    String getRegistrationId() {
        return registrationId;
    }

    int getCounter() {
        return counter;
    }

    static void setCounter(int c) {
        counter = c;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    long getContactNumber() {
        return contactNumber;
    }

    void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    String getBranch() {
        return branch;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }
}

class App {
    public static void main(String[] args) {
        CParticipant cParticipant = new CParticipant("Om", 9834729573L, "CS");
        System.out.printf("Registration ID = %s\n", cParticipant.registrationId);
        System.out.printf("Branch = %s\n", cParticipant.branch);
        System.out.printf("Contact Number = %d\n", cParticipant.contactNumber);
        System.out.printf("Name = %s\n", cParticipant.name);
    }
}