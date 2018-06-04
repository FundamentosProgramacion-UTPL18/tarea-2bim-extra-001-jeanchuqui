/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextra2bim;

/**
 *
 * @author Usuario
 */
public class TareaExtra2Bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        double suma = 0;

        for (int a = 0; a < 3; a++) {
            System.out.printf("\t\t%s", meses[a]);
        }
        System.out.println("\tTotal\t\tPromedio");

        for (int contador = 0; contador < 4; contador++) {

            venta_total_sucursal[contador] = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            venta_promedio_sucursal[contador] = venta_total_sucursal[contador] / 3;
            suma = suma + venta_total_sucursal[contador];

            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);
        }
        System.out.printf("\nTotales de ventas de todas la sucursales es: %.1f", suma);
    }

}
