

package org.primefaces.showcase.view.button;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {

    private String text;
    /*
    private operacion{
        String numero1;
        String numero2;
        String operador;
    };
    */
 
    public String getText() {
            return text;
    }
    public void setText(String text) {
            this.text = text;
    }
        
    public void buttonAction(ActionEvent actionEvent) {
        String nombreCampo =actionEvent.getComponent().getId();
        String id = nombreCampo.substring(1,2);
        String tabla = getText();
        if(tabla == null)
        {
            tabla = id;
        }
        else
        {
            tabla = tabla+id;
        }
        
        setText(tabla);
    }

     
}