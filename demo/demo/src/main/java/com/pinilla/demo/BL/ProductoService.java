package com.pinilla.demo.BL;   
   @Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    // Otros métodos para manejar la lógica de negocio relacionada con productos
}
