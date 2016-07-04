package mikheyevsv.Lesson2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by Serg on 16.02.2016.
 */
public class TriangleTest {

   @Test
    public void areaTriangleTest(){

       Triangle triangle = new Triangle(new Point(8D, 7D), new Point(2D, 3D), new Point(3D, 5D));
       double res = triangle.areaTriangle();
       assertThat(4.000000000000011D, is(equalTo(res)));
   }
}
