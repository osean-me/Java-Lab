package com.spring.basic.chapter_10_Data_Binding;

import java.beans.PropertyEditorSupport;

public class UserEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        User user = (User) getValue();
        return user.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new User(Integer.parseInt(text)));
    }
}
