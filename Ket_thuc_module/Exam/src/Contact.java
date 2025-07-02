public class Contact {
    private String phoneNumber;
    private String groupContact;
    private String fullName;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public Contact(String phoneNumber, String groupContact, String fullName, String gender, String address, String birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.groupContact = groupContact;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }
    public String toString(){
        return phoneNumber + "," + groupContact + "," + fullName + "," + gender + "," + address + "," + birthday + "," + email;
    }
    public void displayContact(){
        System.out.printf("SĐT: %s | Nhóm: %s | Họ tên: %s | Giới tính: %s | Địa chỉ: %s | Ngày sinh: %s | Email: %s%n",
                phoneNumber, groupContact, fullName, gender, address, birthday, email);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupContact() {
        return groupContact;
    }

    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
