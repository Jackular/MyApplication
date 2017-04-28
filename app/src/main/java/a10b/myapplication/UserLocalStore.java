package com.example.tom.loginregister;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Tom on 17/02/2017.
 */

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("firstname",user.firstname);
        spEditor.putString("surname",user.surname);
        spEditor.putString("email",user.email);
        spEditor.putString("password",user.password);
        spEditor.commit();
    }

    public User getLoggedInUser(){
        String firstname = userLocalDatabase.getString("firstname", "");
        String surname = userLocalDatabase.getString("surname", "");
        String email = userLocalDatabase.getString("email", "");
        String password = userLocalDatabase.getString("password", "");

        User storedUser = new User(firstname, surname, email, password);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if (userLocalDatabase.getBoolean("loggedIn", false) == true){
            return true;
        }else{
            return false;

        }


    }


    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();


    }










}
