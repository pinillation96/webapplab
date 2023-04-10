package com.pinilla.demo.UI;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public String listaProductos(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "productos";
    }

    // Más métodos para manejar otras acciones relacionadas con productos
}
