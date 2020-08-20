
package com.ujcm.practicab.modelo;

public class Detalle {
    private int id;
    private Padre padre;
    private Hijo hijo;

    public Detalle() {
    }

    public Detalle(Padre padre, Hijo hijo) {
        this.padre = padre;
        this.hijo = hijo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }
    
}
