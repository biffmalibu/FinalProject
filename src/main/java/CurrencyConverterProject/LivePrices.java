/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package CurrencyConverterProject;


import java.io.InputStreamReader; // Imports for API
import java.net.URL;

import com.google.gson.JsonElement; // Import GSON elements
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException; // Import exceptions
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;


// This class contains methods to obtain the live values of currencies.
public class LivePrices {

    public String getCryptoPrice(String coin, String currency) { // This method gets the live values for cryptocurrencies and returns it as a string
        try {
            URL url = new URL("https://api.coingecko.com/api/v3/simple/price?ids=" + coin + "&vs_currencies=" + currency);

            InputStreamReader read = new InputStreamReader(url.openStream());

            
            JsonElement element = JsonParser.parseReader(read); // Parse JSON
            JsonObject elementObj = element.getAsJsonObject();
            JsonObject coinObj = elementObj.getAsJsonObject(coin);
            String price = coinObj.get(currency.toLowerCase()).getAsString();
            
            return price; // return value
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "API ERROR", ex);
        }

        return "API ERROR";
    }
  // This method gets the live values for currencies using a base rate and returns it as a string
    public String getExchangeRate(String base, String currency) {
        // Fetch the exchange rates from the API
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/d6f7aed73204cdd2df42ff58/latest/" + base);
            InputStreamReader read = new InputStreamReader(url.openStream());
            JsonElement element = new JsonParser().parse(read); // parse JSON
            JsonObject elementObj = element.getAsJsonObject();
   
            
            JsonObject rates = elementObj.getAsJsonObject("conversion_rates");
            double rate = rates.get(currency).getAsDouble();
            return Double.toString(rate); // return value
        }
        catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "API ERROR", ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "API ERROR", ex);
        }
        return "API ERROR";
    }
    
      
    
    
}
