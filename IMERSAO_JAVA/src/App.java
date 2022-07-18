import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Conexão HTTP

        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

        var enderco = URI.create(url);

        var Client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(enderco).GET().build();

        Client.send(request, BodyHandler.ofString());

    }
}
