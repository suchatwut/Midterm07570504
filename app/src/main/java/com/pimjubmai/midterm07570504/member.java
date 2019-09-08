package com.pimjubmai.midterm07570504;

public class member {
    private static final String Username = "aaa";
    private static final String Password = "111";



    private String mUsername;
    private String mPassword;



    public member(String Username, String Password) {
        this.mUsername = Username;
        this.mPassword = Password;
    }


    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
    public boolean check() {
        if(getmUsername().equals(Username) && getmPassword().equals(Password)){
            return true;
        }else{
            return false;
        }
    }


}
