package com.example.application.views.helloworld;

import com.example.application.data.service.CrmService;
import com.example.application.views.MainLayout;
import com.example.application.views.list.UserRegistration;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import jakarta.annotation.security.PermitAll;

@PageTitle("Hello World")
@Route(value = "hello-world", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PermitAll
public class HelloWorldView extends HorizontalLayout {

    private final CrmService service;
    private TextField name;
    private Button sayHello;
    UserRegistration form;

    public HelloWorldView(CrmService service) {
        this.service = service;
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        configureForm();

        add(name, sayHello,getContent());
    }

    private Component getContent() {
        HorizontalLayout content = new HorizontalLayout(form);
        content.setAlignItems(Alignment.CENTER);
        content.addClassName("content");
        content.setSizeFull();

        return content;
    }

    private void configureForm() {
        form = new UserRegistration();
        form.setWidth("25em");
    }
}
