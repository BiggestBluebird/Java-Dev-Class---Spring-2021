package com.batson_java_course_2021.Week_05;

public class Controller {
    private Model model;

    public Controller(Model m) {
        this.model = m;
    }

    public String modifyText(String t) {
        this.model.setText(t);
        return this.model.getText();
    }
}