package HomeWorkWeek2;

public class MenuBar {

    public MenuBar(){
        System.out.println("Menu Bar constructor.");
    }

    public MenuBar(int menuID, String menuName, String menuLink){
        this();
        this.menuID=menuID;
        this.menuName=menuName;
        this.menuLink=menuLink;
    }

    int menuID;
    String menuName;
    String menuLink;
}
