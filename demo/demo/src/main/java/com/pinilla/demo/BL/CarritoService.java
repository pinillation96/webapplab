package com.pinilla.demo.BL;

package com.myapp.service;

import com.myapp.model.entity.Carrito;
import com.myapp.model.entity.CarritoItem;
import com.myapp.model.entity.Producto;
import com.myapp.model.repository.CarritoRepository;
import com.myapp.model.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public Carrito obtenerCarritoActual() {
        // Aquí puedes implementar la lógica para obtener el carrito actual
        // Por ejemplo, podrías buscar el carrito en la sesión del usuario
        // En este ejemplo, simplemente crearemos un nuevo carrito vacío
        return new Carrito();
    }

    public Carrito agregarProductoAlCarrito(Carrito carrito, Long productoId, Integer cantidad) {
        Optional<Producto> productoOptional = productoRepository.findById(productoId);

        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();

            CarritoItem carritoItem = new CarritoItem();
            carritoItem.setProducto(producto);
            carritoItem.setCantidad(cantidad);
            carritoItem.setCarrito(carrito);

            carrito.getItems().add(carritoItem);
            carritoRepository.save(carrito);
        }

        return carrito;
    }
}
