package com.project.clapp.impl;


import com.google.firebase.database.DatabaseReference;
import com.project.clapp.models.User;

import java.util.ArrayList;

/**
 * Created by Afonso on 11/03/2018.
 */

public interface IUser {

    User getUser(String name);

    void addUser(String userId, String mail);

    ArrayList<User> getUserList();

    void addToFirebase(DatabaseReference dr, User user);

    void removeUser(String name);

    void getUsers(User user);

    void clearUsers();
}
