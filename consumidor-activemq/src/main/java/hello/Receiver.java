package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "prueba.cola", containerFactory = "myFactory")
    public void receiveMessage(Persona persona) {
        System.out.println("Received <" + persona + ">");
        
    }

}
