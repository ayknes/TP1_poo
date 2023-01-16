package Maven.TP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void nouveauVisiteur() {
        Zoo zoo = new Zoo(20);


        LimiteVisiteurException thrown = Assertions.assertThrows(LimiteVisiteurException.class, () -> {
            zoo.nouveauVisiteur();
        });

        assertEquals("vous avez depaser la capaciter", thrown.getMessage());
    }

    @Test
    void nouvelAnimal() {

    }
}