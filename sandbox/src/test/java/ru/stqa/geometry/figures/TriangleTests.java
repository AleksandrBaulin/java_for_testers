package ru.stqa.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTests {
    @Test
    void canCalculatedPerimeter() {
        var t = new Triangle(3.0, 4.0, 5.0);
        var result = t.perimeter();
        Assertions.assertEquals( 12, result);
    }
    @Test
    void canCalculatedArea() {
        var t = new Triangle(3.0, 4.0, 5.0);

        Assertions.assertEquals( 6, t.area());

    }
}
