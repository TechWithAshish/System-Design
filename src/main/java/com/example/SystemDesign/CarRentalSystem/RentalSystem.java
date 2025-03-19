package com.example.SystemDesign.CarRentalSystem;

import com.example.SystemDesign.CarRentalSystem.Store.Store;
import com.example.SystemDesign.CarRentalSystem.User.User;

import java.util.List;

public class RentalSystem {
    List<User> userList;
    List<Store> storeList;

    public RentalSystem(List<User> userList, List<Store> storeList) {
        this.userList = userList;
        this.storeList = storeList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
