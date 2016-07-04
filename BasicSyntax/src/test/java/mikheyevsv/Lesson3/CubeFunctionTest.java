package mikheyevsv.Lesson3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by Serg on 24.02.2016.
 */
public class CubeFunctionTest {

    @Test
    public void calculate(){
        CubeFunction cube = new CubeFunction(1, 1, 1);
             float res = cube.calculate(1);
        assertThat(3F, is(equalTo(res)));
    }
}
