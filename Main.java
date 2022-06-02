import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream name = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(name)
            );
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }}