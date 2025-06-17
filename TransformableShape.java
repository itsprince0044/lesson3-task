abstract class TransformableShape {
    abstract void resize();
    abstract void rotate();
}

class Square extends TransformableShape {
    void resize() { System.out.println("Resizing Square"); }
    void rotate() { System.out.println("Rotating Square"); }
}

class Circle extends TransformableShape {
    void resize() { System.out.println("Resizing Circle"); }
    void rotate() { System.out.println("Rotating Circle"); }
}
