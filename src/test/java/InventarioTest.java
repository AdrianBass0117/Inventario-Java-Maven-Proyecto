import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void calculaSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularValorTotal(50, 4);
        assertEquals(200, resultado);
    }
}
