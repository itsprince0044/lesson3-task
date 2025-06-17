abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing appetizer..."); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Cooking main course..."); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Pouring beverage..."); }
}

