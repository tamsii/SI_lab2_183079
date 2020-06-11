import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 lala = new SILab2();
    private static User user1;
    private static User user2;
    private static User user3;
    private static User user4;
    private static User user5;
    private static User user6;
    private static User user7;
    private static User user8;
    private static List<String> allUsers1;
    private static List<String> allUsers2;

    @BeforeAll
    static void init(){
        System.out.println("Initializing the expected paramethars ");
        user1 = null;
        user2 = new User("Tamss", "Sakammecinja", "tamss.568@gmail.com");
        user3 = new User("Tamss2", "SakamKviki", "tamss.222.gmail.com");
        user4 = new User("Tams", "lalalalalala", "tams.la@hotmail,com");
        user5 = new User(null, "hsao", "hsao@gmail.com");
        user6 = new User(null, "Sonceto5", "jony.569@gmail.com");
        user7 = new User("Tamss", "SAkammecinja", "tamss.568@gmail.com");
        user8 = new User("Jony", "Sonceto5", null);
        allUsers1 = new ArrayList<>(5);
        allUsers2 = new ArrayList<>(2);
        allUsers2.add("Lola");
        allUsers2.add("Tamss");
    }

    @AfterAll
    static void destroy(){
        System.out.println("The tests are done");
    }

    @Test
    void EachStatementTests(){
        assertAll(
                () -> assertFalse(SILab2.function(user1, allUsers1)),
                () -> assertTrue(SILab2.function(user2, allUsers1)),
                () -> assertFalse(SILab2.function(user3, allUsers1)),
                () -> assertFalse(SILab2.function(user4, allUsers1)),
                () -> assertFalse(SILab2.function(user5, allUsers1))
        );
    }
    @Test
    void MultipleConditionTests(){
        assertAll(
                () -> assertFalse(SILab2.function(user1, allUsers1)),
                () -> assertTrue(SILab2.function(user2, allUsers1)),
                () -> assertFalse(SILab2.function(user3, allUsers2)),
                () -> assertFalse(SILab2.function(user7, allUsers2)),
                () -> assertFalse(SILab2.function(user8, allUsers1)),
                () -> assertFalse(SILab2.function(user6, allUsers1))
        );
    }
}