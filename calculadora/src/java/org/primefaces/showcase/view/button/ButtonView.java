

package org.primefaces.showcase.view.button;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {
    private int ban;
    private int posi;
    public String resp;
    private String text;
 
    public String getText() {
            return text;
    }
    public void setText(String text) {
            this.text = text;
    }    
    
        
    public void buttonAction(ActionEvent actionEvent) {
        ban = 0;
        
        String nombreCampo =actionEvent.getComponent().getId();
        String id = nombreCampo.substring(1,2);
        String tabla = getText();
        Modificaion(id,tabla);
        validTablero(id,tabla);
    }
    public void Modificaion(String id,String tabla)
    {
        String cade;
        if(id.equals("D") || id.equals("M") || id.equals("S") || id.equals("R") || id.equals("I") || id.equals("P"))
        {
            if(id.equals("I"))
            {
                if(tabla.indexOf("/") != -1 || tabla.indexOf("*") != -1 || tabla.indexOf("+") != -1 || tabla.indexOf("-") != -1)
                {
                    posi = buscarCaracter(tabla);
                    if(tabla.length() > posi+1)
                    {
                        resp=cuadrarDatos(tabla,posi);
                    }
                    ban = 2;
                }
            }
            else
            {
                if(tabla.indexOf("/") != -1 || tabla.indexOf("*") != -1 || tabla.indexOf("+") != -1 || tabla.indexOf("-") != -1)
                {
                    ban = 1;
                }
            }
        }
    }
    public String cuadrarDatos(String tabla,int posi)
    {
        int num1,num2;
        int total = tabla.length();
        num1 = Integer.parseInt(tabla.substring(0,posi));
        num2 = Integer.parseInt(tabla.substring(posi+1,total));
        double Total =  opera(num1,num2,tabla.substring(posi,posi+1));
        String tot = new Double(Total).toString();
        return tot;
    }
    public double opera(int num1,int num2,String operador)
    {
        double total = 0;
        switch(operador){
            case "/":
                total = num1 / num2;
            break;
            case "*":
                total = num1 * num2;
            break;
            case "+":
                total = num1 + num2;
            break;
            case "-":
                total = num1 - num2;
            break;
        }
        return total;
    }
    public int buscarCaracter(String tabla){
        int con = 0;
        if(tabla.indexOf("/") != -1)
        {
            return tabla.indexOf("/");    
        }  
        if(tabla.indexOf("*") != -1)
        {
            return tabla.indexOf("*");    
        }   
        if(tabla.indexOf("-") != -1)
        {
            return tabla.indexOf("-");    
        }   
        if(tabla.indexOf("+") != -1)
        {
            return tabla.indexOf("+");    
        }   
        return con;
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
        if(tabla == null)
            {tabla = id;}
        else
        {
            if(ban == 0)
            {
            tabla = tabla+letra(id);
            }
            if(ban == 2)
            {
              tabla=  resp;
            }
        }
        setText(tabla);
    }
    public String letra(String id)
    {
        String retur = null;
        switch(id){
            case "D":
                retur= "/";
            break;
            case "M":
                retur= "*";
            break;
            case "S":
                retur= "+";
            break;
            case "R":
                retur= "-";
            break;
            default: retur = id;
            break;
        }
        return retur;
    }
     
}