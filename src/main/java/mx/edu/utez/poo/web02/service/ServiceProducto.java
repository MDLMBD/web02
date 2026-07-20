package mx.edu.utez.poo.web02.service;

import mx.edu.utez.poo.web02.dao.DaoProducto;
import mx.edu.utez.poo.web02.model.BeanProducto;
import java.util.List;

public class ServiceProducto {
    public List<BeanProducto> consultarProductos(){
        DaoProducto miDao = new DaoProducto();
        List<BeanProducto> listaproductos = miDao.consultarProductos();
        return listaproductos;
    }
}
