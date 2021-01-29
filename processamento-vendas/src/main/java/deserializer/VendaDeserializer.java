package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Venda;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class VendaDeserializer implements Deserializer<Venda> {

    public Venda deserialize(String s, byte[] venda) {
        try {
            return new ObjectMapper().readValue(venda, Venda.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {

    }
}
