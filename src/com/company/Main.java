package com.company;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class Main {

        @Test
        public void testAddToMap() {
            // Stvaranje mock objekta mape
            Map<String, String> map = mock(Map.class);

            // Simulacija dodavanja ključa-vrijednosti u mapu
            when(map.put("kljuc", "vrijednost")).thenReturn("staraVrijednost");

            // Testiranje metode koja koristi mapu
            MyClass myClass = new MyClass(map);
            String staraVrijednost = myClass.addToMap("kljuc", "vrijednost");

            // Provjeravanje da li je metoda ispravno pozvana
            verify(map).put("kljuc", "vrijednost");

            // Provjera povratne vrijednosti
            assertEquals("staraVrijednost", staraVrijednost);
        }


}
