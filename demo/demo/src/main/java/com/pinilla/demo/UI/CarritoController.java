package com.pinilla.demo.UI;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public String verCarrito(Model model) {
        Carrito carrito = carritoService.obtenerCarrito();
        model.addAttribute("carrito", carrito);
        return "carrito";
    }

    @PostMapping("/agregar")
    public String agregarProducto(@RequestParam("productoId") Long productoId, @RequestParam("cantidad") int cantidad) {
        carritoService.agregarProducto(productoId, cantidad);
        return "redirect:/carrito";
        }
        }