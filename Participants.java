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
        this.registrationId = String.format("vit_%d", ++counter);
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

    public String toString() {
        return String.format(
                "Registration ID = %s\n" +
                        "Branch = %s\n" +
                        "Contact Number = %d\n" +
                        "Name = %s\n",
                this.registrationId, this.branch, this.contactNumber, this.name);
    }
}

class App {
    public static void main(String[] args) {
        CParticipant om = new CParticipant("Om", 9834729573L, "CS");
        CParticipant kunal = new CParticipant("Kunal", 7685038493L, "CS");
        System.out.println(om);
        System.out.println(kunal);

        CParticipant.setCounter(34);
        CParticipant shashank = new CParticipant("Shashank", 8694847284L, "CS");
        System.out.println(shashank);

    }
}