package mx.edu.utez.poo.web02.dao;

import mx.edu.utez.poo.web02.model.BeanProducto;
import mx.edu.utez.poo.web02.util.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoProducto {
    public List<BeanProducto> consultarProductos(){
        List<BeanProducto> listaproductos = new ArrayList<>();
        try(Connection conexion = Conexion.getConexion()){;
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("select * from producto");
            while(rs.next()){
                BeanProducto producto = new BeanProducto();
                producto.setId(rs.getInt("ID_PRODUCTO"));
                producto.setNombre(rs.getString("NOMBRE"));
                producto.setPrecio(rs.getDouble("PRECIO"));
                producto.setDescripcion(rs.getString("DESCRIPCION"));
                listaproductos.add(producto);
            }
        }catch(Exception e){
            e.printStackTrace();

        }
        return listaproductos;
    }
}
