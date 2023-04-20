
package interfaz;

import model.aprendiz;


public interface meaprendiz {
    public aprendiz list(int id);
    public list listadoa();
    public boolean registraap(aprendiz ap);
    public boolean actualizarap(aprendiz ap);
    public boolean eliminarap(aprendiz ap);

    public static class list {

        public list() {
        }
    }
    
}
