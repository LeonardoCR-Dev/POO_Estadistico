//Francisco Javier Portillo Pineda
package Modelo;

import javax.swing.DefaultListModel;

public class OperacionesEstadisticas {

    public float Promedio(float[] vector) {
        float sumatoria = 0;
        float promedio = 0;
        for (int i = 0; i < vector.length; i++) {
            sumatoria += vector[i];
        }
        promedio = sumatoria / vector.length;
        return promedio;
    }

    public float Desviacion(float[] vector) {
        double prom, sum = 0;
        int i, n = vector.length;
        prom = Promedio(vector);
        for (i = 0; i < n; i++) {
            sum += Math.pow(vector[i] - prom, 2);
        }
        float Desviacion = (float) Math.sqrt(sum / (double) n);
        return Desviacion;
    }

    public float GenRegresion(DefaultListModel modelox, DefaultListModel modeloy, float varInd) {
        float SumatoriaArriba = 0.00f;
        float SumatoriaAbajo = 0.00f;
        float divicion = 0.00f;
        float a = 0.00f;
        float y = 0.00f;

        Object[] arreglox = new Object[modelox.size()];
        Object[] arregloy = new Object[modeloy.size()];

        String[] arreglostringx = new String[arreglox.length];
        String[] arreglostringy = new String[arregloy.length];

        float[] arregloNumx = new float[arreglostringx.length];
        float[] arregloNumy = new float[arreglostringy.length];

        for (int i = 0; i < arreglox.length; i++) {
            arreglox[i] = modelox.getElementAt(i);
        }
        for (int j = 0; j < arreglox.length; j++) {
            arreglostringx[j] = arreglox[j].toString();
        }
        for (int k = 0; k < arreglostringx.length; k++) {
            arregloNumx[k] = Float.parseFloat(arreglostringx[k]);
        }
        for (int i = 0; i < arregloy.length; i++) {
            arregloy[i] = modeloy.getElementAt(i);
        }
        for (int j = 0; j < arregloy.length; j++) {
            arreglostringy[j] = arregloy[j].toString();
        }
        for (int k = 0; k < arreglostringy.length; k++) {
            arregloNumy[k] = Float.parseFloat(arreglostringy[k]);
        }

        for (int i = 0; i < arregloNumx.length; i++) {
            SumatoriaAbajo += ((arregloNumx[i] - Promedio(arregloNumx)) * (arregloNumx[i] - Promedio(arregloNumx)));
            SumatoriaArriba += ((arregloNumx[i] - Promedio(arregloNumx)) * (arregloNumy[i] - Promedio(arregloNumy)));
        }
        divicion = SumatoriaAbajo / SumatoriaAbajo;
        a = (Promedio(arregloNumy)) - ((divicion) * Promedio(arregloNumx));
        y = ((a) + (divicion) * (varInd));

        return y;
    }

    public float GenCorrelacion(DefaultListModel modelox, DefaultListModel modeloy) {
        String correlacion = "";
        float SumatoriaArriba = 0.00f;
        float divicion = 0.00f;
        float a = 0.00f;
        float y = 0.00f;

        Object[] arreglox = new Object[modelox.size()];
        Object[] arregloy = new Object[modeloy.size()];

        String[] arreglostringx = new String[arreglox.length];
        String[] arreglostringy = new String[arregloy.length];

        float[] arregloNumx = new float[arreglostringx.length];
        float[] arregloNumy = new float[arreglostringy.length];

        for (int i = 0; i < arreglox.length; i++) {
            arreglox[i] = modelox.getElementAt(i);
        }
        for (int j = 0; j < arreglox.length; j++) {
            arreglostringx[j] = arreglox[j].toString();
        }
        for (int k = 0; k < arreglostringx.length; k++) {
            arregloNumx[k] = Float.parseFloat(arreglostringx[k]);
        }
        for (int i = 0; i < arregloy.length; i++) {
            arregloy[i] = modeloy.getElementAt(i);
        }
        for (int j = 0; j < arregloy.length; j++) {
            arreglostringy[j] = arregloy[j].toString();
        }
        for (int k = 0; k < arreglostringy.length; k++) {
            arregloNumy[k] = Float.parseFloat(arreglostringy[k]);
        }

        for (int i = 0; i < arregloNumx.length; i++) {
            SumatoriaArriba += ((arregloNumx[i] - Promedio(arregloNumx)) * (arregloNumy[i] - Promedio(arregloNumy)));
        }
        divicion = SumatoriaArriba / ((arregloNumx.length) * (Desviacion(arregloNumx)) * (Desviacion(arregloNumy)));
        return divicion;
    }

    public float GenCovarianza(DefaultListModel modelox, DefaultListModel modeloy) {
        String correlacion = "";
        float SumatoriaArriba = 0.00f;
        float covarianza = 0.00f;
        float a = 0.00f;
        float y = 0.00f;

        Object[] arreglox = new Object[modelox.size()];
        Object[] arregloy = new Object[modeloy.size()];

        String[] arreglostringx = new String[arreglox.length];
        String[] arreglostringy = new String[arregloy.length];

        float[] arregloNumx = new float[arreglostringx.length];
        float[] arregloNumy = new float[arreglostringy.length];

        for (int i = 0; i < arreglox.length; i++) {
            arreglox[i] = modelox.getElementAt(i);
        }
        for (int j = 0; j < arreglox.length; j++) {
            arreglostringx[j] = arreglox[j].toString();
        }
        for (int k = 0; k < arreglostringx.length; k++) {
            arregloNumx[k] = Float.parseFloat(arreglostringx[k]);
        }
        for (int i = 0; i < arregloy.length; i++) {
            arregloy[i] = modeloy.getElementAt(i);
        }
        for (int j = 0; j < arregloy.length; j++) {
            arreglostringy[j] = arregloy[j].toString();
        }
        for (int k = 0; k < arreglostringy.length; k++) {
            arregloNumy[k] = Float.parseFloat(arreglostringy[k]);
        }

        for (int i = 0; i < arregloNumx.length; i++) {
            SumatoriaArriba += ((arregloNumx[i] - Promedio(arregloNumx)) * (arregloNumy[i] - Promedio(arregloNumy)));
        }
        float cov = (float) ((1.00 / arregloNumx.length) * (SumatoriaArriba));
        return cov;
    }
}
