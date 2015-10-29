

package org.primefaces.showcase.view.button;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {

    private String text;
 
    public String getText() {
            return text;
    }
    public void setText(String text) {
            this.text = text;
    }
    Operacion oper = new Operacion();
        
    public void buttonAction(ActionEvent actionEvent) {
        String nombreCampo =actionEvent.getComponent().getId();
        String id = nombreCampo.substring(1,2);
        String tabla = getText();
        oper = Modificaion(oper,id,tabla);
        validTablero(id,tabla);
        
    }
    public Operacion Modificaion(Operacion opr,String id,String tabla)
    {
        if(id.equals("D") || id.equals("M") || id.equals("S") || id.equals("R") || id.equals("I") || id.equals("P"))
        {
            if(tabla.length() != 0)
            {
                if(opr.numero1.length()==0)
                {
                    opr.numero1 = tabla;
                    opr.operador = id;
                }
            }
        }
        return opr;
    }
    public void validTablero(String id,String tabla)
    {
        if(id.equals("D") || id.equals("M") || id.equals("S") || id.equals("R") || id.equals("I") || id.equals("P"))
        {
            if(tabla.length() == 0)
            {
                id = "";
            }
        }
        if(tabla == null){tabla = id;}
        else{tabla = tabla+id;}
        setText(tabla);
    }
     
}