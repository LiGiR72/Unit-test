import org.junit.jupiter.api.*;

@DisplayName("Тестируем")
public class MagicBoxTest {
    private  MagicBox<String> box;

    @Test
     void addNull() {
        Assertions.assertFalse(box.add(null));
    }

    @Test
     void addItem(){
        box.add("item");
        Assertions.assertArrayEquals(box.box, new String[]{"item", null, null});

    }
    @Test
    void emptyBoxException(){

        Assertions.assertThrows(RuntimeException.class, box::pick);
    }



    @BeforeEach
    void setBox() {
        box = new MagicBox<String>(3);
    }


}
