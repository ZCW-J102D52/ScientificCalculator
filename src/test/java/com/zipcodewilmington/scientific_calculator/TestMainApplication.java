package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Scientific;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
/*public class TestMainApplication { scanner scanner = new scanner

        public satic Intetger getIntegerInput(String promo)
}
//switch case // if
//operater says what method you call*/

public class TestMainApplication {
        @Test
        public void testFactorial() {
                Scientific test = new Scientific();
                double result = test.factorial(4);
                assertEquals(24.0, result, 0.001);

        }
}

