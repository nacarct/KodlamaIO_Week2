package HomeWorkWeek2;

public class Main {

    public static void main(String[] args) {

        // MenuBar ---------------------------------------------------------------------------------------
        MenuBar menuBar1 = new MenuBar(1,"Kurslarım","/courses/enrolled");
        MenuBar menuBar2 = new MenuBar(1,"Tüm Kurslar","/courses");
        MenuBar menuBar3 = new MenuBar(1,"Kampa Hazırlık","/p/kampa-hazirlik");
        MenuBar menuBar4 = new MenuBar(1,"Sık Sorulan Sorular","/p/sorular");

        MenuBar[] menuBars = {menuBar1, menuBar2, menuBar3, menuBar4};

        if (menuBars.length>0){
            for (MenuBar menuBar:menuBars) {
                System.out.println(menuBar.menuName);
            }
        }

        MenuBarManager menuBarManager = new MenuBarManager();

        menuBarManager.MenuBarClick("Kurslarım");



        // Course ---------------------------------------------------------------------------------------
        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs");

        Course[] courses = {course1, course2, course3};

        if (courses.length>0){
            for (Course course:courses) {
                System.out.println(course.courseName);
            }
        }

        CourseManager courseManager = new CourseManager();

        courseManager.JoinCourse();

    }
}
