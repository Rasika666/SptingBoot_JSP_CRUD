package com.hsenid.HRmanagementsystem.Model;

import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty(message = "Name cannot be Empty!!!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
