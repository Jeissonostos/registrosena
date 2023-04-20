
package modeldao;

import interfaz.meaprendiz;
import model.aprendiz;


public class aprendizdao {
    public class aprendizdao implements meaprendiz

        @Override
        public aprendiz list(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public list listadoa() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean registraap(aprendiz ap) {
            String sql="insert into aprendizz(docu,nombrea,apellidoa,correoa,numcontacto)values('"+ap.getDocua()+"','"+ap.getNombrea()"','"+ap.getApellidoa()"','"+ap.getCorreoa()"','"+ap.getTeleapre()"')"
            try{
            }catch{
            }
            return false;
        }
      

        @Override
        public boolean actualizarap(aprendiz ap) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean eliminarap(aprendiz ap) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    public class aprendizdao implements meaprendiz
    
}
