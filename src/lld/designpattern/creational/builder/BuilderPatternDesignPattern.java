package lld.designpattern.creational.builder;


//step by step set all the properties
//for immutable object
public class BuilderPatternDesignPattern {
    public static void main(String a[]){
        User neeraj = new User.UserBuilder().setUserName("Neeraj").setEmailId("nirajsonu7@gmail.com").setUserId("N001").build();
        System.out.println(neeraj);
    }
}

class User{
    private String userId;
    private String userName;
    private String emailId;

    private User(UserBuilder userBuilder){
        this.userId=userBuilder.userId;
        this.userName=userBuilder.userName;
        this.emailId=userBuilder.emailId;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    //inner class to create an object
    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder(){

        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserId(String userId){
            this.userId=userId;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}