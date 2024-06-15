import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void geradorDeArquivo(Adress endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            String formatData = endereco.cep().replace("-", "_");
            FileWriter escrita = new FileWriter(formatData + ".json");
            escrita.write(gson.toJson(endereco));
            escrita.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
