

package org.primefaces.showcase.view.button;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {
     
    public void buttonAction(ActionEvent actionEvent) {
        
        String nombreCampo =actionEvent.getComponent().getId();
        String id = nombreCampo.substring(nombreCampo.indexOf("B"),1);
        
    }
     
}