package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

public class UserRegistration extends FormLayout {

    TextField name = new TextField("Nome");
    TextField surname = new TextField("Cognome");
    TextField username = new TextField("Username");
    EmailField email = new EmailField("E-mail");

    Button save = new Button();

    RadioButtonGroup<String> gender = new RadioButtonGroup<>();


    public UserRegistration() {
        addClassName("user-form");

        gender.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        gender.setLabel("Genere");
        gender.setItems("Uomo","Donna");
        add(
                name,
                surname,
                username,
                email,
                gender,
                createButtonLayout()
        );
    }

    private Component createButtonLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        save.addClickShortcut(Key.ENTER);
        //return new HorizontalLayout(save);
        return save;
    }
}
