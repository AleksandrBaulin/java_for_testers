package ru.stqa.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TriangleTests {
    @Test
    void canCalculatedPerimeter() {
        Assertions.assertEquals( 12, Triangle.perimeter(3.0, 4.0, 5.0));
    }
    @Test
    void canCalculatedArea() {
        Assertions.assertEquals( 6, Triangle.area(3.0, 4.0, 5.0));

    }
}
