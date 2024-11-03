package testSuite.alarma;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class AlarmTestBase {
    @BeforeEach
    public void before(){}

    @AfterEach
    public void after(){
        Session.getInstance().closeApp();
    }
}
