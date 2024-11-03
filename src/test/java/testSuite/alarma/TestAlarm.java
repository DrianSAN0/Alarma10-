package testSuite.alarma;

import activities.AgregarAlarma;
import activities.Alarma;
import activities.Hora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAlarm  extends AlarmTestBase{
    Alarma alarma = new Alarma();
    AgregarAlarma agregarAlarma = new AgregarAlarma();
    Hora hora = new Hora();

    @Test
    public void addTask()throws  InterruptedException{
        String expectedHour = "3:10 AM";
        alarma.alarma.click();
        agregarAlarma.agregarAlarma.click();
        hora.hora();

        Assertions.assertEquals(expectedHour, hora.getHour().getText(),
                "ERROR: La hora configurada en la alarma no es la esperada.");
    }
}
