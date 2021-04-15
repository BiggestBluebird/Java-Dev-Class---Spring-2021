package com.batson_java_course_2021.Week_05;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
    }

    public Application() {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        view.setVisible(true);
    }
}