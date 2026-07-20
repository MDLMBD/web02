package mx.edu.utez.poo.web02.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.poo.web02.model.BeanProducto;
import mx.edu.utez.poo.web02.service.ServiceProducto;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "servletConsultarProductos", value = "/servlet-consultar-productos")
public class ServletConsultarProductos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceProducto miServicio = new ServiceProducto();
        List<BeanProducto> listaProductos = miServicio.consultarProductos();

        req.setAttribute("listaProductos", listaProductos);
        req.getRequestDispatcher("WEB-INF/consultar-productos.jsp").forward(req, resp);
    }
}
