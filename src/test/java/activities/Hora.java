package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class Hora {
    public Button hora = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]"));
    public Button minutos = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"10\"]"));
    public Button am = new Button(By.xpath("//android.widget.RadioButton[@resource-id=\"android:id/am_label\"]"));
    public Button ok = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));

    public void hora(){
        hora.click();
        minutos.click();
        am.click();
        ok.click();
    }
    public Label getHour(){
        Label comHour = new Label(By.xpath("//android.widget.TextView[@content-desc=\"3:10 AM\"]"));
        return  comHour;
    }
    }


