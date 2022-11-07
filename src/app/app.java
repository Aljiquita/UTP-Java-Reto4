package app;

import util.JDBCUtilities;
import view.ReportesView;
import java.sql.*;
import model.Vo.ComprasDeLiderVo;


public class app {

    public static void main(String[] args) {
        
// -- 1- (consulta 2 de reto 3).
        
        /*
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);
         */

        //---2-Listado del total adeudado en cada proyecto, filtrado por un límite inferior dado (consulta 4 del reto 3).
        /*
        var reportesView = new ReportesView();
        var limiteInferior = 50_000d;
        reportesView.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);
         */
        //--- 3- Listado del top 10 de los líderes que más dinero gastan en sus proyectos para la compra de materiales (consulta 5 del reto 3).
        /*
        var reportesView = new ReportesView(); 
        reportesView. lideresQueMasGastan();
         */
        var reportesView = new ReportesView(); 
        reportesView. lideresQueMasGastan();
        
    }

}
