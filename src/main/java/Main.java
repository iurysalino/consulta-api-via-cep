import br.com.test.api.via.cep.service.RecuperaCepService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RecuperaCepService.recuperaEnderecoCep(Long.valueOf(20060030));
    }
}
